package com.covisint.cf.broker.dynatrace.testsuites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.covisint.cf.broker.dynatrace.CredentialsTest;
import com.covisint.cf.broker.dynatrace.binding.BindingRequestTest;
import com.covisint.cf.broker.dynatrace.binding.BindingResponseTest;
import com.covisint.cf.broker.dynatrace.catalog.CatalogTest;
import com.covisint.cf.broker.dynatrace.catalog.CostTest;
import com.covisint.cf.broker.dynatrace.catalog.DashboardClientTest;
import com.covisint.cf.broker.dynatrace.catalog.PlanMetadataTest;
import com.covisint.cf.broker.dynatrace.catalog.PlanTest;
import com.covisint.cf.broker.dynatrace.catalog.ServiceMetadataTest;
import com.covisint.cf.broker.dynatrace.catalog.ServiceTest;
import com.covisint.cf.broker.dynatrace.provisioning.ProvisioningRequestTest;
import com.covisint.cf.broker.dynatrace.provisioning.ProvisioningResponseTest;

/**
 * Class: DynaTraceServerJunitTestSuite.java
 * Description: Suit class for DynaTraceServerJunitTestSuite purpose.
 *
 *@version 1.0, 2015-06-01
 *@author lingesh - happiest minds-covisint
 *
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({
	CredentialsTest.class,
	BindingRequestTest.class,
	BindingResponseTest.class,
	CatalogTest.class,
	CostTest.class,
	DashboardClientTest.class,
	PlanMetadataTest.class,
	PlanTest.class,
	ServiceMetadataTest.class,
	ServiceTest.class,
	ProvisioningRequestTest.class,
	ProvisioningResponseTest.class
	
})
public class DynaTraceServerJunitTestSuite {   
}