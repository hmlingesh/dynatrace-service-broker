package com.covisint.cf.broker.dynatrace.binding;

import com.covisint.cf.broker.dynatrace.Credentials;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

/**
 * Class: BindingController.java
 * Description: Binding controller which will do PUT and DELETE operation for all service_bindings. 
 *
 *@version 1.0, 2015-06-01
 *@author lingesh - happiest minds-covisint
 *
 */

@RestController
final class BindingController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private final Credentials credentials;

    @Autowired
    BindingController(Credentials credentials) {
        this.credentials = credentials;
    }
    
    /**
     * create method
     *
     * @param bindingRequest json request from RequestBody
     * @return BindingResponse 
     */
    @RequestMapping(method = RequestMethod.PUT, value = "/v2/service_instances/*/service_bindings/*")
    BindingResponse create(@RequestBody BindingRequest bindingRequest) {
        this.logger.info("Binding Request Received: {}", bindingRequest);
        return new BindingResponse(this.credentials, null);
    }
    
    /**
     * delete method
     *
     * @param serviceId serviceid
     * @param planId planId
     * @return Map 
     */
    @RequestMapping(method = RequestMethod.DELETE, value = "/v2/service_instances/*/service_bindings/*")
    Map<?, ?> delete(@RequestParam("service_id") String serviceId, @RequestParam("plan_id") String planId) {
        this.logger.info("Un-binding Request Received: service_id: {}, plan_id: {}", serviceId, planId);
        return Collections.emptyMap();
    }

}
