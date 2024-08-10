package com.example.metrics_traces.controller;

import com.example.metrics_traces.service.DependentAppClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MetricsController
{
    private static final Logger log = LoggerFactory.getLogger(MetricsController.class);
    private final DependentAppClient _dependentAppClient;
    MetricsController(DependentAppClient dependentAppClient)
    {
        _dependentAppClient = dependentAppClient;
    }

    @GetMapping("/hello-metrics")
    public String helloMetrics()
    {
        log.info("Hello Metrics");
        return "Hello Metrics";
    }

    @GetMapping("/hello-traces")
    public String helloTraces()
    {
        _dependentAppClient.callDependentApp();
        log.info("Hello Traces");
        return "Hello Traces";
    }

}
