package do_it_algorithm_java_ch02_1;

public class IntArray {
	public static void main(String[] args) {
		int[] a = new int[5];

		a[1] = 37;
		a[2] = 52;
		a[4] = a[1] * 2;
		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
		/*
		 * a[0] = 0 
		 * a[1] = 37 
		 * a[2] = 52 
		 * a[3] = 0 
		 * a[4] = 74
		 */
	}
}
