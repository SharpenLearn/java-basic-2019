package jp.co.navitime.j05.p03.c03;

/**
 *  メソッドを決まった順序で実行するための抽象クラスです。
 */
public abstract class Executor {
    abstract void initialize();
    abstract void run();
    abstract void exit();

    public void execute() {
        initialize();
        run();
        exit();
    }
}
