package org.atquil.spring_boot_tom.monitoring;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @author atquil
 */

@Component
public class CloudMonitoring implements HealthIndicator {

    private final String GCP_SERVICE = "GCP Service";

    @Override
    public Health health() {

        Map<String, Object> downService = new HashMap<>();

        if(isGCPServiceAvailable()){
            // Single value : withDetail
            return Health.up().withDetail(GCP_SERVICE,"GCP Is up and running").build();
        }else {
            // Single value : withDetails
            downService.put(GCP_SERVICE,"GCP Is down");
            downService.put("CONTACT ADMIN","123-1231-12");
            return Health.down().withDetails(downService).build();
        }
    }

    //implement the method to check if GCP and AWS is running
    private boolean isGCPServiceAvailable() {
        // do some logic to test
        return true;
    }
}
