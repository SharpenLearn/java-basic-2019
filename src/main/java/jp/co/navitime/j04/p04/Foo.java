package jp.co.navitime.j04.p04;

public interface Foo {
    void takeNothing();

    void takeInt(int value);

    int takeIntAndReturnInt(int value);

    String takeTwoStringsAndReturnString(String value1, String value2);
}
