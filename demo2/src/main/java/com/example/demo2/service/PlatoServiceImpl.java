package com.example.demo2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.demo2.modelo.Plato;
import com.example.demo2.repository.PlatoRepository;
@Service
public class PlatoServiceImpl extends GenericServiceImpl<Plato, Long> implements PlatoService{

	@Autowired
    PlatoRepository platoRepository;
    
    @Override
    public CrudRepository<Plato, Long> getDao() {
        return platoRepository;
    }

}
