package ua.hillelit.lms.maps;

import ua.hillelit.lms.maps.model.cofee.order.CoffeeOrderBoard;

public class Main {

  public static void main(String[] args) {

    CoffeeOrderBoard coffeeOrderBoard = new CoffeeOrderBoard();

    coffeeOrderBoard.add("Bob");
    coffeeOrderBoard.add("Jack Sparrow");
    coffeeOrderBoard.add("Alien");
    coffeeOrderBoard.add("Mary");
    coffeeOrderBoard.add("John Wick");

    System.out.println("-".repeat(20));
    coffeeOrderBoard.draw();

    System.out.println(coffeeOrderBoard.deliver().getName());
    System.out.println(coffeeOrderBoard.deliver(4).getName());

    System.out.println("-".repeat(20));
    coffeeOrderBoard.draw();

    coffeeOrderBoard.add("Lip");

    System.out.println("-".repeat(20));
    coffeeOrderBoard.draw();
  }
}