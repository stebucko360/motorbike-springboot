package com.motorbikes.motorbikesAPI.contollers;

import com.motorbikes.motorbikesAPI.models.Motorbike;
import com.motorbikes.motorbikesAPI.repositories.MotorbikeRepo;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/motorbikes")
public class MotorbikeController {

    MotorbikeRepo motorbikeRepo;

    public MotorbikeController(MotorbikeRepo motorbikeRepo){
        this.motorbikeRepo = motorbikeRepo;
    }

    @GetMapping()
    public Iterable<Motorbike> getAllBikes(){
        return motorbikeRepo.findAll();
    }


    @PostMapping("/addBike")
    public Motorbike addBike(@RequestBody Motorbike recBike){
        Motorbike bikeToSave = motorbikeRepo.save(recBike);
        return bikeToSave;
    }

}
