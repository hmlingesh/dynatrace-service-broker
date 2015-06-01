package com.covisint.cf.broker.dynatrace.catalog;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.util.Assert;

import java.util.UUID;

/**
 * Class: Plan.java
 * Description: Plan class will be used for service plan related details like name , descriptoion , planMetadata and free.  
 *
 *@version 1.0, 2015-06-01
 *@author lingesh - happiest minds-covisint
 *
 */

final class Plan {

    private final Service service;

    private final Object monitor = new Object();

    private volatile UUID id;

    private volatile String name;

    private volatile String description;

    private volatile PlanMetadata planMetadata;

    private volatile Boolean free;

    Plan(Service service) {
        this.service = service;
    }

    UUID getId() {
        synchronized (this.monitor) {
            Assert.notNull(this.id, "Plans must specify an id");
            return this.id;
        }
    }

    String getName() {
        synchronized (this.monitor) {
            Assert.notNull(this.id, "Plans must specify a name");
            return this.name;
        }
    }

    String getDescription() {
        synchronized (this.monitor) {
            Assert.notNull(this.id, "Plans must specify a description");
            return this.description;
        }
    }

    @JsonProperty("metadata")
    PlanMetadata getPlanMetadata() {
        synchronized (this.monitor) {
            return this.planMetadata;
        }
    }

    Boolean getFree() {
        synchronized (this.monitor) {
            return this.free;
        }
    }

    Service and() {
        synchronized (this.monitor) {
            return this.service;
        }
    }

    Plan id(UUID id) {
        synchronized (this.monitor) {
            this.id = id;
            return this;
        }
    }

    Plan name(String name) {
        synchronized (this.monitor) {
            this.name = name;
            return this;
        }
    }

    Plan description(String description) {
        synchronized (this.monitor) {
            this.description = description;
            return this;
        }
    }

    PlanMetadata metadata() {
        synchronized (this.monitor) {
            if (this.planMetadata == null) {
                this.planMetadata = new PlanMetadata(this);
            }

            return this.planMetadata;
        }
    }

    Plan free(Boolean free) {
        synchronized (this.monitor) {
            this.free = free;
            return this;
        }
    }

}
