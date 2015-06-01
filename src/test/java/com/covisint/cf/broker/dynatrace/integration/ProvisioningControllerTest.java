package com.covisint.cf.broker.dynatrace.integration;

import com.covisint.cf.broker.dynatrace.integration.AbstractControllerTest;
import com.fasterxml.jackson.core.JsonProcessingException;

import org.junit.Test;
import org.springframework.http.MediaType;

import java.util.HashMap;
import java.util.Map;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Class: ProvisioningControllerTest.java
 * Description: Test class for ProvisioningController.
 *
 *@version 1.0, 2015-06-01
 *@author lingesh - happiest minds-covisint
 *
 */
public final class ProvisioningControllerTest extends AbstractControllerTest {

    @Test
    public void create() throws Exception {
        this.mockMvc.perform(put("/v2/service_instances/0").content(payload()).contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$").exists());
    }

    @Test
    public void testDelete() throws Exception {
        this.mockMvc.perform(delete("/v2/service_instances/0")
                .param("service_id", "test-service-id").param("plan_id", "test-plan-id"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$").exists());
    }

    private String payload() throws JsonProcessingException {
        Map<String, String> m = new HashMap<>();
        m.put("service_id", "test-service-id");
        m.put("plan_id", "test-plan-id");
        m.put("organization_guid", "test-organization-guid");
        m.put("space_guid", "test-space-guid");

        return this.objectMapper.writeValueAsString(m);
    }

}
