package com.company;

public class Main extends Object {

    public static void main(String[] args) {
        House blueHouse = new House("blue");
        House anotherHouse = blueHouse;

        System.out.println(blueHouse.getColor());
        System.out.println(anotherHouse.getColor());


        anotherHouse.setColor("red");
        System.out.println(blueHouse.getColor());
        System.out.println(anotherHouse.getColor());

    }

}
