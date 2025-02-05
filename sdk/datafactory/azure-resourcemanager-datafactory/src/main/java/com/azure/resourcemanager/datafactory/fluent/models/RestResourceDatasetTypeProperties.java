// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Properties specific to this dataset type. */
@Fluent
public final class RestResourceDatasetTypeProperties {
    /*
     * The relative URL to the resource that the RESTful API provides. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "relativeUrl")
    private Object relativeUrl;

    /*
     * The HTTP method used to call the RESTful API. The default is GET. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "requestMethod")
    private Object requestMethod;

    /*
     * The HTTP request body to the RESTful API if requestMethod is POST. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "requestBody")
    private Object requestBody;

    /*
     * The additional HTTP headers in the request to the RESTful API.
     */
    @JsonProperty(value = "additionalHeaders")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, Object> additionalHeaders;

    /*
     * The pagination rules to compose next page requests.
     */
    @JsonProperty(value = "paginationRules")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, Object> paginationRules;

    /** Creates an instance of RestResourceDatasetTypeProperties class. */
    public RestResourceDatasetTypeProperties() {
    }

    /**
     * Get the relativeUrl property: The relative URL to the resource that the RESTful API provides. Type: string (or
     * Expression with resultType string).
     *
     * @return the relativeUrl value.
     */
    public Object relativeUrl() {
        return this.relativeUrl;
    }

    /**
     * Set the relativeUrl property: The relative URL to the resource that the RESTful API provides. Type: string (or
     * Expression with resultType string).
     *
     * @param relativeUrl the relativeUrl value to set.
     * @return the RestResourceDatasetTypeProperties object itself.
     */
    public RestResourceDatasetTypeProperties withRelativeUrl(Object relativeUrl) {
        this.relativeUrl = relativeUrl;
        return this;
    }

    /**
     * Get the requestMethod property: The HTTP method used to call the RESTful API. The default is GET. Type: string
     * (or Expression with resultType string).
     *
     * @return the requestMethod value.
     */
    public Object requestMethod() {
        return this.requestMethod;
    }

    /**
     * Set the requestMethod property: The HTTP method used to call the RESTful API. The default is GET. Type: string
     * (or Expression with resultType string).
     *
     * @param requestMethod the requestMethod value to set.
     * @return the RestResourceDatasetTypeProperties object itself.
     */
    public RestResourceDatasetTypeProperties withRequestMethod(Object requestMethod) {
        this.requestMethod = requestMethod;
        return this;
    }

    /**
     * Get the requestBody property: The HTTP request body to the RESTful API if requestMethod is POST. Type: string (or
     * Expression with resultType string).
     *
     * @return the requestBody value.
     */
    public Object requestBody() {
        return this.requestBody;
    }

    /**
     * Set the requestBody property: The HTTP request body to the RESTful API if requestMethod is POST. Type: string (or
     * Expression with resultType string).
     *
     * @param requestBody the requestBody value to set.
     * @return the RestResourceDatasetTypeProperties object itself.
     */
    public RestResourceDatasetTypeProperties withRequestBody(Object requestBody) {
        this.requestBody = requestBody;
        return this;
    }

    /**
     * Get the additionalHeaders property: The additional HTTP headers in the request to the RESTful API.
     *
     * @return the additionalHeaders value.
     */
    public Map<String, Object> additionalHeaders() {
        return this.additionalHeaders;
    }

    /**
     * Set the additionalHeaders property: The additional HTTP headers in the request to the RESTful API.
     *
     * @param additionalHeaders the additionalHeaders value to set.
     * @return the RestResourceDatasetTypeProperties object itself.
     */
    public RestResourceDatasetTypeProperties withAdditionalHeaders(Map<String, Object> additionalHeaders) {
        this.additionalHeaders = additionalHeaders;
        return this;
    }

    /**
     * Get the paginationRules property: The pagination rules to compose next page requests.
     *
     * @return the paginationRules value.
     */
    public Map<String, Object> paginationRules() {
        return this.paginationRules;
    }

    /**
     * Set the paginationRules property: The pagination rules to compose next page requests.
     *
     * @param paginationRules the paginationRules value to set.
     * @return the RestResourceDatasetTypeProperties object itself.
     */
    public RestResourceDatasetTypeProperties withPaginationRules(Map<String, Object> paginationRules) {
        this.paginationRules = paginationRules;
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
