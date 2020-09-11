package com.company;

public class Shape {
    private int weight=100;
    private int height=100;
    private int corners=5;
    private int peri=500;
    @Override
    public String toString() {
        System.out.println("Фигура\nВес " + weight + "\nВысота " + height + "\nКол-во углов " + corners + "\nПериметр " + peri);
        return super.toString();
    }
}
