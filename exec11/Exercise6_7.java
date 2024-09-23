package exec11;

class MyPoint {
	int x;
	int y;

	MyPoint(int x, int y) {
		this.x = x;
		this.y = y;

	}

	double getDistance(int x1, int y1) {
		
		double sqx = (x1-x)*(x1-x);
		double sqy = (y1-y)*(y1-y);
		return Math.sqrt(sqx+sqy);
	}
}

public class Exercise6_7 {
	
	
	public static void main(String[] args) {
		MyPoint p = new MyPoint(1, 1);
		
		System.out.println(p.getDistance(2, 2));
	}
	
}
