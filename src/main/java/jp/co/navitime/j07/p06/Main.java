package jp.co.navitime.j07.p06;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 * createDistinctIntegerList() は,
 * min 以上 max 以下の整数すべてを含むランダムな数列を返すが, 低速である.
 * 処理を改善し, 高速化せよ.
 */
public class Main {
    public static List<Integer> createDistinctIntegerList(int min, int max) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();

        int length = max - min + 1;
        while (list.size() < length) {
            Integer newValue = random.nextInt(length) + min;
            if (list.contains(newValue)) {
                continue;
            }
            list.add(newValue);
        }
        return list;
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        List<Integer> list = createDistinctIntegerList(1, 9999);
        long end = System.currentTimeMillis();

        for (Integer value : list) {
            System.out.println(value);
        }
        long time = end - start;
        System.out.println(time + " [ms]");
    }
}
