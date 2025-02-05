// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.cdn.models.MetricsGranularity;
import com.azure.resourcemanager.cdn.models.MetricsResponseSeriesItem;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** Metrics Response. */
@Fluent
public final class MetricsResponseInner {
    /*
     * The dateTimeBegin property.
     */
    @JsonProperty(value = "dateTimeBegin")
    private OffsetDateTime dateTimeBegin;

    /*
     * The dateTimeEnd property.
     */
    @JsonProperty(value = "dateTimeEnd")
    private OffsetDateTime dateTimeEnd;

    /*
     * The granularity property.
     */
    @JsonProperty(value = "granularity")
    private MetricsGranularity granularity;

    /*
     * The series property.
     */
    @JsonProperty(value = "series")
    private List<MetricsResponseSeriesItem> series;

    /** Creates an instance of MetricsResponseInner class. */
    public MetricsResponseInner() {
    }

    /**
     * Get the dateTimeBegin property: The dateTimeBegin property.
     *
     * @return the dateTimeBegin value.
     */
    public OffsetDateTime dateTimeBegin() {
        return this.dateTimeBegin;
    }

    /**
     * Set the dateTimeBegin property: The dateTimeBegin property.
     *
     * @param dateTimeBegin the dateTimeBegin value to set.
     * @return the MetricsResponseInner object itself.
     */
    public MetricsResponseInner withDateTimeBegin(OffsetDateTime dateTimeBegin) {
        this.dateTimeBegin = dateTimeBegin;
        return this;
    }

    /**
     * Get the dateTimeEnd property: The dateTimeEnd property.
     *
     * @return the dateTimeEnd value.
     */
    public OffsetDateTime dateTimeEnd() {
        return this.dateTimeEnd;
    }

    /**
     * Set the dateTimeEnd property: The dateTimeEnd property.
     *
     * @param dateTimeEnd the dateTimeEnd value to set.
     * @return the MetricsResponseInner object itself.
     */
    public MetricsResponseInner withDateTimeEnd(OffsetDateTime dateTimeEnd) {
        this.dateTimeEnd = dateTimeEnd;
        return this;
    }

    /**
     * Get the granularity property: The granularity property.
     *
     * @return the granularity value.
     */
    public MetricsGranularity granularity() {
        return this.granularity;
    }

    /**
     * Set the granularity property: The granularity property.
     *
     * @param granularity the granularity value to set.
     * @return the MetricsResponseInner object itself.
     */
    public MetricsResponseInner withGranularity(MetricsGranularity granularity) {
        this.granularity = granularity;
        return this;
    }

    /**
     * Get the series property: The series property.
     *
     * @return the series value.
     */
    public List<MetricsResponseSeriesItem> series() {
        return this.series;
    }

    /**
     * Set the series property: The series property.
     *
     * @param series the series value to set.
     * @return the MetricsResponseInner object itself.
     */
    public MetricsResponseInner withSeries(List<MetricsResponseSeriesItem> series) {
        this.series = series;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (series() != null) {
            series().forEach(e -> e.validate());
        }
    }
}
