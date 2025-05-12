//package ir.digixo.metrics;
//
//import io.micrometer.core.instrument.Counter;
//import io.micrometer.core.instrument.Gauge;
//import io.micrometer.core.instrument.MeterRegistry;
//import io.micrometer.core.instrument.Timer;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//
//@RestController
//@RequestMapping("/")
//public class CounterMetrics {
//
//
//    Counter counter;
//
//    public CounterMetrics(MeterRegistry registry) {
//        counter =Counter.builder("MyCounter22")
//                .description("My counter")
//                .register(registry);
//    }
//
//    @GetMapping("/m")
//    public String m()
//    {
//        counter.increment();
//        return "hello rest";
//    }
//}
