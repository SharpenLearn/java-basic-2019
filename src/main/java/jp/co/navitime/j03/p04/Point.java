package jp.co.navitime.j03.p04;

/*
 * 3 次元座標を扱う Point クラスを、下記の条件でインスタンス化ができるようにせよ。
 * ただし、別クラスを作成することで解決してもよい。
 *
 * 1. x, y, z のうち任意の 1 つ以上の値を渡せる(例えば x だけ, x, z だけを渡せる)
 * 2. x, y, z の値は順不同で渡せる
 * 3. インスタンス化で指定されなかった座標はゼロで初期化する
 * 4. 将来的に1-2次元増やす可能性があるため、簡単に追加できるようにする
 */
public class Point {
    private int x;
    private int y;
    private int z;

    public Point() {
    }
}
