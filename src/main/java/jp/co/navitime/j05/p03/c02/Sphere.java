package jp.co.navitime.j05.p03.c02;

/**
 *  球を扱うクラスです。
 */
public class Sphere implements Measurable {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public double area() {
        return 4.0 * Math.PI * radius * radius;
    }

    public double volume() {
        return 4.0 * Math.PI * radius * radius * radius / 3.0;
    }
}
