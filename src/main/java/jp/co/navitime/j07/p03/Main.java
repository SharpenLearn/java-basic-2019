package jp.co.navitime.j07.p03;

import java.util.List;

/*
 * 以下の getLastValue() にはバグがあり, 正しく動作しない.
 * デバッグし, テストを成功させよ.
 */
public class Main {
    public static Integer getLastValue(List<Integer> list) {
        int lastIndex = list.size();
        return list.get(lastIndex);
    }
}
