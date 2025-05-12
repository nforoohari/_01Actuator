package ir.digixo.metrics;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class InfoMetrics implements HealthIndicator {
    @Override
    public Health getHealth(boolean includeDetails) {
        return HealthIndicator.super.getHealth(includeDetails);
    }

    @Override
    public Health health() {
        boolean error = false;
        if (error) {
            return Health.down().withDetail("error code", 800).build();
        }
        return Health.up().build();
    }
}
