package com.example.lab5_maithanhtrong_18064861;

public class Donut {
    private String name;
    private String type;
    private double price;
    private int imageResourceId;

    public static final com.hfad.mobile_lab05.Donut[] donuts = {
            new com.hfad.mobile_lab05.Donut("Yellow Donut", "Spicy tasty donut family", 10.00, R.drawable.donut_yellow),
            new com.hfad.mobile_lab05.Donut("White Donut", "Spicy tasty donut family", 20.00, R.drawable.tasty_donut),
            new com.hfad.mobile_lab05.Donut("Green Donut", "Spicy tasty donut family", 30.00, R.drawable.green_donut),
            new com.hfad.mobile_lab05.Donut("Red Donut", "Spicy tasty donut family", 40.00, R.drawable.donut_red)
    };

    public Donut(String name, String type, double price, int imageResourceId) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }
}
