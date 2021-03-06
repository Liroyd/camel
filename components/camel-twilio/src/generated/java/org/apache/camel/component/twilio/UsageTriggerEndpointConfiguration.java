
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.twilio;

import org.apache.camel.spi.ApiMethod;
import org.apache.camel.spi.ApiParam;
import org.apache.camel.spi.ApiParams;
import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel endpoint configuration for {@link com.twilio.rest.api.v2010.account.usage.Trigger}.
 */
@ApiParams(apiName = "usage-trigger", 
           description = "",
           apiMethods = {@ApiMethod(methodName = "creator", description="Create a TriggerCreator to execute create", signatures={"com.twilio.rest.api.v2010.account.usage.TriggerCreator creator(java.net.URI callbackUrl, String triggerValue, com.twilio.rest.api.v2010.account.usage.Trigger$UsageCategory usageCategory)", "com.twilio.rest.api.v2010.account.usage.TriggerCreator creator(String pathAccountSid, java.net.URI callbackUrl, String triggerValue, com.twilio.rest.api.v2010.account.usage.Trigger$UsageCategory usageCategory)"}), @ApiMethod(methodName = "deleter", description="Create a TriggerDeleter to execute delete", signatures={"com.twilio.rest.api.v2010.account.usage.TriggerDeleter deleter(String pathSid)", "com.twilio.rest.api.v2010.account.usage.TriggerDeleter deleter(String pathAccountSid, String pathSid)"}), @ApiMethod(methodName = "fetcher", description="Create a TriggerFetcher to execute fetch", signatures={"com.twilio.rest.api.v2010.account.usage.TriggerFetcher fetcher(String pathSid)", "com.twilio.rest.api.v2010.account.usage.TriggerFetcher fetcher(String pathAccountSid, String pathSid)"}), @ApiMethod(methodName = "reader", description="Create a TriggerReader to execute read", signatures={"com.twilio.rest.api.v2010.account.usage.TriggerReader reader()", "com.twilio.rest.api.v2010.account.usage.TriggerReader reader(String pathAccountSid)"}), @ApiMethod(methodName = "updater", description="Create a TriggerUpdater to execute update", signatures={"com.twilio.rest.api.v2010.account.usage.TriggerUpdater updater(String pathSid)", "com.twilio.rest.api.v2010.account.usage.TriggerUpdater updater(String pathAccountSid, String pathSid)"}), }, aliases = {"^creator$=create", "^deleter$=delete", "^fetcher$=fetch", "^reader$=read", "^updater$=update"})
@UriParams
@Configurer(extended = true)
public final class UsageTriggerEndpointConfiguration extends TwilioConfiguration {
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "creator", description="The URL we call when the trigger fires")})
    private java.net.URI callbackUrl;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "creator", description="The SID of the Account that will create the resource"), @ApiMethod(methodName = "deleter", description="The SID of the Account that created the resources to delete"), @ApiMethod(methodName = "fetcher", description="The SID of the Account that created the resource to fetch"), @ApiMethod(methodName = "reader", description="The SID of the Account that created the resources to read"), @ApiMethod(methodName = "updater", description="The SID of the Account that created the resources to update")})
    private String pathAccountSid;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "deleter", description="The unique string that identifies the resource"), @ApiMethod(methodName = "fetcher", description="The unique string that identifies the resource"), @ApiMethod(methodName = "updater", description="The unique string that identifies the resource")})
    private String pathSid;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "creator", description="The usage value at which the trigger should fire")})
    private String triggerValue;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "creator", description="The usage category the trigger watches")})
    private com.twilio.rest.api.v2010.account.usage.Trigger.UsageCategory usageCategory;

    public java.net.URI getCallbackUrl() {
        return callbackUrl;
    }

    public void setCallbackUrl(java.net.URI callbackUrl) {
        this.callbackUrl = callbackUrl;
    }

    public String getPathAccountSid() {
        return pathAccountSid;
    }

    public void setPathAccountSid(String pathAccountSid) {
        this.pathAccountSid = pathAccountSid;
    }

    public String getPathSid() {
        return pathSid;
    }

    public void setPathSid(String pathSid) {
        this.pathSid = pathSid;
    }

    public String getTriggerValue() {
        return triggerValue;
    }

    public void setTriggerValue(String triggerValue) {
        this.triggerValue = triggerValue;
    }

    public com.twilio.rest.api.v2010.account.usage.Trigger.UsageCategory getUsageCategory() {
        return usageCategory;
    }

    public void setUsageCategory(com.twilio.rest.api.v2010.account.usage.Trigger.UsageCategory usageCategory) {
        this.usageCategory = usageCategory;
    }
}
