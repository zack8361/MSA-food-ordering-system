package com.food.ordering.system.order.service.domain.ports.output.repository;

import com.food.ordering.system.order.service.domain.entity.Order;
import com.food.ordering.system.order.service.domain.valueobject.TrackingID;

import java.util.Optional;



public interface OrderRepository {

    Order save(Order order);

    // 해당 추적 ID로 주문을 찾을 수 있고, 못찾을수도 있기 떄문에 Optional로 감싸서 반환
    Optional<Order> findByTrackingId(TrackingID trackingID);
}
