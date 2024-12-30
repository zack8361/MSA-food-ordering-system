package com.food.ordering.system.domain.valueobject;

public enum OrderStatus {
    // 주문 상태
    PENDING,
    // 주문 대기
    PAID,
    // 결제 완료
    APPROVED,
    // 주문 승인
    CANCELLING,
    // 주문 취소 중
    CANCELLED,
}
