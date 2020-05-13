package de.infomotion.kw.weinsuche.controller;

import de.infomotion.kw.weinsuche.dto.MostEarningWine;
import de.infomotion.kw.weinsuche.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    OrderRepository orderRepository;

    @GetMapping("/top-wine")
    public List<MostEarningWine>  getTopWines() {
        return orderRepository.retrieveTopWinePerYear();
    }
}
