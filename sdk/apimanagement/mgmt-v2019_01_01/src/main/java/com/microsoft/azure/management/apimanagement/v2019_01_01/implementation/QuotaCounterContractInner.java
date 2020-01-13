/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2019_01_01.implementation;

import org.joda.time.DateTime;
import com.microsoft.azure.management.apimanagement.v2019_01_01.QuotaCounterValueContractProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Quota counter details.
 */
public class QuotaCounterContractInner {
    /**
     * The Key value of the Counter. Must not be empty.
     */
    @JsonProperty(value = "counterKey", required = true)
    private String counterKey;

    /**
     * Identifier of the Period for which the counter was collected. Must not
     * be empty.
     */
    @JsonProperty(value = "periodKey", required = true)
    private String periodKey;

    /**
     * The date of the start of Counter Period. The date conforms to the
     * following format: `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601
     * standard.
     */
    @JsonProperty(value = "periodStartTime", required = true)
    private DateTime periodStartTime;

    /**
     * The date of the end of Counter Period. The date conforms to the
     * following format: `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601
     * standard.
     */
    @JsonProperty(value = "periodEndTime", required = true)
    private DateTime periodEndTime;

    /**
     * Quota Value Properties.
     */
    @JsonProperty(value = "value")
    private QuotaCounterValueContractProperties value;

    /**
     * Get the Key value of the Counter. Must not be empty.
     *
     * @return the counterKey value
     */
    public String counterKey() {
        return this.counterKey;
    }

    /**
     * Set the Key value of the Counter. Must not be empty.
     *
     * @param counterKey the counterKey value to set
     * @return the QuotaCounterContractInner object itself.
     */
    public QuotaCounterContractInner withCounterKey(String counterKey) {
        this.counterKey = counterKey;
        return this;
    }

    /**
     * Get identifier of the Period for which the counter was collected. Must not be empty.
     *
     * @return the periodKey value
     */
    public String periodKey() {
        return this.periodKey;
    }

    /**
     * Set identifier of the Period for which the counter was collected. Must not be empty.
     *
     * @param periodKey the periodKey value to set
     * @return the QuotaCounterContractInner object itself.
     */
    public QuotaCounterContractInner withPeriodKey(String periodKey) {
        this.periodKey = periodKey;
        return this;
    }

    /**
     * Get the date of the start of Counter Period. The date conforms to the following format: `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601 standard.
     *
     * @return the periodStartTime value
     */
    public DateTime periodStartTime() {
        return this.periodStartTime;
    }

    /**
     * Set the date of the start of Counter Period. The date conforms to the following format: `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601 standard.
     *
     * @param periodStartTime the periodStartTime value to set
     * @return the QuotaCounterContractInner object itself.
     */
    public QuotaCounterContractInner withPeriodStartTime(DateTime periodStartTime) {
        this.periodStartTime = periodStartTime;
        return this;
    }

    /**
     * Get the date of the end of Counter Period. The date conforms to the following format: `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601 standard.
     *
     * @return the periodEndTime value
     */
    public DateTime periodEndTime() {
        return this.periodEndTime;
    }

    /**
     * Set the date of the end of Counter Period. The date conforms to the following format: `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601 standard.
     *
     * @param periodEndTime the periodEndTime value to set
     * @return the QuotaCounterContractInner object itself.
     */
    public QuotaCounterContractInner withPeriodEndTime(DateTime periodEndTime) {
        this.periodEndTime = periodEndTime;
        return this;
    }

    /**
     * Get quota Value Properties.
     *
     * @return the value value
     */
    public QuotaCounterValueContractProperties value() {
        return this.value;
    }

    /**
     * Set quota Value Properties.
     *
     * @param value the value value to set
     * @return the QuotaCounterContractInner object itself.
     */
    public QuotaCounterContractInner withValue(QuotaCounterValueContractProperties value) {
        this.value = value;
        return this;
    }

}