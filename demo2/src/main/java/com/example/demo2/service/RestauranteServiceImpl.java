package com.example.demo2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.demo2.modelo.Restaurante;
import com.example.demo2.repository.RestauranteRepository;

@Service
public class RestauranteServiceImpl extends GenericServiceImpl<Restaurante, Long> implements RestauranteService{

	@Autowired
    RestauranteRepository restauranteRepository;
    
    @Override
    public CrudRepository<Restaurante, Long> getDao() {
        return restauranteRepository;
    }

}
