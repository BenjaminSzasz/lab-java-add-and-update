package com.ironhack.plantmanagment.repository;

import com.ironhack.plantmanagment.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Long> {
}
