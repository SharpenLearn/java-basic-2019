package jp.co.navitime.j06.p05;


import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/*
 * ファイルパスを引数にとってファイルを処理する実装は,
 * ファイルシステムに依存するので単体テストしづらい.
 * たとえば, ファイルの読み込みテストは,
 * 指定の場所にファイルが存在することを保証せねばならない.
 * また, ファイルの書き込みテストであれば,
 * 指定したパスへのファイル書き込みができるとは限らない.
 *
 * そこで, ファイルシステムに依存しない設計を考える.
 * 指示に従い, ファイルに文字列を入出力するプログラムを実装せよ.
 *
 * 1. java.io.Reader オブジェクトを受け取り,
 *    Reader の内容を文字列として読み取るメソッド read について,
 *    実装例をもとに単体テストを完成させよ.
 * 2. read メソッドを, 実装例を用いて完成させよ.
 * 3. java.io. オブジェクトと文字列を受け取り,
 *    文字列を Writer に書き込むメソッド write について,
 *    実装例をもとに単体テストを完成させよ.
 * 4. write メソッドを, 実装例を用いて完成させよ.
 * 5. read メソッド, write メソッドを用いて, main メソッドに以下を実装せよ.
 *     - コマンドライン引数 1 つ目に指定されたファイルを読み込む.
 *     - コマンドライン引数 2 つ目に指定されたファイルに,
 *       読み込んだ文字列を出力する.
 */
public class Main {

    public static String read(Reader reader) {
        // TODO: Implement here.
        return null;
    }

    public static void write(Writer writer, String content) {
        // TODO: Implement here.
    }

    public static void main(String[] args) {
        // TODO: Implement here.
    }
}
