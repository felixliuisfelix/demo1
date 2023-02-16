package com.example.demo;

import com.example.demo.domain.Orders;
import com.example.demo.domain.ResponseTemp;
import com.example.demo.services.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Orders")
public class OrdersController {
    private OrdersService ordersService;

    @Autowired
    public OrdersController(OrdersService ordersService) {
        this.ordersService = ordersService;
    }

    @PostMapping
    public ResponseTemp getScores(@RequestBody Orders o) {
        return ordersService.scores(o);
    }

}
