package com.example.demo2.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo2.modelo.Carta;

public interface CartaRepository extends MongoRepository<Carta, Long>{

}
