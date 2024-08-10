package org.atquil.spring_boot_tom.monitoring;

import org.springframework.boot.actuate.endpoint.annotation.DeleteOperation;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author atquil
 */
@Component
@Endpoint(id="custom-actuator")
public class CustomActuatorEndpoint {

    @ReadOperation
    public String myCustomActuator() {return "My custom actuator endpoint";}

    @WriteOperation
    public String blockGCP(String key) {
        //Some operation
        return "Gcp has been blocked";
    }

    @DeleteOperation
    public String removeUser(String userId) {
        //Some operation
        return "UserId"+userId+" has been deleted";
    }

}
