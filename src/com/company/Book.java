package com.company;

public class Book {
    private int pages = 582;
    private int weight = 100;
    private int volume = 100;

    @Override
    public String toString() {
        System.out.println("КНИГА\nКол-во страниц " + pages + "\nВес " + weight + " грамм" + "\nОбъем " + volume);
        return super.toString();
    }
}
