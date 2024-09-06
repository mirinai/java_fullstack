package do_it_algorithm_java_ch01;

import java.util.Scanner;

public class PrintStar2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, w;

		System.out.println("*을 출력하되 w개 마다 줄을 바꿔서 출력하기");

		do {
			System.out.print("n 입력: ");
			n = sc.nextInt();
		} while (n <= 0);
		do {
			System.out.print("w 입력: ");
			w = sc.nextInt();
		} while (w <= 0 || w > n);

		for(int i = 0;i<n/w;i++) {
			System.out.println("*".repeat(w));
		}
		int rest = n%w;
		if (rest!=0) {
			System.out.println("*".repeat(rest));
		}
		
	}

}
