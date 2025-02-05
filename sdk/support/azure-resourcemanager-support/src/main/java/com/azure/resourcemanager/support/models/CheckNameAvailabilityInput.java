// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Input of CheckNameAvailability API. */
@Fluent
public final class CheckNameAvailabilityInput {
    /*
     * The resource name to validate.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The type of resource.
     */
    @JsonProperty(value = "type", required = true)
    private Type type;

    /** Creates an instance of CheckNameAvailabilityInput class. */
    public CheckNameAvailabilityInput() {
    }

    /**
     * Get the name property: The resource name to validate.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The resource name to validate.
     *
     * @param name the name value to set.
     * @return the CheckNameAvailabilityInput object itself.
     */
    public CheckNameAvailabilityInput withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: The type of resource.
     *
     * @return the type value.
     */
    public Type type() {
        return this.type;
    }

    /**
     * Set the type property: The type of resource.
     *
     * @param type the type value to set.
     * @return the CheckNameAvailabilityInput object itself.
     */
    public CheckNameAvailabilityInput withType(Type type) {
        this.type = type;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property name in model CheckNameAvailabilityInput"));
        }
        if (type() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property type in model CheckNameAvailabilityInput"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(CheckNameAvailabilityInput.class);
}
