package ru.itpark;

public class Good {
    private long id;
    private String name;
    private String imageUrl;
    private int price;
    private int discount;
    private int priceWithDiscount;
    private boolean available;
    private String seller;


    public Good(long id, String name, String imageUrl, int price, int discount, int priceWithDiscount, boolean available, String seller) {
        this.id = id;
        this.name = name;
        this.imageUrl = imageUrl;
        this.price = price;
        this.discount = discount;
        this.priceWithDiscount = priceWithDiscount;
        this.available = available;
        this.seller = seller;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int getPriceWithDiscount() {
        return priceWithDiscount;
    }

    public void setPriceWithDiscount(int priceWithDiscount) {
        this.priceWithDiscount = priceWithDiscount;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }
}
