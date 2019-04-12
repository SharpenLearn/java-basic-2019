package jp.co.navitime.j03.p05;

/*
 * LineNumberPrinter クラスは標準出力に出力したメッセージの行数を管理するクラスである。
 * このクラスの問題点はインスタンス化するたびに行数がゼロにクリアされるため
 * プログラム全体で標準出力に何行出力したのかが把握できないことである。
 * この問題を解決するため次の要件を満たすようにクラスを修正せよ。
 *
 * 1. 行数がクリアされないようインスタンスは同じものを何度も使いまわせるようにする
 * 2. そのインスタンスはすべてのクラスから参照可能にする
 * 3. そのインスタンスは振る舞いを変更しやすくするため private にする
 * 4. そのインスタンスの参照先を変えないよう final にする
 * 5. 下記の Main クラスは LineNumberPrinter のインスタンス化をしている行のみ修正可とし
 *    新たなメンバなどは追加してはならない
 */
public class Main {

    public static void main(String[] args) {
        LineNumberPrinter logger = new LineNumberPrinter();

        logger.printMessage("Hello, World!");
        logger.printMessage("Hello, World!");
        logger.printMessage("Hello, World!");

        logger.printLineNumber();
    }
}
