package ru.itpark;

public class Cart {
    private int goodCount;
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

    public void add(Good good, int count) {
        amount += good.getPrice() * count;
        amountWithDiscount += good.getPriceWithDiscount() * count;
        goodCount += count;
    }

    public void remove(Good good, int count) {
        amount -= good.getPrice() * count;
        amountWithDiscount -= good.getPriceWithDiscount() * count;
        goodCount -= count;
    }


}
