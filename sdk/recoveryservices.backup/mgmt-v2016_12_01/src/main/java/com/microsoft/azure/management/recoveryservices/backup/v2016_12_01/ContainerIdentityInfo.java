/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2016_12_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Container identity information.
 */
public class ContainerIdentityInfo {
    /**
     * Unique name of the container.
     */
    @JsonProperty(value = "uniqueName")
    private String uniqueName;

    /**
     * Protection container identity - AAD Tenant.
     */
    @JsonProperty(value = "aadTenantId")
    private String aadTenantId;

    /**
     * Protection container identity - AAD Service Principal.
     */
    @JsonProperty(value = "servicePrincipalClientId")
    private String servicePrincipalClientId;

    /**
     * Protection container identity - Audience.
     */
    @JsonProperty(value = "audience")
    private String audience;

    /**
     * Get unique name of the container.
     *
     * @return the uniqueName value
     */
    public String uniqueName() {
        return this.uniqueName;
    }

    /**
     * Set unique name of the container.
     *
     * @param uniqueName the uniqueName value to set
     * @return the ContainerIdentityInfo object itself.
     */
    public ContainerIdentityInfo withUniqueName(String uniqueName) {
        this.uniqueName = uniqueName;
        return this;
    }

    /**
     * Get protection container identity - AAD Tenant.
     *
     * @return the aadTenantId value
     */
    public String aadTenantId() {
        return this.aadTenantId;
    }

    /**
     * Set protection container identity - AAD Tenant.
     *
     * @param aadTenantId the aadTenantId value to set
     * @return the ContainerIdentityInfo object itself.
     */
    public ContainerIdentityInfo withAadTenantId(String aadTenantId) {
        this.aadTenantId = aadTenantId;
        return this;
    }

    /**
     * Get protection container identity - AAD Service Principal.
     *
     * @return the servicePrincipalClientId value
     */
    public String servicePrincipalClientId() {
        return this.servicePrincipalClientId;
    }

    /**
     * Set protection container identity - AAD Service Principal.
     *
     * @param servicePrincipalClientId the servicePrincipalClientId value to set
     * @return the ContainerIdentityInfo object itself.
     */
    public ContainerIdentityInfo withServicePrincipalClientId(String servicePrincipalClientId) {
        this.servicePrincipalClientId = servicePrincipalClientId;
        return this;
    }

    /**
     * Get protection container identity - Audience.
     *
     * @return the audience value
     */
    public String audience() {
        return this.audience;
    }

    /**
     * Set protection container identity - Audience.
     *
     * @param audience the audience value to set
     * @return the ContainerIdentityInfo object itself.
     */
    public ContainerIdentityInfo withAudience(String audience) {
        this.audience = audience;
        return this;
    }

}