
package app.bootproj.actuators;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

/**
 * HealthCheck
 */

@Component
public class HealthCheck implements HealthIndicator{

    @Override
    public Health health() {
        return Health.up().build();
    }    
    
}
