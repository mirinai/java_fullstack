package do_it_algorithm_java_ch01;

import java.util.Scanner;

public class SumVerbose {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;

		do {
			System.out.print("n: ");
			n = sc.nextInt();

		} while (n <= 0);
		
		int sum = 0;
		
		for (int i = 1;i <= n;i++) {
			if(i<n) {
				System.out.println(i+"+");
			}else {
				System.out.print(i+"=");
			}
			sum+=i;
		}
		System.out.print(sum);
	}

}
