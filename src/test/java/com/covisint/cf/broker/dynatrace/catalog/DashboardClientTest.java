package com.covisint.cf.broker.dynatrace.catalog;

import com.covisint.cf.broker.dynatrace.AbstractSerializationTest;
import com.covisint.cf.broker.dynatrace.catalog.DashboardClient;

import java.net.URI;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * Class: DashboardClientTest.java
 * Description: Test class for DashboardClientTest.
 *
 *@version 1.0, 2015-06-01
 *@author lingesh - happiest minds-covisint
 *
 */
public final class DashboardClientTest extends AbstractSerializationTest<DashboardClient> {

    @Override
    protected void assertContents(Map m) {
        assertEquals("test-id", m.get("id"));
        assertEquals("test-secret", m.get("secret"));
        assertEquals("http://test.redirect.uri", m.get("redirect_uri"));
    }

    @Override
    protected DashboardClient getInstance() {
        return new DashboardClient(null)
                .id("test-id")
                .secret("test-secret")
                .redirectUri(URI.create("http://test.redirect.uri"));
    }

}
