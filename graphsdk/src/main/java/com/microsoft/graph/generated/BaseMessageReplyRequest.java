// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.extensions.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.List;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Message Reply Request.
 */
public class BaseMessageReplyRequest extends BaseRequest implements IBaseMessageReplyRequest {
    protected final MessageReplyBody mBody;

    /**
     * The request for this MessageReply
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param options The options for this request
     */
    public BaseMessageReplyRequest(final String requestUrl, final IBaseClient client, final List<Option> options) {
        super(requestUrl, client, options, Void.class);
        mBody = new MessageReplyBody();
    }

    public void post(final ICallback<Void> callback) {
        send(HttpMethod.POST, callback, mBody);
    }

    public Void post() throws ClientException {
        return send(HttpMethod.POST, mBody);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    public IMessageReplyRequest select(final String value) {
        getQueryOptions().add(new QueryOption("$select", value));
        return (MessageReplyRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value The max number of items to return
     * @return The updated request
     */
    public IMessageReplyRequest top(final int value) {
        getQueryOptions().add(new QueryOption("$top", value+""));
        return (MessageReplyRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    public IMessageReplyRequest expand(final String value) {
        getQueryOptions().add(new QueryOption("$expand", value));
        return (MessageReplyRequest)this;
    }

}
