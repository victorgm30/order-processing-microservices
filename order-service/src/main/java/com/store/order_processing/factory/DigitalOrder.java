package com.store.order_processing.factory;

public class DigitalOrder implements Order {
    @Override
    public String getDescription() {
        return "Pedido digital criado";
    }

}
