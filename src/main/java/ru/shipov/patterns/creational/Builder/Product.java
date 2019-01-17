package ru.shipov.patterns.creational.Builder;

public class Product {
    private final String PartA;
    private final String PartB;
    private final String PartC;

    Product(String partA, String partB, String partC) {
        PartA = partA;
        PartB = partB;
        PartC = partC;
    }

    @Override
    public String toString() {
        return "Product{" +
                "PartA='" + PartA + '\'' +
                ", PartB='" + PartB + '\'' +
                ", PartC='" + PartC + '\'' +
                '}';
    }
}
