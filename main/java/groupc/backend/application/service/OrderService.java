package groupc.backend.application.service;

import groupc.backend.application.entity.Order;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class OrderService implements IOrderService {
    private static final ArrayList<Order> orders = new ArrayList<Order>();

    @Override
    public List<Order> getOrderList() {
        return orders;
    }

    @Override
    public Order getOrderById(int id) {
        for (Order order : orders) {
            if (order.getId() == id) {
                return order;
            }
        }
        return null;
    }

    @Override
    public Order createOrder(Order order) {
        return null;
    }

    @Override
    public Order updateOrder(int id, Order order) {
        return null;
    }

    @Override
    public void deleteOrder(int id) {

    }
}
