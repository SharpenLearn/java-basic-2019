package jp.co.navitime.j04.p03;

/*
 * 以下の要件を満たすよう実装せよ.
 *
 * - Name クラスを, Comparable<Name> インターフェースを実装するよう改修する.
 *   compareTo は次のように実装する.
 *     - familyName が異なるとき, familyName の比較結果を返却する.
 *     - familyName が同じで firstName が異なるとき, firstName の比較結果を返却する.
 *     - compareTo の動作を確認する単体テストも実装する.
 * - Comparator<Name> クラスを実装した FirstNameComparator を新規作成する.
 *   compare は次のように実装する.
 *     - firstName 異なるとき, firstName の比較結果を返却する.
 *     - firstName が同じで familyName が異なるとき, familyName の比較結果を返却する.
 *     - compare の動作を確認する単体テストも実装する.
 *
 * @note Comparable<Name> の `<Name>` はジェネリクスと呼ばれ,
 *       Name に向けて作成された Comparable である.
 *       詳細は 7 日目に学習するが, ここでは java.lang.Comparable<Name> を実装することを期待する.
 *       Comparator<Name> も同様に, java.util.Comparator<Name> を実装することを期待する.
 */
public class Main {
}
