/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.braintree;

import java.net.URISyntaxException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.camel.spi.EndpointUriFactory;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
public class BraintreeEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":apiName/methodName";

    private static final Set<String> PROPERTY_NAMES;
    private static final Set<String> SECRET_PROPERTY_NAMES;
    static {
        Set<String> props = new HashSet<>(46);
        props.add("basicPropertyBinding");
        props.add("request");
        props.add("searchRequest");
        props.add("apiName");
        props.add("httpReadTimeout");
        props.add("signature");
        props.add("synchronous");
        props.add("groupByCustomField");
        props.add("publicKey");
        props.add("httpLogName");
        props.add("content");
        props.add("grantRequest");
        props.add("logHandlerEnabled");
        props.add("proxyPort");
        props.add("textEvidenceRequest");
        props.add("fileEvidenceRequest");
        props.add("associationFilterId");
        props.add("paymentMethodToken");
        props.add("merchantId");
        props.add("payload");
        props.add("customerId");
        props.add("httpLogLevel");
        props.add("id");
        props.add("submitForSettlement");
        props.add("currencyRequest");
        props.add("amount");
        props.add("query");
        props.add("methodName");
        props.add("settlementDate");
        props.add("accessToken");
        props.add("proxyHost");
        props.add("token");
        props.add("privateKey");
        props.add("environment");
        props.add("lazyStartProducer");
        props.add("refundRequest");
        props.add("disputeId");
        props.add("evidenceId");
        props.add("paymentMethodNonce");
        props.add("challenge");
        props.add("documentId");
        props.add("page");
        props.add("subscriptionId");
        props.add("inBody");
        props.add("deleteRequest");
        props.add("cloneRequest");
        PROPERTY_NAMES = Collections.unmodifiableSet(props);
        Set<String> secretProps = new HashSet<>(3);
        secretProps.add("privateKey");
        secretProps.add("publicKey");
        secretProps.add("accessToken");
        SECRET_PROPERTY_NAMES = Collections.unmodifiableSet(secretProps);
    }

    @Override
    public boolean isEnabled(String scheme) {
        return "braintree".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "apiName", null, true, copy);
        uri = buildPathParameter(syntax, uri, "methodName", null, true, copy);
        uri = buildQueryParameters(uri, copy);
        return uri;
    }

    @Override
    public Set<String> propertyNames() {
        return PROPERTY_NAMES;
    }

    @Override
    public Set<String> secretPropertyNames() {
        return SECRET_PROPERTY_NAMES;
    }

    @Override
    public boolean isLenientProperties() {
        return false;
    }
}

