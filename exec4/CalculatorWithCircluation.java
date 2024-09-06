package exec4;

import java.util.Scanner;

public class CalculatorWithCircluation {

	public static void main(String[] args) {
		System.out.println("\", \"으로 띄어써서 입력");
		System.out.println("example) 5, 3, *");

		Scanner sc = new Scanner(System.in);

		String operator = null;
		String str;

		while (true) {
			System.out.print("입력: ");
			str = sc.nextLine();
			if (str.contains("exit")) {
				System.out.println("exit is entered");
				break;
			}

			String[] strArr = str.split(", ");

			int n1 = Integer.parseInt(strArr[0]);
			int n2 = Integer.parseInt(strArr[1]);

			switch (strArr[2]) {
			case "+":
				System.out.printf("%d + %d = %d\n", n1, n2, n1 + n2);
				break;
			case "-":
				if (n1 < n2) {
					System.out.printf("%d - %d = (-)%d\n", n1, n2, n2 - n1);
				} else {
					System.out.printf("%d - %d = %d\n", n1, n2, n1 - n2);
				}

				break;
			case "*":
				System.out.printf("%d x %d = %d\n", n1, n2, n1 * n2);
				break;
			case "/":
				System.out.printf("%d / %d = %d\n", n1, n2, n1 / n2);
				break;
			case "%":
				System.out.printf("%d %% %d = %d\n", n1, n2, n1 % n2);
				break;
			default:
				break;
			}// switch

		}
		;
	}// main
}
