package jp.co.navitime.j05.p03.c03;

/**
 *  ヘッダとフッタの間にメッセージを出力するクラスです。
 */
public class MessagePrintExecutor extends Executor {
    private String header;
    private String message;
    private String footer;

    public MessagePrintExecutor(String header, String message, String footer) {
        this.header = header;
        this.message = message;
        this.footer = footer;
    }

    public void initialize() {
        System.out.println(header);
    }

    public void run() {
        System.out.println(message);
    }

    public void exit() {
        System.out.println(footer);
    }
}
