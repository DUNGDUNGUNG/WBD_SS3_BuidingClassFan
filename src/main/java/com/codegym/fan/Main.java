package com.codegym.fan;

public class Main {
    public static void main(String[] args) {

        Fan fan = new Fan();
        System.out.println(fan.getSpeed());
        System.out.println(fan.getRadius());
        System.out.println(fan.isOn());
        System.out.println(fan.getColor());
        System.out.println(fan.toString());


        Fan fan1 = new Fan();
        fan1.setSpeed(3);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);
        System.out.println(fan1.getSpeed());
        System.out.println(fan1.getRadius());
        System.out.println(fan1.getColor());
        System.out.println(fan1.isOn());
        System.out.println(fan1.toString());
    }
}
