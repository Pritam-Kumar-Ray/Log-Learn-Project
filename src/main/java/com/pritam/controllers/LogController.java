package com.pritam.controllers;

import com.pritam.services.LogService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/logs")
@RequiredArgsConstructor
public class LogController {

    private final LogService logService;

    @GetMapping
    public ResponseEntity<String> createLog(){
        log.info("Inside createLog");
        logService.dummyLogs();
//        logService.parameterizedLogsExample("1234");
        return ResponseEntity.ok("Log Created");
    }

}
