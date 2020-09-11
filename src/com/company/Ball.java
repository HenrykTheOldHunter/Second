package com.company;

public class Ball {
    private int rad = 30;
    private int diam = 60;
    private int capacity = 500;
    private int power = 700;

    @Override
    public String toString() {
        System.out.println("МЯЧ\nРадиус " + rad + "\nДиаметр " + diam + "\nОбъем " + capacity + "\nСила выделяемая при ударе " + power);
        return super.toString();
    }
}
