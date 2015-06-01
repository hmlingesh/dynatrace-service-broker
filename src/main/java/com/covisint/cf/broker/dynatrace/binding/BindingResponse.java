package com.covisint.cf.broker.dynatrace.binding;

import com.covisint.cf.broker.dynatrace.Credentials;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.net.URI;

/**
 * Class: BindingResponse.java
 * Description: BindingResponse holding credentials , syslogDrainUrl. 
 *
 *@version 1.0, 2015-06-01
 *@author lingesh - happiest minds-covisint
 *
 */

final class BindingResponse {

    private final Credentials credentials;

    private final URI syslogDrainUrl;

    BindingResponse(Credentials credentials, URI syslogDrainUrl) {
        this.credentials = credentials;
        this.syslogDrainUrl = syslogDrainUrl;
    }

    Credentials getCredentials() {
        return this.credentials;
    }

    @JsonProperty("syslog_drain_url")
    URI getSyslogDrainUrl() {
        return this.syslogDrainUrl;
    }

}
