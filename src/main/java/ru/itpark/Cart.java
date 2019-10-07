package ru.itpark;

public class Cart {
    private int goodCount = 0;
    private int amount;
    private int amountWithDiscount;

    public int getGoodCount() {
        return goodCount;
    }

    public int getAmount() {
        return amount;
    }

    public int getAmountWithDiscount() {
        return amountWithDiscount;
    }

    public void add(Good good) {
        amount += good.getPrice();
        amountWithDiscount += good.getPriceWithDiscount();
        goodCount++;
    }

    public void remove(Good good) {
        amount -= good.getPrice();
        amountWithDiscount -= good.getPriceWithDiscount();
        goodCount--;
    }


}
