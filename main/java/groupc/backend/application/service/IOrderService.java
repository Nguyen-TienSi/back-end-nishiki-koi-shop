package groupc.backend.application.service;

import groupc.backend.application.entity.Order;

import java.util.List;

public interface IOrderService {
    public List<Order> getOrderList();
    public Order getOrderById(int id);
    public Order createOrder(Order order);
    public Order updateOrder(int id, Order order);
    public void deleteOrder(int id);
}
