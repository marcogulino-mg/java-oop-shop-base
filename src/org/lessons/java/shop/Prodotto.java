package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Prodotto {

    // * Attributes
    private int code;
    public String name;
    public String description;
    public String brand;
    public float price;
    public int iva;

    // * Methods

    // * Construct
    public Prodotto(String name, String description, String brand, float price, int iva) {
        this.code = generateCode();
        this.name = name;
        this.description = description;
        this.brand = brand;
        this.price = price;
        this.iva = iva;
    }

    // * Other Methods
    // Random code generator
    private int generateCode() {
        Random rand = new Random();
        return 100000000 + rand.nextInt(50000);
    }

    // Price with IVA
    public float taxedPrice() {
        float updatedPrice = this.price + (this.price * (this.iva / 100f));
        BigDecimal bd = new BigDecimal(updatedPrice);

        bd = bd.setScale(2, RoundingMode.DOWN);

        return bd.floatValue();
    }

    // * Getter
    public int getCode() {
        return this.code;
    }

    public String getName() {
        return this.name;
    }

    // Show product code+name
    public String infosProd() {
        return this.code + this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public String getBrand() {
        return this.brand;
    }

    public float getPrice() {
        return this.price;
    }

    public int getIva() {
        return this.iva;
    }

    // * Setter

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

}
