package jp.co.navitime.j03.p05;

public class LineNumberPrinter {
    private int lineNumber = 0;

    public LineNumberPrinter() {
    }

    public void printMessage(String message) {
        System.out.println(message);
        lineNumber++;
    }

    public void printLineNumber() {
        System.out.printf("lineNumber: %d%n", lineNumber);
    }
}
