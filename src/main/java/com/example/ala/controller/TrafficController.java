package com.example.ala.controller;

import com.example.ala.dto.response.TrafficResponse;
import com.example.ala.service.QueryTrafficService;
import com.example.ala.service.TrafficService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TrafficController {
    private final TrafficService trafficService;
    private final QueryTrafficService queryTrafficService;

    @GetMapping
    public void countVisit() {
        trafficService.visit();
    }

    @GetMapping("/download")
    public void countDownload() {
        trafficService.download();
    }

    @GetMapping("/check")
    public List<TrafficResponse> checkTraffic() {
        return queryTrafficService.query();
    }
}
