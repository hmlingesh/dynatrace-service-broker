package com.covisint.cf.broker.dynatrace.catalog;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.util.Assert;

import java.net.URI;

/**
 * Class: DashboardClient.java
 * Description: DashboardClient will be holding service , secret and redircetURL  
 *
 *@version 1.0, 2015-06-01
 *@author lingesh - happiest minds-covisint
 *
 */

final class DashboardClient {

    private final Service service;

    private final Object monitor = new Object();

    private volatile String id;

    private volatile String secret;

    private volatile URI redirectUri;

    DashboardClient(Service service) {
        this.service = service;
    }

    String getId() {
        synchronized (this.monitor) {
            Assert.notNull(this.id, "Dashboard Clients must specify an id");
            return this.id;
        }
    }

    String getSecret() {
        synchronized (this.monitor) {
            Assert.notNull(this.secret, "Dashboard Clients must specify a secret");
            return this.secret;
        }
    }

    @JsonProperty("redirect_uri")
    URI getRedirectUri() {
        synchronized (this.monitor) {
            Assert.notNull(this.redirectUri, "Dashboard Clients must specify a redirect URI");
            return this.redirectUri;
        }
    }

    Service and() {
        synchronized (this.monitor) {
            return this.service;
        }
    }

    DashboardClient id(String id) {
        synchronized (this.monitor) {
            this.id = id;
            return this;
        }
    }

    DashboardClient secret(String secret) {
        synchronized (this.monitor) {
            this.secret = secret;
            return this;
        }
    }

    DashboardClient redirectUri(URI redirectUri) {
        synchronized (this.monitor) {
            this.redirectUri = redirectUri;
            return this;
        }
    }

}
