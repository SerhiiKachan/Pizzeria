package com.restaurant.pizzeria.controller;

import com.restaurant.pizzeria.entity.OrderList;
import com.restaurant.pizzeria.service.OrderListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pizzeria")
public class OrderListController {

    @Autowired
    private OrderListService orderListService;

    @GetMapping(value = "/orders", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<OrderList> getOrders() {
        return orderListService.getAllOrders();
    }

    @GetMapping(value = "/orders/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public OrderList getOrder(@PathVariable Long id) {
        return orderListService.getOrderById(id);
    }

    @PostMapping(value = "/orders", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void addOrder(@RequestBody OrderList order) {
        orderListService.addOrder(order);
    }

    @PutMapping(value = "/orders/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateOrder(@RequestBody OrderList order, @PathVariable Long id) {
        orderListService.updateOrder(order, id);
    }

    @DeleteMapping(value = "/orders/{id}")
    public void deleteOrderList(@PathVariable Long id) {
        orderListService.deleteOrder(id);
    }
}
