package do_it_algorithm_java_ch01;

import java.util.Scanner;

public class TwoDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no;

		System.out.println("두 자리의 양수를 입력하기");

//		do {
//			System.out.print("no값: ");
//			no = sc.nextInt();
//
//		} while (no < 10 || no > 99);
		
		do {
			System.out.print("no값: ");
			no = sc.nextInt();

		} while (!(no >= 10 && no <= 99));
		//드모르간 법칙
		
		System.out.println("variable no is "+no);
		sc.close();
	}

}
