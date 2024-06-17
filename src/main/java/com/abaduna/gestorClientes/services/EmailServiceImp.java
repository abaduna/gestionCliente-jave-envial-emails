package com.abaduna.gestorClientes.services;

import java.util.List;
import java.util.Properties;

public class EmailServiceImp implements Emailservice{
    @Override
    public void sendEmail(String asunt, List<String> to, String body) {

        String usuario = "arturobaduna@gmail.com";
        String password = "123456789";

        Properties props = new Properties();
        props.put("mail.sntp.aunto","true");
        props.put("mail.sntp.starttls.enable","true");
        props.put("mail,snpt.host","smtp.gmial.com");
        props.put("mail.smtp.port","587");


    }
}
