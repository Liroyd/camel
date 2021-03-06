/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.atmos;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class AtmosEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        AtmosEndpoint target = (AtmosEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "fulltokenid":
        case "fullTokenId": target.getConfiguration().setFullTokenId(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "localpath":
        case "localPath": target.getConfiguration().setLocalPath(property(camelContext, java.lang.String.class, value)); return true;
        case "newremotepath":
        case "newRemotePath": target.getConfiguration().setNewRemotePath(property(camelContext, java.lang.String.class, value)); return true;
        case "query": target.getConfiguration().setQuery(property(camelContext, java.lang.String.class, value)); return true;
        case "remotepath":
        case "remotePath": target.getConfiguration().setRemotePath(property(camelContext, java.lang.String.class, value)); return true;
        case "secretkey":
        case "secretKey": target.getConfiguration().setSecretKey(property(camelContext, java.lang.String.class, value)); return true;
        case "sslvalidation":
        case "sslValidation": target.getConfiguration().setSslValidation(property(camelContext, boolean.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "uri": target.getConfiguration().setUri(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "exceptionhandler":
        case "exceptionHandler": return org.apache.camel.spi.ExceptionHandler.class;
        case "exchangepattern":
        case "exchangePattern": return org.apache.camel.ExchangePattern.class;
        case "fulltokenid":
        case "fullTokenId": return java.lang.String.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "localpath":
        case "localPath": return java.lang.String.class;
        case "newremotepath":
        case "newRemotePath": return java.lang.String.class;
        case "query": return java.lang.String.class;
        case "remotepath":
        case "remotePath": return java.lang.String.class;
        case "secretkey":
        case "secretKey": return java.lang.String.class;
        case "sslvalidation":
        case "sslValidation": return boolean.class;
        case "synchronous": return boolean.class;
        case "uri": return java.lang.String.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        AtmosEndpoint target = (AtmosEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "fulltokenid":
        case "fullTokenId": return target.getConfiguration().getFullTokenId();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "localpath":
        case "localPath": return target.getConfiguration().getLocalPath();
        case "newremotepath":
        case "newRemotePath": return target.getConfiguration().getNewRemotePath();
        case "query": return target.getConfiguration().getQuery();
        case "remotepath":
        case "remotePath": return target.getConfiguration().getRemotePath();
        case "secretkey":
        case "secretKey": return target.getConfiguration().getSecretKey();
        case "sslvalidation":
        case "sslValidation": return target.getConfiguration().isSslValidation();
        case "synchronous": return target.isSynchronous();
        case "uri": return target.getConfiguration().getUri();
        default: return null;
        }
    }
}

