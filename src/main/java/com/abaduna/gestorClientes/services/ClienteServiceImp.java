package com.abaduna.gestorClientes.services;

import com.abaduna.gestorClientes.models.Cliente;
import com.abaduna.gestorClientes.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImp implements ClienteServices{
    @Autowired
    ClienteRepository repository;
    @Override
    public Cliente getByID(Long id) {
       return repository.findById(id).get();
    }

    @Override
    public void delete(Long id) {
         repository.deleteById(id);
    }

    @Override
    public void save(Cliente clinete) {
        repository.save(clinete);
    }




    @Override
    public void update(Cliente cliente, Long id) {
        cliente.setId(id);
        repository.save(cliente);
    }
}
