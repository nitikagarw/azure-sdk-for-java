// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The CustomDomainParameters model. */
@JsonFlatten
@Fluent
public class CustomDomainParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CustomDomainParameters.class);

    /*
     * The host name of the custom domain. Must be a domain name.
     */
    @JsonProperty(value = "properties.hostName")
    private String hostname;

    /**
     * Get the hostname property: The host name of the custom domain. Must be a domain name.
     *
     * @return the hostname value.
     */
    public String hostname() {
        return this.hostname;
    }

    /**
     * Set the hostname property: The host name of the custom domain. Must be a domain name.
     *
     * @param hostname the hostname value to set.
     * @return the CustomDomainParameters object itself.
     */
    public CustomDomainParameters withHostname(String hostname) {
        this.hostname = hostname;
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
