package com.store.order_processing.validation;
import com.store.order_processing.dto.OrderRequest;

public abstract class AbstractOrderValidator implements OrderValidator {
    private OrderValidator next;

    @Override
    public void setNext(OrderValidator next) {
        this.next = next;
    }

    @Override
    public void validate(OrderRequest order) {
        handle(order);
        if (next != null) {
            next.validate(order);
        }
    }

    protected abstract void handle(OrderRequest order);

}