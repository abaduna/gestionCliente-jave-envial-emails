package com.abaduna.gestorClientes.services;

import com.abaduna.gestorClientes.models.Cliente;

import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface ClienteServices {
    public Cliente getByID(Long id);
    public void delete(Long id);

    public void save(Cliente clinete);





    void update(Cliente cliente, Long id);
}
