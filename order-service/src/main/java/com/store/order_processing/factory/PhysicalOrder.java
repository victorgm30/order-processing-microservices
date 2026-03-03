package com.store.order_processing.factory;

public class PhysicalOrder  implements Order {
    @Override
    public String getDescription() {
        return "Pedido físico criado";
    }

}
