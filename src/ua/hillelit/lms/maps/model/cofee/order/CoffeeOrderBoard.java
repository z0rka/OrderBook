package ua.hillelit.lms.maps.model.cofee.order;

import java.util.LinkedList;
import java.util.List;

public class CoffeeOrderBoard {

  private List<Order> ordersBoard = new LinkedList<>();
  private int orderNumber;

  public CoffeeOrderBoard() {
  }

  public void add(String name) {
    orderNumber++;

    ordersBoard.add(new Order(orderNumber, name));
  }

  public Order deliver() {
    int getOrderNumber = orderNumber - ordersBoard.size();

    return ordersBoard.remove(getOrderNumber);
  }

  public Order deliver(int orderNumber) {
    for (Order order : ordersBoard) {
      if (order.getOrderNumber() == orderNumber) {
        ordersBoard.remove(order);
        return order;
      }
    }
    return null;
  }

  public void draw() {
    for (Order order : ordersBoard) {
      System.out.println(order.getOrderNumber() + " | " + order.getName());
    }
  }
}
