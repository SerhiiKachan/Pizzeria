package com.restaurant.pizzeria.service;

import com.restaurant.pizzeria.entity.OrderList;
import com.restaurant.pizzeria.repository.OrderListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderListService {

    @Autowired
    private OrderListRepository orderListRepository;

    public OrderList getOrderById(long id) {
        return orderListRepository.findById(id).get();
    }

    public List<OrderList> getAllOrders() {
        return (List<OrderList>) orderListRepository.findAll();
    }

    public void addOrder(OrderList order) {
        orderListRepository.save(order);
    }

    public void updateOrder(OrderList order, long id) {
        orderListRepository.save(order);
    }

    public void deleteOrder(long id) {
        orderListRepository.delete(this.getOrderById(id));
    }
}
