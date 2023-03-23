package com.example.demo2.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo2.modelo.Plato;

public interface PlatoRepository extends MongoRepository<Plato, Long>{

}
