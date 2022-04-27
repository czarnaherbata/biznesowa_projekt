package com.example.demo.car;

import com.example.demo.client.Client;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class CarService {
    public List<Car> getCar()
    {

        return List.of(
                new Car(
                        1L,
                        "Ford Focus",
                        "2000",
                        "niebieski"
                )
        );
    }
}
