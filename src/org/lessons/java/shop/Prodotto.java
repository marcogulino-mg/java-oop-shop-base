package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
    // Attributes
    public int code;
    public String name;
    public String description;
    public float price;
    public int iva;

    // Methods

    // Construct
    public Prodotto(String name, String description, float price, int iva) {
        this.code = generateCode();
        this.name = name;
        this.description = description;
        this.price = price;
        this.iva = iva;
    }

    // Random code generator
    public int generateCode() {
        Random rand = new Random();
        return 100000000 + rand.nextInt(50000);
    }
}
