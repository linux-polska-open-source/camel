/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.zendesk;

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
public class ZendeskEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":methodName";

    private static final Set<String> PROPERTY_NAMES;
    private static final Set<String> SECRET_PROPERTY_NAMES;
    static {
        Set<String> props = new HashSet<>(142);
        props.add("includeArchived");
        props.add("fileName");
        props.add("userIdThatWillRemain");
        props.add("upload");
        props.add("synchronous");
        props.add("ticketId0");
        props.add("type");
        props.add("organizationId");
        props.add("userIdThatWillBeMerged");
        props.add("password");
        props.add("userList");
        props.add("serverUrl");
        props.add("sortBy");
        props.add("id");
        props.add("scheduledExecutorService");
        props.add("scheduleId");
        props.add("order");
        props.add("item");
        props.add("targetId");
        props.add("schedulerProperties");
        props.add("newPassword");
        props.add("organizationMembershipList");
        props.add("params");
        props.add("backoffIdleThreshold");
        props.add("tags");
        props.add("labels");
        props.add("itemId");
        props.add("organization_membership_id");
        props.add("macroId");
        props.add("delay");
        props.add("field");
        props.add("translationId");
        props.add("startScheduler");
        props.add("user_id");
        props.add("sortOrder");
        props.add("commentId");
        props.add("inBody");
        props.add("ticketId");
        props.add("status");
        props.add("automationId");
        props.add("ticketList");
        props.add("attachments");
        props.add("role");
        props.add("unixEpochTime");
        props.add("articleId0");
        props.add("automationId0");
        props.add("tweetId");
        props.add("userSegment");
        props.add("forum_id");
        props.add("useFixedDelay");
        props.add("file");
        props.add("category_id");
        props.add("runLoggingLevel");
        props.add("organizationMembership");
        props.add("identity");
        props.add("requestId");
        props.add("audit");
        props.add("articleAttachments");
        props.add("startTime");
        props.add("email");
        props.add("notifySubscribers");
        props.add("monitorId");
        props.add("sectionId");
        props.add("trigger");
        props.add("userId");
        props.add("token");
        props.add("pollStrategy");
        props.add("ticketForm");
        props.add("organization");
        props.add("endTime");
        props.add("installationId");
        props.add("usersList");
        props.add("organizationList");
        props.add("section");
        props.add("initialDelay");
        props.add("macroId0");
        props.add("userId0");
        props.add("bridgeErrorHandler");
        props.add("automation");
        props.add("searchTerm");
        props.add("variant");
        props.add("greedy");
        props.add("organizationMemberships");
        props.add("contentType");
        props.add("repeatCount");
        props.add("group");
        props.add("oldPassword");
        props.add("sendEmptyMessageWhenIdle");
        props.add("triggerId");
        props.add("query");
        props.add("article");
        props.add("users");
        props.add("lazyStartProducer");
        props.add("organization_id");
        props.add("name");
        props.add("topic");
        props.add("ids");
        props.add("statuses");
        props.add("page");
        props.add("groupMembership");
        props.add("exceptionHandler");
        props.add("parameters");
        props.add("satisfactionRating");
        props.add("basicPropertyBinding");
        props.add("backoffMultiplier");
        props.add("auditId");
        props.add("request");
        props.add("group_membership_id");
        props.add("idArticle");
        props.add("tickets");
        props.add("roles");
        props.add("locale");
        props.add("content");
        props.add("scheduler");
        props.add("attachment");
        props.add("backoffErrorThreshold");
        props.add("triggerId0");
        props.add("json");
        props.add("suspendedTicket");
        props.add("timeUnit");
        props.add("macro");
        props.add("ticket");
        props.add("exchangePattern");
        props.add("articleId");
        props.add("methodName");
        props.add("externalId");
        props.add("oauthToken");
        props.add("ticketImport");
        props.add("target");
        props.add("forum");
        props.add("schedule");
        props.add("inline");
        props.add("group_id");
        props.add("permissionGroup");
        props.add("identityId");
        props.add("translation");
        props.add("organizations");
        props.add("comment");
        props.add("category");
        props.add("user");
        props.add("categoryId");
        props.add("username");
        PROPERTY_NAMES = Collections.unmodifiableSet(props);
        Set<String> secretProps = new HashSet<>(4);
        secretProps.add("password");
        secretProps.add("oauthToken");
        secretProps.add("token");
        secretProps.add("username");
        SECRET_PROPERTY_NAMES = Collections.unmodifiableSet(secretProps);
    }

    @Override
    public boolean isEnabled(String scheme) {
        return "zendesk".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

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

