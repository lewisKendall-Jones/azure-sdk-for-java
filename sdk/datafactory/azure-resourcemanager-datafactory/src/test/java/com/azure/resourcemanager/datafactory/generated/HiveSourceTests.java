// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.HiveSource;

public final class HiveSourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        HiveSource model =
            BinaryData
                .fromString(
                    "{\"type\":\"HiveSource\",\"query\":\"datamabehrfyskzwt\",\"queryTimeout\":\"datazvhz\",\"additionalColumns\":\"datac\",\"sourceRetryCount\":\"datasoxoavlwwpv\",\"sourceRetryWait\":\"datanjwvc\",\"maxConcurrentConnections\":\"datarqlceflgsndur\",\"disableMetricsCollection\":\"dataozjwm\",\"\":{\"wzzzimgbxjgx\":\"dataehjlozzcwokuxedp\",\"dfmdjnfeealp\":\"datahajrubcvucve\"}}")
                .toObject(HiveSource.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        HiveSource model =
            new HiveSource()
                .withSourceRetryCount("datasoxoavlwwpv")
                .withSourceRetryWait("datanjwvc")
                .withMaxConcurrentConnections("datarqlceflgsndur")
                .withDisableMetricsCollection("dataozjwm")
                .withQueryTimeout("datazvhz")
                .withAdditionalColumns("datac")
                .withQuery("datamabehrfyskzwt");
        model = BinaryData.fromObject(model).toObject(HiveSource.class);
    }
}
