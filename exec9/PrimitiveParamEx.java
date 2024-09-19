package exec9;

class DataP {
	int x;
}

public class PrimitiveParamEx {
	public static void main(String[] args) {
		DataP d = new DataP();
		d.x = 10;
		
		System.out.println("main(): x = "+d.x);
		
		change(d.x);
		System.out.println("after change(d.x)");
		
		System.out.println("main(): x = "+d.x);
	}
	static void change(int x) {
		x = 1000;
		System.out.println("in change(): x = " + x);
		/*
		 * main() : x = 10 
		 * in change(): x = 1000 
		 * after change(x) 
		 * main() : x = 1000
		 */
	}
}
