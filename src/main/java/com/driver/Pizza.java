package com.driver;

public class Pizza {
    private boolean isVeg;
    private double basePrice;
    private boolean extraCheeseAdded;
    private boolean extraToppingsAdded;
    private boolean paperBagAdded;
    protected static final double VEG_BASE_PRICE = 300;
    protected static final double NON_VEG_BASE_PRICE = 400;
    protected static final double EXTRA_CHEESE_PRICE = 80;
    protected static final double VEG_EXTRA_TOPPINGS_PRICE = 70;
    protected static final double NON_VEG_EXTRA_TOPPINGS_PRICE = 120;
    protected static final double PAPER_BAG_PRICE = 20;

    public Pizza(boolean isVeg) {
        this.isVeg = isVeg;
        this.basePrice = isVeg ? VEG_BASE_PRICE : NON_VEG_BASE_PRICE;
    }
    
    public boolean isVeg() {
        return isVeg;
    }

    public void addExtraCheese(double price) {
        if (!extraCheeseAdded) {
            extraCheeseAdded = true;
            basePrice += price;
        }
    }

    public void addExtraToppings(double price) {
        if (!extraToppingsAdded) {
            extraToppingsAdded = true;
            basePrice += price;
        }
    }

    public void addPaperBag(double price) {
        if (!paperBagAdded) {
            paperBagAdded = true;
            basePrice += price;
        }
    }

    public String generateBill() {
        StringBuilder bill = new StringBuilder();
        bill.append("Base Price Of The Pizza: ").append(basePrice).append("\n");
        if (extraCheeseAdded) {
            bill.append("Extra Cheese Added: ").append(EXTRA_CHEESE_PRICE).append("\n");
        }
        if (extraToppingsAdded) {
            bill.append("Extra Toppings Added: ").append(isVeg ? VEG_EXTRA_TOPPINGS_PRICE : NON_VEG_EXTRA_TOPPINGS_PRICE).append("\n");
        }
        if (paperBagAdded) {
            bill.append("Paperbag Added: ").append(PAPER_BAG_PRICE).append("\n");
        }
        bill.append("Total Price: ").append(basePrice).append("\n");
        return bill.toString();
    }
}
