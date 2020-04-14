package com.restaurant.pizzeria.repository;

import com.restaurant.pizzeria.entity.OrderList;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderListRepository extends CrudRepository<OrderList, Long> {}
