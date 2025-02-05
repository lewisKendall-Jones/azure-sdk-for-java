// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Cosmos DB region to online or offline. */
@Fluent
public final class RegionForOnlineOffline {
    /*
     * Cosmos DB region, with spaces between words and each word capitalized.
     */
    @JsonProperty(value = "region", required = true)
    private String region;

    /** Creates an instance of RegionForOnlineOffline class. */
    public RegionForOnlineOffline() {
    }

    /**
     * Get the region property: Cosmos DB region, with spaces between words and each word capitalized.
     *
     * @return the region value.
     */
    public String region() {
        return this.region;
    }

    /**
     * Set the region property: Cosmos DB region, with spaces between words and each word capitalized.
     *
     * @param region the region value to set.
     * @return the RegionForOnlineOffline object itself.
     */
    public RegionForOnlineOffline withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (region() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property region in model RegionForOnlineOffline"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(RegionForOnlineOffline.class);
}
