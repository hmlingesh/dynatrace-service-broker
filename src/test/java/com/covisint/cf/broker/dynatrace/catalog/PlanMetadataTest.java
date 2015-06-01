package com.covisint.cf.broker.dynatrace.catalog;

import com.covisint.cf.broker.dynatrace.AbstractSerializationTest;
import com.covisint.cf.broker.dynatrace.catalog.PlanMetadata;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * Class: PlanMetadataTest.java
 * Description: Test class for PlanMetadataTest.
 *
 *@version 1.0, 2015-06-01
 *@author lingesh - happiest minds-covisint
 *
 */

public final class PlanMetadataTest extends AbstractSerializationTest<PlanMetadata> {

    @Override
    protected void assertContents(Map m) {
        assertEquals(getBullets(), m.get("bullets"));
        assertNull(m.get("costs"));
        assertEquals("test-display-name", m.get("displayName"));
    }

    @Override
    protected PlanMetadata getInstance() {
        return new PlanMetadata(null)
                .bullets("test-bullet-1", "test-bullet-2")
                .displayName("test-display-name");
    }

    private List<String> getBullets() {
        return Arrays.asList("test-bullet-1", "test-bullet-2");
    }

}
