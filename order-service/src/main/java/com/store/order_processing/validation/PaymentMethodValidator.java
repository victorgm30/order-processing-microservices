package com.store.order_processing.validation;

import com.store.order_processing.dto.OrderRequest;

public class PaymentMethodValidator extends AbstractOrderValidator {
    @Override
    protected void handle(OrderRequest order) {
        if (order.getPaymentMethod() == null || order.getPaymentMethod().isEmpty()) {
            throw new IllegalArgumentException("Método de pagamento é obrigatório.");
        }
    }

}
