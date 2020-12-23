/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.resilience4j;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.spi.CircuitBreakerConstants;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.junit.Test;

import java.util.concurrent.TimeoutException;

public class ResilienceRouteFallbackTest extends CamelTestSupport {

    @Test
    public void testResilience() throws Exception {
        test("direct:start");
    }

    @Test
    public void testResilienceWithTimeOut() throws Exception {
        test("direct:start.with.timeout.enabled");
    }

    private void test(String endPointUri) throws Exception {
        getMockEndpoint("mock:result").expectedBodiesReceived("Fallback message");
        getMockEndpoint("mock:result").expectedPropertyReceived(CircuitBreakerConstants.RESPONSE_SUCCESSFUL_EXECUTION, false);
        getMockEndpoint("mock:result").expectedPropertyReceived(CircuitBreakerConstants.RESPONSE_FROM_FALLBACK, true);

        template.sendBody(endPointUri, "Hello World");

        assertMockEndpointsSatisfied();
    }

    @Override
    protected RouteBuilder createRouteBuilder() throws Exception {
        return new RouteBuilder() {
            @Override
            public void configure() throws Exception {
                from("direct:start").to("log:start").circuitBreaker().throwException(new IllegalArgumentException("Forced")).onFallback().transform().constant("Fallback message")
                    .end().to("log:result").to("mock:result");

                from("direct:start.with.timeout.enabled").to("log:start.with.timeout.enabled").circuitBreaker().resilience4jConfiguration().timeoutEnabled(true).timeoutDuration(2000).end().throwException(new TimeoutException("Forced")).onFallback().transform().constant("Fallback message")
                        .end().to("log:result").to("mock:result");
            }
        };
    }

}
