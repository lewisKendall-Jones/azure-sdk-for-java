// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.ai.contentsafety.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The result of blocklist match. */
@Immutable
public final class TextBlocklistMatchResult {
    /*
     * The name of matched blocklist.
     */
    @Generated
    @JsonProperty(value = "blocklistName")
    private String blocklistName;

    /*
     * The id of matched item.
     */
    @Generated
    @JsonProperty(value = "blockItemId")
    private String blockItemId;

    /*
     * The content of matched item.
     */
    @Generated
    @JsonProperty(value = "blockItemText")
    private String blockItemText;

    /*
     * The character offset of matched text in original input.
     */
    @Generated
    @JsonProperty(value = "offset")
    private int offset;

    /*
     * The length of matched text in original input.
     */
    @Generated
    @JsonProperty(value = "length")
    private int length;

    /**
     * Creates an instance of TextBlocklistMatchResult class.
     *
     * @param blocklistName the blocklistName value to set.
     * @param blockItemId the blockItemId value to set.
     * @param blockItemText the blockItemText value to set.
     * @param offset the offset value to set.
     * @param length the length value to set.
     */
    @Generated
    @JsonCreator
    private TextBlocklistMatchResult(
            @JsonProperty(value = "blocklistName") String blocklistName,
            @JsonProperty(value = "blockItemId") String blockItemId,
            @JsonProperty(value = "blockItemText") String blockItemText,
            @JsonProperty(value = "offset") int offset,
            @JsonProperty(value = "length") int length) {
        this.blocklistName = blocklistName;
        this.blockItemId = blockItemId;
        this.blockItemText = blockItemText;
        this.offset = offset;
        this.length = length;
    }

    /**
     * Get the blocklistName property: The name of matched blocklist.
     *
     * @return the blocklistName value.
     */
    @Generated
    public String getBlocklistName() {
        return this.blocklistName;
    }

    /**
     * Get the blockItemId property: The id of matched item.
     *
     * @return the blockItemId value.
     */
    @Generated
    public String getBlockItemId() {
        return this.blockItemId;
    }

    /**
     * Get the blockItemText property: The content of matched item.
     *
     * @return the blockItemText value.
     */
    @Generated
    public String getBlockItemText() {
        return this.blockItemText;
    }

    /**
     * Get the offset property: The character offset of matched text in original input.
     *
     * @return the offset value.
     */
    @Generated
    public int getOffset() {
        return this.offset;
    }

    /**
     * Get the length property: The length of matched text in original input.
     *
     * @return the length value.
     */
    @Generated
    public int getLength() {
        return this.length;
    }
}
