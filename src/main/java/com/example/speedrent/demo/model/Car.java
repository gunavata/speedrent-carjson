package com.example.speedrent.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotBlank;
import java.util.UUID;

public class Car {

    private final UUID id;

    @NotBlank
    private final String name;
    @NotBlank
    private final String manufacturer;

    public Car(@JsonProperty("id") UUID id,
                  @JsonProperty("name") String name,
                    @JsonProperty("manufacturer") String manufacturer) {
        this.id = id;
        this.name = name;
        this.manufacturer = manufacturer;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getManufacturer() { return manufacturer;}
}
