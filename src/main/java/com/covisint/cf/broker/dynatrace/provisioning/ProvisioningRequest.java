package com.covisint.cf.broker.dynatrace.provisioning;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.util.Assert;

/**
 * Class: ProvisioningRequest.java
 * Description: ProvisioningRequest class will be responsible having serviceId, planId,org-guid and spaceGuid.
 *
 *@version 1.0, 2015-06-01
 *@author lingesh - happiest minds-covisint
 *
 */

final class ProvisioningRequest {

    private final String serviceId;

    private final String planId;

    private final String organizationGuid;

    private final String spaceGuid;

    @JsonCreator
    ProvisioningRequest(@JsonProperty("service_id") String serviceId, @JsonProperty("plan_id") String planId,
                        @JsonProperty("organization_guid") String organizationGuid,
                        @JsonProperty("space_guid") String spaceGuid) {
        Assert.notNull(serviceId);
        Assert.notNull(planId);
        Assert.notNull(organizationGuid);
        Assert.notNull(spaceGuid);

        this.serviceId = serviceId;
        this.planId = planId;
        this.organizationGuid = organizationGuid;
        this.spaceGuid = spaceGuid;
    }

    String getServiceId() {
        return this.serviceId;
    }

    String getPlanId() {
        return this.planId;
    }

    String getOrganizationGuid() {
        return this.organizationGuid;
    }

    String getSpaceGuid() {
        return this.spaceGuid;
    }

    @Override
    public String toString() {
        return String.format("service_id: %s, plan_id: %s, organization_guid: %s, space_guid: %s", this.serviceId,
                this.planId, this.organizationGuid, this.spaceGuid);
    }
}
