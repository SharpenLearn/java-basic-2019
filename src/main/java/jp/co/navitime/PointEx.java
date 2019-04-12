package jp.co.navitime;

public class PointEx extends Point {

	public PointEx(int x, int y) {
		super(x, y);
	}

	public double distance() {
		double x2 = getX() * getX();
		double y2 = getY() * getY();
		return Math.sqrt(x2 + y2);
	}

	public double distance(PointEx that) {
		double diffX = this.getX() - that.getX();
		double diffY = this.getY() - that.getY();
		double x2 = diffX * diffX;
		double y2 = diffY * diffY;
		return Math.sqrt(x2 + y2);
	}

	@Override
	public String toString() {
		return String.format("PointEx(%d, %d)", getX(), getY());
	}
}
