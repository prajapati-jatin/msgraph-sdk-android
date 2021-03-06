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
 * The class for the Base Drive Item Copy Request Builder.
 */
public class BaseDriveItemCopyRequestBuilder extends BasePostMethodRequestBuilder {

    /**
     * The request builder for this DriveItemCopy
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param options The options for this request
     */
    public BaseDriveItemCopyRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> options, final String name, final ItemReference parentReference) {
        super(requestUrl, client, options);
        mBodyParams.put("name", name);
        mBodyParams.put("parentReference", parentReference);
    }

    /**
     * Creates the IDriveItemCopyRequest
     *
     * @return The IDriveItemCopyRequest instance
     */
    public IDriveItemCopyRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IDriveItemCopyRequest with specific options instead of the existing options
     *
     * @param options the options for the request
     * @return The IDriveItemCopyRequest instance
     */
    public IDriveItemCopyRequest buildRequest(final List<Option> options) {
        DriveItemCopyRequest request = new DriveItemCopyRequest(
                getRequestUrl(),
                getClient(),
                options
        );

        if (hasParameter("name")) {
            request.mBody.name = getParameter("name");
        }
        if (hasParameter("parentReference")) {
            request.mBody.parentReference = getParameter("parentReference");
        }

        return request;
    }
}
