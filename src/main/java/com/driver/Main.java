package com.driver;

public class Main {
  public static void main(String[] args) {
        Pizza regularPizza1 = new Pizza(true);
        regularPizza1.addExtraCheese(80);
        regularPizza1.addExtraToppings(70);
        regularPizza1.addPaperBag(20);
        System.out.println(regularPizza1.generateBill());
        
        Pizza deluxePizza1 = new DeluxePizza(false);
        deluxePizza1.addExtraCheese(Pizza.EXTRA_CHEESE_PRICE);
        deluxePizza1.addExtraToppings(deluxePizza1.isVeg() ? Pizza.VEG_EXTRA_TOPPINGS_PRICE : Pizza.NON_VEG_EXTRA_TOPPINGS_PRICE);
        System.out.println(deluxePizza1.generateBill());

  }
}