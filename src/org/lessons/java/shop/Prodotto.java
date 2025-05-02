package org.lessons.java.shop;

public class Prodotto {
    // Attributes
    public int code;
    public String name;
    public String description;
    public float price;
    public int iva;

    // Methods

    // Construct
    public Prodotto(int code, String name, String description, float price, int iva) {
        this.code = code;
        this.name = name;
        this.description = description;
        this.price = price;
        this.iva = iva;
    }
}
