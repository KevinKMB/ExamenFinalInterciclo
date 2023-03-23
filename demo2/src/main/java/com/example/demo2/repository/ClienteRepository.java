package com.example.demo2.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo2.modelo.Cliente;

public interface ClienteRepository extends MongoRepository<Cliente, Long>{

}
