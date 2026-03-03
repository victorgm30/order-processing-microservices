package com.store.order_processing.strategy;
import org.springframework.stereotype.Component;

@Component("CREDIT_CARD")

public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(Double amount) {
        System.out.println("Pagamento com cartão: " + amount);
    }

}
