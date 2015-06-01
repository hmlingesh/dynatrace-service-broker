package com.covisint.cf.broker.dynatrace.binding;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.net.URI;
import java.util.Map;

import com.covisint.cf.broker.dynatrace.AbstractSerializationTest;
import com.covisint.cf.broker.dynatrace.Credentials;
/**
 * Class: BindingResponseTest.java
 * Description: Test class for BindingResponse.
 *
 *@version 1.0, 2015-06-01
 *@author lingesh - happiest minds-covisint
 *
 */
public final class BindingResponseTest extends AbstractSerializationTest<BindingResponse> {

    @Override
    protected void assertContents(Map m) throws IOException {
        assertEquals(roundTrip(getCredentials()), m.get("credentials"));
        assertEquals("http://test.syslog.drain.url", m.get("syslog_drain_url"));
    }

    @Override
    protected BindingResponse getInstance() {
        return new BindingResponse(getCredentials(), URI.create("http://test.syslog.drain.url"));
    }

    private Credentials getCredentials() {
        return new Credentials("54.200.253.18:9998", "hm-dyna-agent");
    }

}
