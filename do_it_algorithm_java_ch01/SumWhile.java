package do_it_algorithm_java_ch01;

import java.util.Scanner;

public class SumWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1부터 n까지 더하기");
		System.out.print("n: ");
		int n = sc.nextInt();
		
		int sum =0;
		int i = 1;
		while(true) {
			if (i>n) {
				break;
			}
			sum+=i;
			i++;
		}
		System.out.printf("1부터 n까지의 합: %d\n",sum);
		sc.close();
	}
}
