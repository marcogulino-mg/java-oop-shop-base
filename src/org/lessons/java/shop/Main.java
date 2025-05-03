package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {

        // Obj instances
        Prodotto latte = new Prodotto("Parmalat Latte", "Latte Scremato", 32.10f, 4);
        Prodotto gpuNvidia5070 = new Prodotto("Nvidia RTX 5070 16GB", "Nvidia graphics card", 599.99f, 22);

        // Methods

        // Show price without IVA
        System.out.println(latte.basePrice());
        System.out.println(gpuNvidia5070.basePrice());

        // Show price with IVA
        System.out.println(latte.taxedPrice());
        System.out.println(gpuNvidia5070.taxedPrice());

        // Show Product code+name
        System.out.println(latte.infosProd());
        System.out.println(gpuNvidia5070.infosProd());

        // Show Product code
        System.out.println(latte.showCode());
        System.out.println(gpuNvidia5070.showCode());
    }
}
