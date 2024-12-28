package com.food.ordering.system.domain.valueobject;

import java.util.Objects;

public abstract class BaseID<T> {
    private final T value;

    protected BaseID(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    @Override
    public boolean equals(Object object) {

        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        BaseID<?> baseID = (BaseID<?>) object;
        return Objects.equals(value, baseID.value);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }
}
