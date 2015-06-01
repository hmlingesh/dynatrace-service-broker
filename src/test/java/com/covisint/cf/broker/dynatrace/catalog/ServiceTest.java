package com.covisint.cf.broker.dynatrace.catalog;

import com.covisint.cf.broker.dynatrace.AbstractSerializationTest;
import com.covisint.cf.broker.dynatrace.catalog.DashboardClient;
import com.covisint.cf.broker.dynatrace.catalog.Service;

import java.io.IOException;
import java.net.URI;
import java.util.Map;
import java.util.UUID;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

/**
 * Class: ServiceTest.java
 * Description: Test class for ServiceTest.
 *
 *@version 1.0, 2015-06-01
 *@author lingesh - happiest minds-covisint
 *
 */

public final class ServiceTest extends AbstractSerializationTest<Service> {

    @Override
    protected void assertContents(Map m) throws IOException {
        assertEquals(getId().toString(), m.get("id"));
        assertEquals("test-name", m.get("name"));
        assertEquals("test-description", m.get("description"));
        assertTrue((Boolean) m.get("bindable"));
        assertNull(m.get("tags"));
        assertNull(m.get("metadata"));
        assertNull(m.get("requires"));
        assertNull(m.get("plans"));
        assertEquals(roundTrip(getDashboardClient()), m.get("dashboard_client"));
    }

    @Override
    protected Service getInstance() {
        // @formatter:off
        return new Service(null)
                .id(getId())
                .name("test-name")
                .description("test-description")
                .bindable(true)
                .dashboardClient()
                    .id("test-id")
                    .secret("test-secret")
                    .redirectUri(URI.create("http://test.redirect.uri"))
                    .and();
        // @formatter:on
    }

    public UUID getId() {
        return UUID.nameUUIDFromBytes(new byte[0]);
    }

    public DashboardClient getDashboardClient() {
        return new DashboardClient(null)
                .id("test-id")
                .secret("test-secret")
                .redirectUri(URI.create("http://test.redirect.uri"));
    }

}
