package jp.co.navitime.j03.p03;

/*
 * 次の Point クラスはコンストラクタが private になっており
 * new を使ってインスタンス化することができない。
 * 代わりに of() という静的メソッドでインスタンス化を行うことができる。
 *
 * 一般的にコンストラクタが多い時は of() のような静的メソッドを使って
 * インスタンス化を行うのがよいと言われている。
 *
 * その理由について調査し、of() のメリットを述べよ。
 *
 * 回答:
 *
 */
public class Point {
    private int x;
    private int y;

    public static Point of(int x, int y) {
        return new Point(x, y);
    }

    private Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
