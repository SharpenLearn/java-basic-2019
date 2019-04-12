package jp.co.navitime.j05.p03.c01;

/**
 * 長方形を扱うクラスです。
 */
public class Rectangle {
    private int longSide;
    private int narrowSide;

    public Rectangle(int longSide, int narrowSide) {
        this.longSide = longSide;
        this.narrowSide = narrowSide;
    }

    public void setLongSide(int longSide) {
        this.longSide = longSide;
    }

    public int getLongSide() {
        return longSide;
    }

    public void setNarrowSide(int narrowSide) {
        this.narrowSide = narrowSide;
    }

    public int getNarrowSide() {
        return narrowSide;
    }
}
