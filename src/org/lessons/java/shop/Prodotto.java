package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
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

    // Price without IVA
    public float basePrice() {
        return this.price;
    }

    // Price with IVA
    public float taxedPrice() {
        float updatedPrice = this.price + (this.price * (this.iva / 100f));
        BigDecimal bd = new BigDecimal(updatedPrice);

        bd = bd.setScale(2, RoundingMode.HALF_UP);

        return bd.floatValue();
    }

    // Show product code+name
    public String infosProd() {
        return this.code + this.name;
    }

}
