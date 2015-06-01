package com.covisint.cf.broker.dynatrace.provisioning;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.net.URI;

/**
 * Class: ProvisioningResponse.java
 * Description: ProvisioningResponse class will be responsible having dashboard_url.
 *
 *@version 1.0, 2015-06-01
 *@author lingesh - happiest minds-covisint
 *
 */

final class ProvisioningResponse {

    private final URI dashboardUrl;

    ProvisioningResponse(URI dashboardUrl) {
        this.dashboardUrl = dashboardUrl;
    }

    @JsonProperty("dashboard_url")
    public URI getDashboardUrl() {
        return dashboardUrl;
    }

}

