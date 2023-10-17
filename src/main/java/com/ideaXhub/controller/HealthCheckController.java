package com.ideaXhub.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/health")
public class HealthCheckController {
    private static final Logger logger = LoggerFactory.getLogger(HealthCheckController.class);
    @GetMapping("/check")
    public ResponseEntity<String> healthCheck() {
        logger.debug("Health Check Called");
        return ResponseEntity.ok("Web app is up and running!");
    }
}
