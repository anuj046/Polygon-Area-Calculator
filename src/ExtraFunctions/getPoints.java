package ExtraFunctions;

public class getPoints {
	protected int xPoints[];
	protected int yPoints[];
	protected double area;

	getPoints() {
		this.area = 62500;
	}

	protected void calculateArea() {
		area = 0;
		for (int i = 0; i < 3; i++) {
			area += xPoints[i] * yPoints[i + 1] - xPoints[i + 1] * yPoints[i];
		}
		area += xPoints[3] * yPoints[0] - xPoints[0] * yPoints[3];
		area = Math.abs(area) / 2.0f;
	}
	
	public void setXs(int i[]) {
		this.xPoints = i;
	}
	
	public void setYs(int i[]) {
		this.yPoints = i;
	}

	public int getX(int i) {
		return xPoints[i];
	}

	public int getY(int i) {
		return yPoints[i];
	}

	public int[] getXs() {
		return xPoints;
	}

	public int[] getYs() {
		return yPoints;
	}

	public double getArea() {
		return area;
	}
}
