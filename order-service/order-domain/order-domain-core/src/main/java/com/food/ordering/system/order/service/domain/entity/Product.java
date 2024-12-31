package com.food.ordering.system.order.service.domain.entity;

import com.food.ordering.system.domain.entity.BaseEntity;
import com.food.ordering.system.domain.valueobject.Money;
import com.food.ordering.system.domain.valueobject.ProductID;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;



@Getter
public class Product extends BaseEntity<ProductID> {
    private String name;
    private Money price;

    public Product(ProductID id, String name, Money price) {
        super.setId(id);
        this.name = name;
        this.price = price;
    }


    public Product(ProductID id){
        super.setId(id);
    }
    public void updateWithConfirmedNameAndPrice(String name, Money price) {
        this.name = name;
        this.price = price;
    }
}
