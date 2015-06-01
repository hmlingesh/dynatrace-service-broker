package com.covisint.cf.broker.dynatrace;

import java.io.IOException;
import java.util.Map;

import com.covisint.cf.broker.dynatrace.Credentials;

import static org.junit.Assert.assertEquals;

/**
 * Class: CredentialsTest.java
 * Description: Test class for Credentials.
 *
 *@version 1.0, 2015-06-01
 *@author lingesh - happiest minds-covisint
 *
 */

public final class CredentialsTest extends AbstractSerializationTest<Credentials> {

    @Override
    protected void assertContents(Map m) throws IOException {
        assertEquals("54.200.253.18:9998", m.get("server"));
        assertEquals("hm-dyna-agent", m.get("profile"));
    }

    @Override
    protected Credentials getInstance() {
        return new Credentials("54.200.253.18:9998", "hm-dyna-agent");
    }

}
