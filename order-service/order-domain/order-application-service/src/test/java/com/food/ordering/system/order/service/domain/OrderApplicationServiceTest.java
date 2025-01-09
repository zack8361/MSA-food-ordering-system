package com.food.ordering.system.order.service.domain;


import com.food.ordering.system.order.service.domain.dto.create.CreateOrderCommand;
import com.food.ordering.system.order.service.domain.dto.create.OrderAddress;
import com.food.ordering.system.order.service.domain.dto.create.OrderItem;
import com.food.ordering.system.order.service.domain.mapper.OrderDataMapper;
import com.food.ordering.system.order.service.domain.ports.input.service.OrderApplicationService;
import com.food.ordering.system.order.service.domain.ports.output.repository.CustomerRepository;
import com.food.ordering.system.order.service.domain.ports.output.repository.OrderRepository;
import com.food.ordering.system.order.service.domain.ports.output.repository.RestaurantRepository;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@SpringBootTest(classes = OrderTestConfiguration.class)
public class OrderApplicationServiceTest {

    @Autowired
    private OrderApplicationService orderApplicationService;

    @Autowired
    private OrderDataMapper orderDataMapper;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private RestaurantRepository restaurantRepository;


    private CreateOrderCommand createOrderCommand;
    private CreateOrderCommand createOrderCommandWrongPrice;
    private CreateOrderCommand createOrderCommandWrongProductPrice;
    private final UUID CUSTOMER_ID = UUID.fromString("d215b5f");
    private final UUID RESTAURANT_ID = UUID.fromString("d215b5f-1");
    private final UUID PRODUCT_ID = UUID.fromString("d215b5f-12");
    private final UUID ORDER_ID = UUID.fromString("d215b5f-123");
    private final BigDecimal PRICE = new BigDecimal("200.00");


    @BeforeAll
    public void init() {
         createOrderCommand = CreateOrderCommand.builder()
                .customerId(CUSTOMER_ID)
                .restaurantId(RESTAURANT_ID)
                .orderAddress(OrderAddress.builder()
                        .street("Street")
                        .postalCode("123456")
                        .city("City")
                        .build())
                .price(PRICE)
                .orderItems(List.of(OrderItem.builder()
                                .productId(PRODUCT_ID)
                                .price(new BigDecimal("100.00"))
                                .quantity(2)
                                .build(),
                        OrderItem.builder()
                                .productId(UUID.fromString("d215b5f-13"))
                                .price(new BigDecimal("50.00"))
                                .quantity(1)
                                .build()))
                .build();

         createOrderCommandWrongPrice = CreateOrderCommand.builder()
                .customerId(CUSTOMER_ID)
                .restaurantId(RESTAURANT_ID)
                .orderAddress(OrderAddress.builder()
                        .street("Street")
                        .postalCode("123456")
                        .city("City")
                        .build())
                .price(PRICE)
                .orderItems(List.of(OrderItem.builder()
                                .productId(PRODUCT_ID)
                                .price(new BigDecimal("100.00"))
                                .quantity(2)
                                .build(),
                        OrderItem.builder()
                                .productId(UUID.fromString("d215b5f-13"))
                                .price(new BigDecimal("50.00"))
                                .quantity(1)
                                .build()))
                .build();

        createOrderCommandWrongProductPrice = CreateOrderCommand.builder()
                .customerId(CUSTOMER_ID)
                .restaurantId(RESTAURANT_ID)
                .orderAddress(OrderAddress.builder()
                        .street("Street")
                        .postalCode("123456")
                        .city("City")
                        .build())
                .price(PRICE)
                .orderItems(List.of(OrderItem.builder()
                                .productId(PRODUCT_ID)
                                .price(new BigDecimal("100.00"))
                                .quantity(2)
                                .build(),
                        OrderItem.builder()
                                .productId(UUID.fromString("d215b5f-13"))
                                .price(new BigDecimal("50.00"))
                                .quantity(1)
                                .build()))
                .build();

    }

}
