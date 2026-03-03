package com.store.order_processing.controller;
import org.springframework.web.bind.annotation.*;
import com.store.order_processing.dto.OrderRequest;
import com.store.order_processing.facade.OrderFacade;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderFacade orderFacade;

    public OrderController(OrderFacade orderFacade) {
        this.orderFacade = orderFacade;
    }

    @PostMapping
    public String createOrder(@RequestBody OrderRequest orderRequest) {
        return orderFacade.processOrder(orderRequest);
    }

}
