package ir.digixo.metrics;

import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.Gauge;
import io.micrometer.core.instrument.Timer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class CounterMetrics {

    Counter counter;

    public CounterMetrics(MeterRegistry registry) {
        counter = Counter.builder("Nima Counter")
                .description("Nima Counter Description")
                .register(registry);
    }

    @GetMapping("/c")
    public String c() {
        counter.increment();
        return "Hello, Counter Incremented";
    }
}
