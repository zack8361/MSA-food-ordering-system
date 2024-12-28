package com.food.ordering.system.order.service.domain.valueobject;

import com.food.ordering.system.domain.valueobject.BaseID;

public class OrderItemID extends BaseID<Long> {

    protected OrderItemID(Long value) {
        super(value);
    }
}
