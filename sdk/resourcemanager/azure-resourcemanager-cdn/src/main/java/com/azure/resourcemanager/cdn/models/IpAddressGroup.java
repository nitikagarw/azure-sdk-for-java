// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The IpAddressGroup model. */
@Fluent
public final class IpAddressGroup {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(IpAddressGroup.class);

    /*
     * The delivery region of the ip address group
     */
    @JsonProperty(value = "deliveryRegion")
    private String deliveryRegion;

    /*
     * The list of ip v4 addresses.
     */
    @JsonProperty(value = "ipv4Addresses")
    private List<CidrIpAddress> ipv4Addresses;

    /*
     * The list of ip v6 addresses.
     */
    @JsonProperty(value = "ipv6Addresses")
    private List<CidrIpAddress> ipv6Addresses;

    /**
     * Get the deliveryRegion property: The delivery region of the ip address group.
     *
     * @return the deliveryRegion value.
     */
    public String deliveryRegion() {
        return this.deliveryRegion;
    }

    /**
     * Set the deliveryRegion property: The delivery region of the ip address group.
     *
     * @param deliveryRegion the deliveryRegion value to set.
     * @return the IpAddressGroup object itself.
     */
    public IpAddressGroup withDeliveryRegion(String deliveryRegion) {
        this.deliveryRegion = deliveryRegion;
        return this;
    }

    /**
     * Get the ipv4Addresses property: The list of ip v4 addresses.
     *
     * @return the ipv4Addresses value.
     */
    public List<CidrIpAddress> ipv4Addresses() {
        return this.ipv4Addresses;
    }

    /**
     * Set the ipv4Addresses property: The list of ip v4 addresses.
     *
     * @param ipv4Addresses the ipv4Addresses value to set.
     * @return the IpAddressGroup object itself.
     */
    public IpAddressGroup withIpv4Addresses(List<CidrIpAddress> ipv4Addresses) {
        this.ipv4Addresses = ipv4Addresses;
        return this;
    }

    /**
     * Get the ipv6Addresses property: The list of ip v6 addresses.
     *
     * @return the ipv6Addresses value.
     */
    public List<CidrIpAddress> ipv6Addresses() {
        return this.ipv6Addresses;
    }

    /**
     * Set the ipv6Addresses property: The list of ip v6 addresses.
     *
     * @param ipv6Addresses the ipv6Addresses value to set.
     * @return the IpAddressGroup object itself.
     */
    public IpAddressGroup withIpv6Addresses(List<CidrIpAddress> ipv6Addresses) {
        this.ipv6Addresses = ipv6Addresses;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (ipv4Addresses() != null) {
            ipv4Addresses().forEach(e -> e.validate());
        }
        if (ipv6Addresses() != null) {
            ipv6Addresses().forEach(e -> e.validate());
        }
    }
}
