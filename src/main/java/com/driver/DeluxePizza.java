package com.driver;
public class DeluxePizza extends Pizza {
    public DeluxePizza(boolean isVeg) {
        super(isVeg);
        addExtraCheese(EXTRA_CHEESE_PRICE);
        addExtraToppings(isVeg ? VEG_EXTRA_TOPPINGS_PRICE : NON_VEG_EXTRA_TOPPINGS_PRICE);
    }
}