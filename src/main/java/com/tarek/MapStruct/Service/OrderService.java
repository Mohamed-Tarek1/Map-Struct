package com.tarek.MapStruct.Service;

import com.tarek.MapStruct.Entity.Order;
import com.tarek.MapStruct.Repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;




@Service
public class OrderService {

    @Autowired
    private  OrderRepository orderRepository;

    public Order findById(long id) {

        return orderRepository.findById(id);
    }


    public Order save(Order order) {
        return orderRepository.saveAndFlush(order);
    }
}
