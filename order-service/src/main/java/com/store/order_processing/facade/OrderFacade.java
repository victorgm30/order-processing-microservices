package com.store.order_processing.facade;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.store.order_processing.dto.OrderRequest;
import com.store.order_processing.factory.OrderFactory;
import com.store.order_processing.validation.*;
import com.store.order_processing.factory.Order;
import com.store.order_processing.repository.OrderRepository;
import com.store.order_processing.model.OrderEntity;


@Service
public class OrderFacade {
    private final OrderRepository orderRepository;
    private final RestTemplate restTemplate;
    
    public OrderFacade(OrderRepository orderRepository, RestTemplate restTemplate) {
        this.orderRepository = orderRepository;
        this.restTemplate = restTemplate;
    }

    public String processOrder(OrderRequest request) {
        // Validate order
        OrderValidator value = new ValueValidator();
        OrderValidator type = new TypeValidator();
        OrderValidator payment = new PaymentMethodValidator();

        value.setNext(type);
        type.setNext(payment);

        value.validate(request);
        
        // Create an order
        Order order = OrderFactory.createOrder(request.getType());
        
        // Process payment
        String paymentResponse = restTemplate.postForObject(
        "http://payment-service:8081/payments",
        request,
        String.class
        );

        if (!"PAYMENT_APPROVED".equals(paymentResponse)) {
        throw new RuntimeException("Pagamento não aprovado!");
        }

        // Save order to database
        OrderEntity entity = new OrderEntity();
        entity.setType(request.getType());
        entity.setPaymentMethod(request.getPaymentMethod());
        entity.setStatus("PROCESSADO.");

        orderRepository.save(entity);

        return order.getDescription() + " e pagamento processado com sucesso!";
    }

}
