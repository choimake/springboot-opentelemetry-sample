package com.example.otel.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class GetItemsController {

    private static final Logger logger = LoggerFactory.getLogger(GetItemsController.class);

    @GetMapping("/items")
    public String execute() {

        var logInfo = new HashMap<>();
        logInfo.put("userId", "12345");
        logInfo.put("action", "performTask");

        logger.info("Task performed: {}", logInfo);

        logger.info("info log by logger");
        logger.warn("warn log by logger");
        logger.warn("error log by logger");

        return "items";
    }
}
