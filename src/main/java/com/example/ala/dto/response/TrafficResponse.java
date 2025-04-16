package com.example.ala.dto.response;

import com.example.ala.domain.Traffic;
import lombok.Getter;

@Getter
public class TrafficResponse {
    private int visitCount;

    private int downloadCount;

    public TrafficResponse(Traffic traffic) {
        this.visitCount = traffic.getVisitCount();
        this.downloadCount = traffic.getDownloadCount();
    }
}
