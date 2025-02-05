// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.LinkedServiceResourceInner;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeReference;
import com.azure.resourcemanager.datafactory.models.LinkedService;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class LinkedServiceResourceInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        LinkedServiceResourceInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"type\":\"LinkedService\",\"connectVia\":{\"referenceName\":\"vfiwjmygtdss\",\"parameters\":{\"emwabnet\":\"datatmweriofzpyq\",\"d\":\"datahhszh\"}},\"description\":\"vwiwubmwmbesld\",\"parameters\":{\"flcxoga\":{\"type\":\"Float\",\"defaultValue\":\"datapp\"},\"qzeqqkdltfzxm\":{\"type\":\"SecureString\",\"defaultValue\":\"datanzmnsikvm\"}},\"annotations\":[\"datahgure\"],\"\":{\"xwak\":\"datawobdagxtibqdx\",\"lbpodxunk\":\"dataogqxndlkzgxhuri\",\"lrb\":\"dataebxmubyynt\"}},\"name\":\"koievseo\",\"type\":\"q\",\"etag\":\"ltmuwlauwzizx\",\"id\":\"pgcjefuzmuvp\"}")
                .toObject(LinkedServiceResourceInner.class);
        Assertions.assertEquals("pgcjefuzmuvp", model.id());
        Assertions.assertEquals("vfiwjmygtdss", model.properties().connectVia().referenceName());
        Assertions.assertEquals("vwiwubmwmbesld", model.properties().description());
        Assertions.assertEquals(ParameterType.FLOAT, model.properties().parameters().get("flcxoga").type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        LinkedServiceResourceInner model =
            new LinkedServiceResourceInner()
                .withId("pgcjefuzmuvp")
                .withProperties(
                    new LinkedService()
                        .withConnectVia(
                            new IntegrationRuntimeReference()
                                .withReferenceName("vfiwjmygtdss")
                                .withParameters(mapOf("emwabnet", "datatmweriofzpyq", "d", "datahhszh")))
                        .withDescription("vwiwubmwmbesld")
                        .withParameters(
                            mapOf(
                                "flcxoga",
                                new ParameterSpecification().withType(ParameterType.FLOAT).withDefaultValue("datapp"),
                                "qzeqqkdltfzxm",
                                new ParameterSpecification()
                                    .withType(ParameterType.SECURE_STRING)
                                    .withDefaultValue("datanzmnsikvm")))
                        .withAnnotations(Arrays.asList("datahgure"))
                        .withAdditionalProperties(mapOf("type", "LinkedService")));
        model = BinaryData.fromObject(model).toObject(LinkedServiceResourceInner.class);
        Assertions.assertEquals("pgcjefuzmuvp", model.id());
        Assertions.assertEquals("vfiwjmygtdss", model.properties().connectVia().referenceName());
        Assertions.assertEquals("vwiwubmwmbesld", model.properties().description());
        Assertions.assertEquals(ParameterType.FLOAT, model.properties().parameters().get("flcxoga").type());
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
