package com.example.demo.car;

import com.example.demo.client.Client;
import com.example.demo.client.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="api/car")
public class CarController {

        private final CarService carService;

        @Autowired
        public CarController(CarService carService) {
            this.carService = new CarService();
        }

        @GetMapping
        public List<Car> getCar() {
            return carService.getCar();
        }
    }

