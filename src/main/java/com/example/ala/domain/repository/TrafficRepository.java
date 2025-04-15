package com.example.ala.domain.repository;

import com.example.ala.domain.Traffic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrafficRepository extends JpaRepository<Traffic, Long> {
}
