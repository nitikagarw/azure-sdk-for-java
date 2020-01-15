/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.notificationhubs.v2016_03_01.implementation;

import java.util.List;
import com.microsoft.azure.management.notificationhubs.v2016_03_01.AccessRights;
import com.microsoft.azure.management.notificationhubs.v2016_03_01.Sku;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * Description of a Namespace AuthorizationRules.
 */
@JsonFlatten
public class SharedAccessAuthorizationRuleResourceInner extends Resource {
    /**
     * The rights associated with the rule.
     */
    @JsonProperty(value = "properties.rights")
    private List<AccessRights> rights;

    /**
     * The sku of the created namespace.
     */
    @JsonProperty(value = "sku")
    private Sku sku;

    /**
     * Get the rights associated with the rule.
     *
     * @return the rights value
     */
    public List<AccessRights> rights() {
        return this.rights;
    }

    /**
     * Set the rights associated with the rule.
     *
     * @param rights the rights value to set
     * @return the SharedAccessAuthorizationRuleResourceInner object itself.
     */
    public SharedAccessAuthorizationRuleResourceInner withRights(List<AccessRights> rights) {
        this.rights = rights;
        return this;
    }

    /**
     * Get the sku of the created namespace.
     *
     * @return the sku value
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku of the created namespace.
     *
     * @param sku the sku value to set
     * @return the SharedAccessAuthorizationRuleResourceInner object itself.
     */
    public SharedAccessAuthorizationRuleResourceInner withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

}