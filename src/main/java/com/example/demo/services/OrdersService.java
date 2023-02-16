package com.example.demo.services;

import com.example.demo.domain.Orders;
import com.example.demo.domain.ResponseTemp;

public interface OrdersService {
    ResponseTemp scores(Orders orders);
}
