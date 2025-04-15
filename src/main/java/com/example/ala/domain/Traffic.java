package com.example.ala.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Traffic {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Version
    private Long version;

    private int visitCount = 0;

    private int downloadCount = 0;

    public void visit() {
        visitCount++;
    }

    public void download() {
        downloadCount++;
    }
}
