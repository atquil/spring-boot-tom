package org.atquil.spring_boot_tom.custom_actuator;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Service;

/**
 * @author atquil
 */
@Service
@Endpoint(id="my-custom-actuator")
public class CustomActuatorEndpoint {

    @ReadOperation
    public String myCustomActuator() {return "My custom actuator endpoint";}
}
