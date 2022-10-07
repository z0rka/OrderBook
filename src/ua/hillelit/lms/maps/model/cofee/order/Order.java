package ua.hillelit.lms.maps.model.cofee.order;

public class Order {

  private String name;
  private int orderNumber;

  public Order(int orderNumber, String name) {
    this.orderNumber = orderNumber;
    this.name = name;
  }

  public int getOrderNumber() {
    return orderNumber;
  }

  public String getName() {
    return name;
  }
}
