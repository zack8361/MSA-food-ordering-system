package com.food.ordering.system.order.service.domain;


import com.food.ordering.system.order.service.domain.dto.track.TrackOrderQuery;
import com.food.ordering.system.order.service.domain.dto.track.TrackOrderResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component

public class OrderTrackCommandHandler {

    TrackOrderResponse trackOrder(TrackOrderQuery trackOrderQuery) {
        // 주문 추적 ID로 주문을 찾는다.
        return new TrackOrderResponse(null, null, null);
    }
}
