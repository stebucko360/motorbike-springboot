package com.motorbikes.motorbikesAPI.models;
import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="Motorbikes")
public class Motorbike {

    @Id
    @GeneratedValue()
    @Getter @Setter private Long id;

    @Column(name="MAKE")
    @Getter @Setter private String make;

    @Column(name="MODEL")
    @Getter @Setter private String model;

    @Column(name="ENGINE_SIZE")
    @Getter @Setter private Integer engineSize;

    @Column(name="PRICE")
    @Getter @Setter private Float price;

    @Column(name="COLOUR")
    @Getter @Setter private String colour;

    @Override
    public String toString() {
        return "User : " + id + make + model + engineSize + price + colour;
    }

}
