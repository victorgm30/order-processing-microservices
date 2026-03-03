package com.store.order_processing.validation;
import com.store.order_processing.dto.OrderRequest;

//Interface Base

public interface OrderValidator {
    void setNext(OrderValidator next);
    void validate(OrderRequest order);
}
