package de.infomotion.kw.weinsuche.controller;

import de.infomotion.kw.weinsuche.dto.MostEarningWine;
import de.infomotion.kw.weinsuche.model.Order;
import de.infomotion.kw.weinsuche.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @GetMapping("/all-wine")
    public Page<Order> getALlWines(@RequestParam int pageNumber, int pageSize) {

        Pageable pageable = PageRequest.of(pageNumber,pageSize);
        Page<Order> page = orderRepository.findAll(pageable);

        return page;
    }
}
