package com.ironhack.plantmanagment.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "workers")
public class Worker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int workerId;
    private String workerName;
    private String workerAddress;

    public Worker(String workerName, String workerAddress) {
        this.workerName = workerName;
        this.workerAddress = workerAddress;
    }
}
