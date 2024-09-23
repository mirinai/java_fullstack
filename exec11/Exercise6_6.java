package exec11;

public class Exercise6_6 {
	
	static double getDistance(int x, int y, int x1, int y1) {
		
		double sqx = (x1-x)*(x1-x);
		double sqy = (y1-y)*(y1-y);
		return Math.sqrt(sqx+sqy);
	}
	
	public static void main(String[] args) {
		
		System.out.println(Exercise6_6.getDistance(1, 1, 2, 2));
	}
}
