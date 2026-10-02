package com.pritam.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class LogService {

    private final Logger logger = LoggerFactory.getLogger(LogService.class);

    public void createLogs() {
        logger.info("Inside LogService :: createLogs");
    }
}
