package com.covisint.cf.broker.dynatrace.provisioning;

import com.covisint.cf.broker.dynatrace.AbstractSerializationTest;
import com.covisint.cf.broker.dynatrace.provisioning.ProvisioningResponse;

import java.io.IOException;
import java.net.URI;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * Class: ProvisioningResponseTest.java
 * Description: Test class for ProvisioningResponse.
 *
 *@version 1.0, 2015-06-01
 *@author lingesh - happiest minds-covisint
 *
 */
public final class ProvisioningResponseTest extends AbstractSerializationTest<ProvisioningResponse> {

    @Override
    protected void assertContents(Map m) throws IOException {
        assertEquals("http://test.dashboard.url", m.get("dashboard_url"));
    }

    @Override
    protected ProvisioningResponse getInstance() {
        return new ProvisioningResponse(URI.create("http://test.dashboard.url"));
    }

}
