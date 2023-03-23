package com.example.demo2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.demo2.modelo.Cliente;
import com.example.demo2.repository.ClienteRepository;
@Service
public class ClienteServiceImpl extends GenericServiceImpl<Cliente, Long> implements ClienteService{

	@Autowired
    ClienteRepository clienteRepository;
    
    @Override
    public CrudRepository<Cliente, Long> getDao() {
        return clienteRepository;
    }

}
