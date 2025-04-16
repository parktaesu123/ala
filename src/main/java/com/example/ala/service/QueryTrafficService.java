package com.example.ala.service;

import com.example.ala.domain.Traffic;
import com.example.ala.domain.repository.TrafficRepository;
import com.example.ala.dto.response.TrafficResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class QueryTrafficService {
    private final TrafficRepository trafficRepository;

    public List<TrafficResponse> query() {
        return trafficRepository.findAll()
                .stream()
                .map(traffic -> new TrafficResponse(traffic))
                .collect(Collectors.toList());
    }
}
