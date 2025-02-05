// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CA certificate subject distinguished name information used by service to authenticate clients. For more information,
 * see
 * https://docs.microsoft.com/en-us/dotnet/api/system.security.cryptography.x509certificates.x500distinguishedname?view=net-6.0#remarks.
 */
@Fluent
public final class ClientCertificateSubjectDistinguishedName {
    /*
     * The common name field in the subject name. The allowed limit is 64 characters and it should be specified.
     */
    @JsonProperty(value = "commonName")
    private String commonName;

    /*
     * The organization field in the subject name. If present, the allowed limit is 64 characters.
     */
    @JsonProperty(value = "organization")
    private String organization;

    /*
     * The organization unit field in the subject name. If present, the allowed limit is 32 characters.
     */
    @JsonProperty(value = "organizationUnit")
    private String organizationUnit;

    /*
     * The country code field in the subject name. If present, the country code should be represented by two-letter
     * code defined in ISO 2166-1 (alpha-2). For example: 'US'.
     */
    @JsonProperty(value = "countryCode")
    private String countryCode;

    /** Creates an instance of ClientCertificateSubjectDistinguishedName class. */
    public ClientCertificateSubjectDistinguishedName() {
    }

    /**
     * Get the commonName property: The common name field in the subject name. The allowed limit is 64 characters and it
     * should be specified.
     *
     * @return the commonName value.
     */
    public String commonName() {
        return this.commonName;
    }

    /**
     * Set the commonName property: The common name field in the subject name. The allowed limit is 64 characters and it
     * should be specified.
     *
     * @param commonName the commonName value to set.
     * @return the ClientCertificateSubjectDistinguishedName object itself.
     */
    public ClientCertificateSubjectDistinguishedName withCommonName(String commonName) {
        this.commonName = commonName;
        return this;
    }

    /**
     * Get the organization property: The organization field in the subject name. If present, the allowed limit is 64
     * characters.
     *
     * @return the organization value.
     */
    public String organization() {
        return this.organization;
    }

    /**
     * Set the organization property: The organization field in the subject name. If present, the allowed limit is 64
     * characters.
     *
     * @param organization the organization value to set.
     * @return the ClientCertificateSubjectDistinguishedName object itself.
     */
    public ClientCertificateSubjectDistinguishedName withOrganization(String organization) {
        this.organization = organization;
        return this;
    }

    /**
     * Get the organizationUnit property: The organization unit field in the subject name. If present, the allowed limit
     * is 32 characters.
     *
     * @return the organizationUnit value.
     */
    public String organizationUnit() {
        return this.organizationUnit;
    }

    /**
     * Set the organizationUnit property: The organization unit field in the subject name. If present, the allowed limit
     * is 32 characters.
     *
     * @param organizationUnit the organizationUnit value to set.
     * @return the ClientCertificateSubjectDistinguishedName object itself.
     */
    public ClientCertificateSubjectDistinguishedName withOrganizationUnit(String organizationUnit) {
        this.organizationUnit = organizationUnit;
        return this;
    }

    /**
     * Get the countryCode property: The country code field in the subject name. If present, the country code should be
     * represented by two-letter code defined in ISO 2166-1 (alpha-2). For example: 'US'.
     *
     * @return the countryCode value.
     */
    public String countryCode() {
        return this.countryCode;
    }

    /**
     * Set the countryCode property: The country code field in the subject name. If present, the country code should be
     * represented by two-letter code defined in ISO 2166-1 (alpha-2). For example: 'US'.
     *
     * @param countryCode the countryCode value to set.
     * @return the ClientCertificateSubjectDistinguishedName object itself.
     */
    public ClientCertificateSubjectDistinguishedName withCountryCode(String countryCode) {
        this.countryCode = countryCode;
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
