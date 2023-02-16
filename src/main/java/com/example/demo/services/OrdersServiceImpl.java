package com.example.demo.services;

import com.example.demo.OrdersRepository;
import com.example.demo.domain.Orders;
import com.example.demo.domain.ResponseTemp;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class OrdersServiceImpl implements OrdersService{

    private final OrdersRepository ordersRepository;

    @Autowired
    public OrdersServiceImpl(OrdersRepository ordersRepository) {
        this.ordersRepository = ordersRepository;
    }

    @Override
    public ResponseTemp scores(Orders orders) {
        Optional<Orders> stu =  ordersRepository.findById(orders.getId());
        if(stu.isEmpty()) {
            //log
            throw new RuntimeException("no resource");
        }
        double p = orders.getPrice();
        int flag = p >= 50 ? 1 : 0;
        return new ResponseTemp(0, (int)(p / 20 + flag), null);
    }
}
