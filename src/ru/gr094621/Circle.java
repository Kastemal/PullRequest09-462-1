package ru.gr094621;

import java.awt.*;
import java.util.Random;

class Circle {
    private int x;
    private int y;
    private Color color;
    private int radius;

    private static final Random random = new Random();


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Circle(int minRadius, int maxRadius) {
        this.color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
    }

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getRadius() {
        return radius;
    }
}