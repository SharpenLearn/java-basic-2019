package jp.co.navitime.j02.p14;

/*
 * 同じ文字列を比較した結果を返す以下 compareSameInteger メソッドは,
 * このままでは正しく動作しない.
 * *文字列定義は変更せずに* 正しく動作するよう修正せよ.
 */
public class Main {

    public static boolean compareSameStrings() {
        final String value = "foo";
        final String a = new String(value);
        final String b = new String(value);

        // TODO: Fix below.
        return a == b;
    }
}
