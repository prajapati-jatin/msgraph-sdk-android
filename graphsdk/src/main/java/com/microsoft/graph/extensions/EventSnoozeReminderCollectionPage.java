// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.extensions;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.extensions.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.List;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Event Snooze Reminder Collection Page.
 */
public class EventSnoozeReminderCollectionPage extends BaseEventSnoozeReminderCollectionPage implements IEventSnoozeReminderCollectionPage {

    /**
     * A collection page for Event.
     *
     * @param response The serialized BaseEventSnoozeReminderCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public EventSnoozeReminderCollectionPage(final BaseEventSnoozeReminderCollectionResponse response, final IEventSnoozeReminderRequestBuilder builder) {
        super(response, builder);
    }

}