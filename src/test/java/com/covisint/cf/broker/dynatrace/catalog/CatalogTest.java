package com.covisint.cf.broker.dynatrace.catalog;

import com.covisint.cf.broker.dynatrace.AbstractSerializationTest;
import com.covisint.cf.broker.dynatrace.catalog.Catalog;

import java.util.Map;

import static org.junit.Assert.assertNull;

/**
 * Class: CatalogTest.java
 * Description: Test class for CatalogTest.
 *
 *@version 1.0, 2015-06-01
 *@author lingesh - happiest minds-covisint
 *
 */
public final class CatalogTest extends AbstractSerializationTest<Catalog> {

    @Override
    protected void assertContents(Map m) {
        assertNull(m.get("services"));
    }

    @Override
    protected Catalog getInstance() {
        return new Catalog();
    }

}
