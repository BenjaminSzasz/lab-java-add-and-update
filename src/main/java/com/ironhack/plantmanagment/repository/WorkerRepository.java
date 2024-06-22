package com.ironhack.plantmanagment.repository;

import com.ironhack.plantmanagment.model.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Integer> {
}
