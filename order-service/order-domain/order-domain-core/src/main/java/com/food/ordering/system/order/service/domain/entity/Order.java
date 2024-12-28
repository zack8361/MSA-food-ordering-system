package com.food.ordering.system.order.service.domain.entity;

import com.food.ordering.system.domain.entity.AggregateRoot;
import com.food.ordering.system.domain.valueobject.*;
import com.food.ordering.system.order.service.domain.valueobject.StreetAddress;
import com.food.ordering.system.order.service.domain.valueobject.TrackingID;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.util.List;
import java.util.UUID;

@Getter
@Builder
@ToString
public class Order extends AggregateRoot<OrderId> {
    private final CustomerID customerID;
    private final RestaurantID restaurantID;
    private final StreetAddress deliveryAddress;
    private final Money price;
    private final List<OrderItem> items;

    // 생성 후 비즈니스 로직에서 설정하기 때문에 final 뺌.
    private TrackingID trackingID;
    private OrderStatus orderStatus;
    private List<String> failureMessages;

    public void initializeOrder() {
        setId(new OrderId(UUID.randomUUID()));
        trackingID = new TrackingID(UUID.randomUUID());
        orderStatus = OrderStatus.PENDING;
        initializeOrderItems();
    }

    private void initializeOrderItems() {
        long itemId = 1;
        for (OrderItem item : items) {
            item.ini
        }
    }
}
