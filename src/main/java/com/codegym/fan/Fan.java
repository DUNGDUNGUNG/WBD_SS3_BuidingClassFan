package com.codegym.fan;

public class Fan {
    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int FAST = 3;

    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    Fan() {
    }

    int getSpeed() {
        return speed;
    }

    void setSpeed(int speed) {
        this.speed = speed;
    }

    boolean isOn() {
        return on;
    }

    void setOn(boolean on) {
        this.on = on;
    }

    double getRadius() {
        return radius;
    }

    void setRadius(double radius) {
        this.radius = radius;
    }

    String getColor() {
        return color;
    }

    void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        String str = null;
       if (on){
           str= "Fan{" +
                   ", speed=" + speed +
                   ", color=" + color +
                   ", radius="+ radius +
                   ", fan is on" +
                   "}";
       }else {
           str= "Fan{" +
                   ", color=" + color +
                   ", radius=" + radius +
                   ", fan is off" +
                   "}";
       }
       return str;
    }
}
