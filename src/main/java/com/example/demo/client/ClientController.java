package com.example.demo.client;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="api/v1/client")
public class ClientController {
    @GetMapping
    public List<Client> getStudents()
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
