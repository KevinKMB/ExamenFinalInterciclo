package com.example.demo2.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo2.modelo.Restaurante;

public interface RestauranteRepository extends MongoRepository<Restaurante, Long>{

}
