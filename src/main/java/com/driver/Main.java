package com.driver;

public class Main {
  public static void main(String[] args) {
        Pizza regularPizza1 = new Pizza(true, false);
        regularPizza1.addExtraCheese(80);
        regularPizza1.addExtraToppings(70);
        regularPizza1.addPaperBag(20);
        System.out.println(regularPizza1.generateBill());
        Pizza deluxePizza1 = new DeluxePizza(false);
        deluxePizza1.addExtraCheese(80);
        deluxePizza1.addExtraToppings(120);
        System.out.println(deluxePizza1.generateBill());
    }
}