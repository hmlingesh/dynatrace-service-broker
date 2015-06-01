package com.covisint.cf.broker.dynatrace.catalog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Class: PlanMetadata.java
 * Description: PlanMetadata class will be holding bullets , costs and displayname which will be associated to plan
 *
 *@version 1.0, 2015-06-01
 *@author lingesh - happiest minds-covisint
 *
 */

final class PlanMetadata {

    private final Plan plan;

    private final Object monitor = new Object();

    private volatile List<String> bullets;

    private volatile List<Cost> costs;

    private volatile String displayName;

    PlanMetadata(Plan plan) {
        this.plan = plan;
    }

    List<String> getBullets() {
        synchronized (this.monitor) {
            return this.bullets;
        }
    }

    List<Cost> getCosts() {
        synchronized (this.monitor) {
            return this.costs;
        }
    }

    String getDisplayName() {
        synchronized (this.monitor) {
            return this.displayName;
        }
    }

    Plan and() {
        synchronized (this.monitor) {
            return this.plan;
        }
    }

    PlanMetadata bullets(String... bullets) {
        synchronized (this.monitor) {
            if (this.bullets == null) {
                this.bullets = new ArrayList<>();
            }

            Arrays.stream(bullets).forEach(this.bullets::add);
            return this;
        }
    }

    Cost cost() {
        synchronized (this.monitor) {
            if (this.costs == null) {
                this.costs = new ArrayList<>();
            }

            Cost cost = new Cost(this);
            this.costs.add(cost);
            return cost;
        }
    }

    PlanMetadata displayName(String displayName) {
        synchronized (this.monitor) {
            this.displayName = displayName;
            return this;
        }
    }

}
