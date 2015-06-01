package com.covisint.cf.broker.dynatrace.catalog;

import java.net.URI;

/**
 * Class: ServiceMetadata.java
 * Description: ServiceMetadata class will be responsible for holding service, imageUrl, longDescription, 
 * 			    documentationUrl and  supportUrl
 *
 *@version 1.0, 2015-06-01
 *@author lingesh - happiest minds-covisint
 *
 */

final class ServiceMetadata {

    private final Service service;

    private final Object monitor = new Object();

    private volatile String displayName;

    private volatile URI imageUrl;

    private volatile String longDescription;

    private volatile String providerDisplayName;

    private volatile URI documentationUrl;

    private volatile URI supportUrl;

    ServiceMetadata(Service service) {
        this.service = service;
    }

    String getDisplayName() {
        synchronized (this.monitor) {
            return this.displayName;
        }
    }

    URI getImageUrl() {
        synchronized (this.monitor) {
            return this.imageUrl;
        }
    }

    String getLongDescription() {
        synchronized (this.monitor) {
            return this.longDescription;
        }
    }

    String getProviderDisplayName() {
        synchronized (this.monitor) {
            return this.providerDisplayName;
        }
    }

    URI getDocumentationUrl() {
        synchronized (this.monitor) {
            return this.documentationUrl;
        }
    }

    URI getSupportUrl() {
        synchronized (this.monitor) {
            return this.supportUrl;
        }
    }

    Service and() {
        synchronized (this.monitor) {
            return this.service;
        }
    }

    ServiceMetadata displayName(String displayName) {
        synchronized (this.monitor) {
            this.displayName = displayName;
            return this;
        }
    }

    ServiceMetadata imageUrl(URI imageUrl) {
        synchronized (this.monitor) {
            this.imageUrl = imageUrl;
            return this;
        }
    }

    ServiceMetadata longDescription(String longDescription) {
        synchronized (this.monitor) {
            this.longDescription = longDescription;
            return this;
        }
    }

    ServiceMetadata providerDisplayName(String providerDisplayName) {
        synchronized (this.monitor) {
            this.providerDisplayName = providerDisplayName;
            return this;
        }
    }

    ServiceMetadata documentationUrl(URI documentationUrl) {
        synchronized (this.monitor) {
            this.documentationUrl = documentationUrl;
            return this;
        }
    }

    ServiceMetadata supportUrl(URI supportUrl) {
        synchronized (this.monitor) {
            this.supportUrl = supportUrl;
            return this;
        }
    }

}
