package com.shapes;

import java.util.ArrayList;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List colors = new ArrayList();

        colors.add("green");
        colors.add("red");
        colors.add("blue");
        colors.add("yellow");
        colors.remove(2);
        colors.add("cyan");

//        System.out.print(colors);
//
//        System.out.print("Result A " + 0 + 1);
//        System.out.print("Result B " + (1) + (2));

        Flight f1 = new Flight();
        System.out.println("Result A " + f1.seats);

        Flight f2 = new CargoFlight();
        System.out.println("Result B " + f2.seats);

        CargoFlight f3 = new CargoFlight();
        System.out.println("Result B " + f3.seats);
    }



}

class Flight {
    public int seats = 150;
}

class CargoFlight extends Flight {
    public int seats = 12;
}