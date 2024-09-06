package do_it_algorithm_java_ch01;

import java.util.Scanner;

public class Max3 {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("세 정수의 최댓값 구하기");
//		System.out.print("a의 값: ");
//		int a = sc.nextInt();
//		System.out.print("b의 값: ");
//		int b = sc.nextInt();
//		System.out.print("c의 값: ");
//		int c = sc.nextInt();
//
//		int max = a;
//		if (max < b)
//			max = b;
//		if (max < c)
//			max = c;
//		System.out.printf("최댔값: %d", max, max);

		System.out.println("max3(3,2,1) = " + max3(3, 2, 1));
		System.out.println("max3(3,2,2) = " + max3(3, 2, 2));
		System.out.println("max3(3,1,2) = " + max3(3, 1, 2));
		System.out.println("max3(3,2,3) = " + max3(3, 2, 3));
		System.out.println("max3(2,1,3) = " + max3(2, 1, 3));
		System.out.println("max3(3,3,3) = " + max3(3, 3, 3));
		System.out.println("max3(2,2,3) = " + max3(2, 2, 3));
		System.out.println("max3(2,3,1) = " + max3(2, 3, 1));
		System.out.println("max3(1,3,2) = " + max3(1, 3, 2));
		System.out.println("max3(2,3,3) = " + max3(2, 3, 3));
		System.out.println("max3(1,2,3) = " + max3(1, 2, 3));
	}
	static int max3(int a, int b, int c) {
		int max = a;
		if (max < b)
			max = b;
		if (max < c)
			max = c;
		return max;
	}

}

