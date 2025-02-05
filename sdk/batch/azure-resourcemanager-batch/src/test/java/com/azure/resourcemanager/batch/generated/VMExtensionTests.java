// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.batch.models.VMExtension;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class VMExtensionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        VMExtension model =
            BinaryData
                .fromString(
                    "{\"name\":\"jfauvjfdxxi\",\"publisher\":\"e\",\"type\":\"vtcqaqtdo\",\"typeHandlerVersion\":\"cbxvwvxyslqbh\",\"autoUpgradeMinorVersion\":true,\"enableAutomaticUpgrade\":false,\"settings\":\"dataytkblmpew\",\"protectedSettings\":\"datafbkrvrnsvs\",\"provisionAfterExtensions\":[\"ohxcrsbfova\",\"rruvwbhsq\"]}")
                .toObject(VMExtension.class);
        Assertions.assertEquals("jfauvjfdxxi", model.name());
        Assertions.assertEquals("e", model.publisher());
        Assertions.assertEquals("vtcqaqtdo", model.type());
        Assertions.assertEquals("cbxvwvxyslqbh", model.typeHandlerVersion());
        Assertions.assertEquals(true, model.autoUpgradeMinorVersion());
        Assertions.assertEquals(false, model.enableAutomaticUpgrade());
        Assertions.assertEquals("ohxcrsbfova", model.provisionAfterExtensions().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        VMExtension model =
            new VMExtension()
                .withName("jfauvjfdxxi")
                .withPublisher("e")
                .withType("vtcqaqtdo")
                .withTypeHandlerVersion("cbxvwvxyslqbh")
                .withAutoUpgradeMinorVersion(true)
                .withEnableAutomaticUpgrade(false)
                .withSettings("dataytkblmpew")
                .withProtectedSettings("datafbkrvrnsvs")
                .withProvisionAfterExtensions(Arrays.asList("ohxcrsbfova", "rruvwbhsq"));
        model = BinaryData.fromObject(model).toObject(VMExtension.class);
        Assertions.assertEquals("jfauvjfdxxi", model.name());
        Assertions.assertEquals("e", model.publisher());
        Assertions.assertEquals("vtcqaqtdo", model.type());
        Assertions.assertEquals("cbxvwvxyslqbh", model.typeHandlerVersion());
        Assertions.assertEquals(true, model.autoUpgradeMinorVersion());
        Assertions.assertEquals(false, model.enableAutomaticUpgrade());
        Assertions.assertEquals("ohxcrsbfova", model.provisionAfterExtensions().get(0));
    }
}
