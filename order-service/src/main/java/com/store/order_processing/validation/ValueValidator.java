package com.store.order_processing.validation;
import com.store.order_processing.dto.OrderRequest;


public class ValueValidator extends AbstractOrderValidator {
    @Override
    protected void handle(OrderRequest order) {
        if (order.getAmount() == null || order.getAmount() <= 0) {
            throw new IllegalArgumentException("Valor inválido.");
        }
    }

}
