package com.ironhack.plantmanagment.repository;

import com.ironhack.plantmanagment.model.Plant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlantRepository extends JpaRepository<Plant, Integer> {
}
