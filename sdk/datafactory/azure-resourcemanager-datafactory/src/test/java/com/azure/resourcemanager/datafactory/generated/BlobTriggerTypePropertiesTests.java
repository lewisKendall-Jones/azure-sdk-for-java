// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.BlobTriggerTypeProperties;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class BlobTriggerTypePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        BlobTriggerTypeProperties model =
            BinaryData
                .fromString(
                    "{\"folderPath\":\"hknnvjgc\",\"maxConcurrency\":1468097285,\"linkedService\":{\"referenceName\":\"efewofhjonqkbn\",\"parameters\":{\"uvr\":\"dataattzxvfsrufj\"}}}")
                .toObject(BlobTriggerTypeProperties.class);
        Assertions.assertEquals("hknnvjgc", model.folderPath());
        Assertions.assertEquals(1468097285, model.maxConcurrency());
        Assertions.assertEquals("efewofhjonqkbn", model.linkedService().referenceName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        BlobTriggerTypeProperties model =
            new BlobTriggerTypeProperties()
                .withFolderPath("hknnvjgc")
                .withMaxConcurrency(1468097285)
                .withLinkedService(
                    new LinkedServiceReference()
                        .withReferenceName("efewofhjonqkbn")
                        .withParameters(mapOf("uvr", "dataattzxvfsrufj")));
        model = BinaryData.fromObject(model).toObject(BlobTriggerTypeProperties.class);
        Assertions.assertEquals("hknnvjgc", model.folderPath());
        Assertions.assertEquals(1468097285, model.maxConcurrency());
        Assertions.assertEquals("efewofhjonqkbn", model.linkedService().referenceName());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
