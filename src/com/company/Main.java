package com.company;

public class Main {

    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.toString();
        Ball ball = new Ball();
        ball.toString();
        Book book = new Book();
        book.toString();
        Dog dog = new Dog("Sharick", 3);
        Dog_kennel kennel = new Dog_kennel(10);
        dog.AgeConvert();
        dog.toString();
        kennel.say();
    }
}
