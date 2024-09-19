package exec9;

public class ReferenceParamEx2 {
	public static void main(String[] args) {
		int[] x = { 10 };// 크기가 10인 어레이
		x[0] = 10;
		System.out.println("main() : x = " + x[0]);

		change(x);

		System.out.println("after change(x)");
		System.out.println("main() : x = " + x[0]);

	}

	static void change(int[] x) {
		x[0] = 1000;
		System.out.println("in change(): x = " + x[0]);
		/*
		 * main() : x = 10 
		 * in change(): x = 1000 
		 * after change(x) 
		 * main() : x = 1000
		 */
	}

}
