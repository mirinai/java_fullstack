package do_it_algorithm_java_ch01;

import java.util.Scanner;

public class Multi99Table {
	public static void main(String[] args) {
		System.out.println("-------구구단 곱셈 다이어그램---------");
		Scanner sc = new Scanner(System.in);

		System.out.print("n x n의 을 만들 n 입력: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.printf("%d|",i);
			for (int j = 1; j <= n; j++)
				System.out.printf("%2d %2s %2d = %2d   ", i,"x", j, j * i);
			System.out.println();
			
		}
	}
}
