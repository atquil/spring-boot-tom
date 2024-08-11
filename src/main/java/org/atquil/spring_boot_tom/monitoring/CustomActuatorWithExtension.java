package org.atquil.spring_boot_tom.monitoring;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.actuate.endpoint.annotation.EndpointExtension;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.web.WebEndpointResponse;
import org.springframework.boot.actuate.endpoint.web.annotation.EndpointWebExtension;
import org.springframework.boot.actuate.info.InfoEndpoint;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author atquil
 */
@Component
@EndpointWebExtension(endpoint = InfoEndpoint.class)
@RequiredArgsConstructor
public class CustomActuatorWithExtension {

    private final InfoEndpoint infoEndpoint;

    @ReadOperation
    public WebEndpointResponse<Map> info() {
        Map<String, Object> info = this.infoEndpoint.info();
        Integer status = getStatus(info);
        // Add status to the response body
        info.put("status", status);
        return new WebEndpointResponse<>(info, status);
    }

    private Integer getStatus(Map<String, Object> info) {
        //Some work
        return 200;
    }
}
