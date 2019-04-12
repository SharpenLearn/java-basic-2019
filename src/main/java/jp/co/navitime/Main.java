package jp.co.navitime;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		Comparator<String> comparator = new DictionaryOrderComparator();

		comparator.compare("a", "b");


		String[] x = {"b", "d", "e", "c", "a"};
		Arrays.sort(x, comparator);

		System.out.println(Arrays.toString(x));
	}
}
