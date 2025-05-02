package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {

        // Obj instances
        Prodotto latte = new Prodotto("Parmalat Latte", "Latte Scremato", 20.10f, 4);

        // Methods
        // Show price without IVA
        System.out.println(latte.basePrice());
    }
}
