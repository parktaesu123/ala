package com.example.ala.controller;

import com.example.ala.service.TrafficService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TrafficController {
    private final TrafficService trafficService;

    @PostMapping("/visit")
    public void countVisit() {
        trafficService.visit();
    }

    @PostMapping("/download")
    public void countDownload() {
        trafficService.download();
    }
}
