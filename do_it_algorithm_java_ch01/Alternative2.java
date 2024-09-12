package do_it_algorithm_java_ch01;

import java.util.Scanner;

public class Alternative2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;

		System.out.println("+와 -를 번갈아서 나타내기");
		System.out.print("n: ");
		n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.print("+-");
		}
		if (n % 2 != 0) {
			System.out.print("+");
		}
		sc.close();
	}

}
