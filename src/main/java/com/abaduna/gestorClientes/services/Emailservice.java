package com.abaduna.gestorClientes.services;

import java.util.List;

public interface Emailservice {
     void sendEmail(String asunt, List<String> to,String body);
}
