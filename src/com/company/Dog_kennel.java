package com.company;

public class Dog_kennel {
    private Dog[] kennel = new Dog[10];

    public Dog_kennel(int number){

        for(int i = 0;i<number; i++) kennel[i] = new Dog("Puppie", (int)(Math.random()*10+1));
    }

    public void say(){
        for(int i = 0;i< kennel.length; i++) {
            kennel[i].AgeConvert();
            kennel[i].toString();
        }
    }

}
