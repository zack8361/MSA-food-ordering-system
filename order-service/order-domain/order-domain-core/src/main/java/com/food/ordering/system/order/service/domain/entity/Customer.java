package com.food.ordering.system.order.service.domain.entity;

import com.food.ordering.system.domain.entity.AggregateRoot;
import com.food.ordering.system.domain.valueobject.CustomerID;
import lombok.Getter;

@Getter
public class Customer extends AggregateRoot<CustomerID> {

}
