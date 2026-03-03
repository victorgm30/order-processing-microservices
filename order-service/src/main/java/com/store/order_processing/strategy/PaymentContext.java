package com.store.order_processing.strategy;
import org.springframework.stereotype.Component;
import java.util.Map;

@Component
public class PaymentContext {

    private final Map<String, PaymentStrategy> strategies;

    public PaymentContext(Map<String, PaymentStrategy> strategies) {
        this.strategies = strategies;
    }

    public void executePayment(String paymentMethod, Double amount) {
        PaymentStrategy strategy = strategies.get(paymentMethod.toUpperCase());

        if (strategy == null) {
            throw new IllegalArgumentException("Método de pagamento inválido: " + paymentMethod);
        }
        strategy.pay(amount);
    }

}
