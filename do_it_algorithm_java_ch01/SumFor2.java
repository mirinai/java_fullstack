package do_it_algorithm_java_ch01;

import java.util.Scanner;

//양수만 입력되게
public class SumFor2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;

		do {
			System.out.print("n: ");
			n = sc.nextInt();

		} while (n <= 0);
		int sum = 0;
		for (int i = 1;i<=n;i++) {
			sum=sum+i;
		}
		System.out.printf("1부터 n까지의 합: %d\n",sum);
		
		
		sc.close();
	}
}
