package com.covisint.cf.broker.dynatrace.testsuites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.covisint.cf.broker.dynatrace.integration.BindingControllerTest;
import com.covisint.cf.broker.dynatrace.integration.CatalogControllerTest;
import com.covisint.cf.broker.dynatrace.integration.ProvisioningControllerTest;

/**
 * Class: DynaTraceServerIntegrationTestSuite.java
 * Description: Suit class for DynaTraceServerIntegrationTest purpose.
 *
 *@version 1.0, 2015-06-01
 *@author lingesh - happiest minds-covisint
 *
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({
	BindingControllerTest.class,
	CatalogControllerTest.class,
	ProvisioningControllerTest.class,
})
public class DynaTraceServerIntegrationTestSuite {   
}