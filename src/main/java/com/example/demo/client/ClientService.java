package com.example.demo.client;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    public List<Client> getClients()
    {

        return List.of(
                new Client(
                        1L,
                        "Zuzia",
                        "Baginska",
                        "czarnaherbata223@gmail.com",
                        "01.01.2002"
                )
        );
    }
}
