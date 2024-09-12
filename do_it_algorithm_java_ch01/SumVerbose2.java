package do_it_algorithm_java_ch01;

import java.util.Scanner;

public class SumVerbose2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;

		do {
			System.out.print("n: ");
			n = sc.nextInt();

		} while (n <= 0);
		
		int sum = 0;
		
		for (int i = 0;i<n;i++) {
			System.out.println(i+"+");
			sum+=i;
		}
		System.out.println("다 더한 값: "+(sum+n));
		sc.close();
	}

}
