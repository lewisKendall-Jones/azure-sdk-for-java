// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.TriggerSubscriptionOperationStatusInner;

public final class TriggerSubscriptionOperationStatusInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        TriggerSubscriptionOperationStatusInner model =
            BinaryData
                .fromString("{\"triggerName\":\"n\",\"status\":\"Provisioning\"}")
                .toObject(TriggerSubscriptionOperationStatusInner.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        TriggerSubscriptionOperationStatusInner model = new TriggerSubscriptionOperationStatusInner();
        model = BinaryData.fromObject(model).toObject(TriggerSubscriptionOperationStatusInner.class);
    }
}
