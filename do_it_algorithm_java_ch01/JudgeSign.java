package do_it_algorithm_java_ch01;

import java.util.Scanner;

public class JudgeSign {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력하기: ");
		
		int n = sc.nextInt();
		
		if (n>0) {
			System.out.println("this number is positive");
		}
		else if (n < 0) {
			System.out.println("this number is negative");
		}
		else {
			System.out.println("zero");
		}
		
	}

}
