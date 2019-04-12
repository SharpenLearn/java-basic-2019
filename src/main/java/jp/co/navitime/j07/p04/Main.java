package jp.co.navitime.j07.p04;

import java.util.Arrays;
import java.util.List;

/*
 * 整数のリストを次のように並べ替えたい.
 *
 * - すべての奇数は, どの偶数よりも後方にある.
 * - どの奇数も, それより大きいすべての奇数より前方にある.
 * - どの偶数も, それより大きいすべての偶数より後方にある.
 *
 * 1. 要件を満たす Comparator を実装し, 動作を確かめる単体テストを書け.
 * 2. 以下 main メソッドにおいて, `items` を 1. で実装した Comparator を用いてソートせよ.
 *    ソートの実行は `items` のメソッドを用いること.
 */
public class Main {

    public static void main(String[] args) {
        List<Integer> items = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        // TODO: Implement here.

        for (Integer i : items) {
            System.out.println(i);
        }
    }
}
