package jp.co.navitime.j05.p03.c02;

/**
 *  円を扱うクラスです。
 */
public class Circle implements Measurable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double volume() {
        return 0.0;
    }
}
