package com.pritam.controllers;

import com.pritam.services.LogService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/logs")
@RequiredArgsConstructor
public class LogController {

    private final LogService logService;

    @GetMapping
    public ResponseEntity<String> createLog(){
        logService.dummyLogs();
//        logService.parameterizedLogsExample("1234");
        return ResponseEntity.ok("Log Created");
    }

}
