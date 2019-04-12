package jp.co.navitime.j05.p03.c04;

/**
 *  コンピュータを管理するクラスです。
 */
public class Computer {
    private int serialNumber;
    private String productName;
    private String madeIn;

    public Computer(int serialNumber, String productName, String madeIn) {
        this.serialNumber = serialNumber;
        this.productName = productName;
        this.madeIn = madeIn;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public String getProductName() {
        return productName;
    }

    public String madeIn() {
        return madeIn;
    }
}
