package com.store.order_processing.factory;

import com.store.order_processing.model.enums.OrderType;

public class OrderFactory {

    public static Order createOrder(String type) {

        OrderType orderType = OrderType.valueOf(type.toUpperCase());
        
        return switch (orderType) {
            case PRESENCIAL -> new PhysicalOrder();
            case DIGITAL -> new DigitalOrder();
        };
    }
}
