package com.food.ordering.system.order.service.domain.entity;

import com.food.ordering.system.domain.entity.AggregateRoot;
import com.food.ordering.system.domain.valueobject.RestaurantID;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class Restaurant extends AggregateRoot<RestaurantID> {
    private final List<Product> products;
    private boolean active;
}
