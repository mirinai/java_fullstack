package exec01;

import java.util.Scanner;

public class Practice2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String name;
		int num1 = 0;
		int num2 = 0;
		int result;

		System.out.println("두수를 입력해서 곱하기");
		System.out.println("아래에 이름입력하기");
		name = sc.nextLine();

		// sc.nextLine()도 됨 -> 이걸 쓰면 Integer.parseInt로 쓰지않고 바로 nextInt()를 쓸수 있음
		System.out.println("첫번째 수 입력하기: ");
		num1 = Integer.parseInt(sc.nextLine());

		System.out.println("두번째 수 입력하기: ");
		num2 = sc.nextInt();

		result = num1 * num2;
		System.out.println("printf version");
		System.out.printf("name: %s\n", name);
		System.out.printf("%d x %d = %d", num1, num2, result);
		System.out.print("\n\n");
		System.out.println("println version");
		System.out.println("name: " + name);
		System.out.println(num1 + " x " + num2 + " = " + result);
		sc.close();
	}

}
