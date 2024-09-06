package exec3;

import java.util.Scanner;

public class ConditionCalculating {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		int n1, n2;
//		String op = new String();
//		System.out.print("두 수를 띄어서 나눠서 입력하기: ");
//		n1 = sc.nextInt();
//		n2 = sc.nextInt();
//		System.out.print("연산자 입력: ");
//		sc.nextLine();
//		op = sc.nextLine();
//
//		if (op.equals("*")) {
//			System.out.printf("%d * %d = %d", n1, n2, n1 * n2);
//		} else if (op.equals("+")) {
//			System.out.printf("%d + %d = %d", n1, n2, n1 + n2);
//		} else if (op.equals("-"))
//			System.out.printf("%d + %d = %d", n1, n2, n1 - n2);
		System.out.print("두 수와 마지막에 연산자(+, -, *)를 \", \"로 띄어서 입력하기: ");
		String str = sc.nextLine();
		String[] strArr = str.split(", ");
		int n1, n2;

		n1 = Integer.parseInt(strArr[0]);
		n2 = Integer.parseInt(strArr[1]);
//		String op = String.valueOf(strArr[2]);
		// 연산자를 char로 변환
		char op = strArr[2].charAt(0);

//		if (op.equals("*")) {
//			System.out.printf("%d * %d = %d", n1, n2, n1 * n2);
//		} else if (op.equals("+")) {
//			System.out.printf("%d + %d = %d", n1, n2, n1 + n2);
//		} else if (op.equals("-"))
//			if (n1 - n2 < 0) {
//				System.out.printf("%d - %d = %d", n1, n2, n2 - n1);
//			} else {
//				System.out.printf("%d - %d = %d", n1, n2, n1 - n2);
//			}
//		else {
//			System.out.println("잘못된 연산자임");
//		}
		if (op == '*') {
			System.out.printf("%d * %d = %d", n1, n2, n1 * n2);
		}

		else if (op == '/') {
			System.out.printf("%d / %d = %d", n1, n2, n1 / n2);
		} else if (op == '%') {
			System.out.printf("%d %% %d = %d", n1, n2, n1 % n2);
		} else if (op == '+') {
			System.out.printf("%d + %d = %d", n1, n2, n1 + n2);
		}

		else if (op == '-') {
			if (n1 - n2 < 0) {
				System.out.printf("%d - %d = %d", n1, n2, n2 - n1);
			} else {
				System.out.printf("%d - %d = %d", n1, n2, n1 - n2);
			}

		} else {
			System.out.println("잘못된 연산자임");
		}

	}

}
