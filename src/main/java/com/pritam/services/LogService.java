package com.pritam.services;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class LogService {

    private final Logger logger = LoggerFactory.getLogger(LogService.class);

    public void dummyLogs() {
//        logger.info("Inside LogService :: createLogs");
        log.info("Inside createLogs");
        log.warn("Inside createLogs"); // manageable issues
        log.error("Inside createLogs"); // Serious issue
        // Below two by default remains disable
        log.debug("Inside createLogs"); // For development
        log.trace("Inside createLogs"); // For detailed logs
    }

    public void parameterizedLogsExample(String id) {
        log.info("parameterizedLogsExample: id is: {}", id);

        try{
            log.debug("Inside the try block");
            // Service logic to proceed
            if(0<5){
                throw new RuntimeException("Logic failed");
            }
            log.info("Success");
        } catch (Exception e) {
            log.error("The service is failed: for id: {} error is: ",id, e);
            throw new RuntimeException(e);
        }

    }
}
