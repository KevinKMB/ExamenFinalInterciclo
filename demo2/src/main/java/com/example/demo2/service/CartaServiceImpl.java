package com.example.demo2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.demo2.modelo.Carta;
import com.example.demo2.repository.CartaRepository;
@Service
public class CartaServiceImpl extends GenericServiceImpl<Carta, Long> implements CartaService{

	@Autowired
    CartaRepository cartaRepository;
    
    @Override
    public CrudRepository<Carta, Long> getDao() {
        return cartaRepository;
    }

}
