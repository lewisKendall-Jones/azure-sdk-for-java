// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Connector properties of a CDC table in terms of name / value pairs. */
@Fluent
public final class MapperDslConnectorProperties {
    /*
     * Name of the property.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Value of the property.
     */
    @JsonProperty(value = "value")
    private Object value;

    /** Creates an instance of MapperDslConnectorProperties class. */
    public MapperDslConnectorProperties() {
    }

    /**
     * Get the name property: Name of the property.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the property.
     *
     * @param name the name value to set.
     * @return the MapperDslConnectorProperties object itself.
     */
    public MapperDslConnectorProperties withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the value property: Value of the property.
     *
     * @return the value value.
     */
    public Object value() {
        return this.value;
    }

    /**
     * Set the value property: Value of the property.
     *
     * @param value the value value to set.
     * @return the MapperDslConnectorProperties object itself.
     */
    public MapperDslConnectorProperties withValue(Object value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
