package com.abaduna.gestorClientes.controllers;


import com.abaduna.gestorClientes.models.Cliente;
import com.abaduna.gestorClientes.services.ClienteServiceImp;
import com.abaduna.gestorClientes.services.ClienteServices;
import com.abaduna.gestorClientes.services.EmailServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class ClienteControllers {

    @Autowired
    ClienteServiceImp services;

    @Autowired
    private EmailServiceImp EmailServiceImp;

    @GetMapping("api/cliente/{id}")
    public Cliente getByID(@PathVariable("id") Long id){
        return  services.getByID(id);
    }

    @DeleteMapping("api/cliente/{id}")
    public void  delete(@PathVariable("id") Long id){
          services.delete(id);
    }
/*
    @GetMapping("api/cliente/")
    public Cliente getAll(@PathVariable("id") Long id){
        return  services.get(id);
    }*/

    @PostMapping("api/cliente")
    public void  post(@RequestBody Cliente cliente){
        String asusnto = "Gracias por registrarte";
        List<String> to = new ArrayList<>();
        to.add("arturobaduna@gmail.com");
        String body = "grasis por registrate...";
        EmailServiceImp.sendEmail(asusnto,  to, body);
          services.save(cliente);
    }

    @PutMapping("api/cliente/{id}")
    public void  update(@RequestBody Cliente cliente,@PathVariable("id") Long id){
        services.update(cliente,id);
    }
}
