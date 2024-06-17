package com.abaduna.gestorClientes.controllers;


import com.abaduna.gestorClientes.models.Cliente;
import com.abaduna.gestorClientes.services.EmailServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class EmailController {

    @Autowired
    private EmailServiceImp service;

    @GetMapping("api/email")
    public void sendEmail(){
    String asusnto = "Gracias por registrarte";
    List<String> to = new ArrayList<>();
    to.add("arturobaduna@gmail.com");
    String body = "grasis...";
    service.sendEmail( asusnto,  to, body);
    }
}
