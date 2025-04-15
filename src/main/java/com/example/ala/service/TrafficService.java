package com.example.ala.service;

import com.example.ala.domain.Traffic;
import com.example.ala.domain.repository.TrafficRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TrafficService {
    private final TrafficRepository trafficRepository;

    @Transactional
    public void visit() {
        Traffic traffic = trafficRepository.findById(1L).orElseThrow(); // 고정 ID
        traffic.visit(); // 증가
    }

    @Transactional
    public void download() {
        Traffic traffic = trafficRepository.findById(1L).orElseThrow(); // 고정 ID
        traffic.download();
    }
}
