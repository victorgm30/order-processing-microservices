package com.store.order_processing.validation;

import com.store.order_processing.dto.OrderRequest;

public class TypeValidator extends AbstractOrderValidator {
    @Override
    protected void handle(OrderRequest order) {
        if (order.getType() == null || order.getType().isEmpty()) {
            throw new IllegalArgumentException("Tipo do pedido é obrigatório.");
        }
    }

}
