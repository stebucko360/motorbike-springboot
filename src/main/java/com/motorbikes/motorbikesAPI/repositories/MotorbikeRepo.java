package com.motorbikes.motorbikesAPI.repositories;

import com.motorbikes.motorbikesAPI.models.Motorbike;
import org.springframework.data.repository.CrudRepository;

public interface MotorbikeRepo extends CrudRepository<Motorbike, Integer> {
}
