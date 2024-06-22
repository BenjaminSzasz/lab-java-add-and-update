package com.ironhack.plantmanagment.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "plants")
public class Plant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long plantId;
    private String plantName;
    private String species;
    private int quantity;
    @ManyToOne
    @JoinColumn(name = "worker",referencedColumnName = "workerID")
    private Worker workerID;
    @ManyToOne
    @JoinColumn(name = "location",referencedColumnName = "locationID")
    private Location locationID;

    public Plant(String plantName, String species, int quantity, Worker workerID, Location locationID) {
        this.plantName = plantName;
        this.species = species;
        this.quantity = quantity;
        this.workerID = workerID;
        this.locationID = locationID;
    }
}
