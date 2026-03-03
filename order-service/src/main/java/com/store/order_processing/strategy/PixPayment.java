package com.store.order_processing.strategy;
import org.springframework.stereotype.Component;

@Component("PIX")

public class PixPayment implements PaymentStrategy {
    @Override
    public void pay(Double amount) {
        System.out.println("Pagamento via Pix: " + amount);
    }

}
