package exec7;

import java.util.Scanner;

public class MethodPractice2 {
	static int productTwoNums(int a, int b) {
		int result = a*b;
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("곱하기 메서드");
		System.out.print("정수 하나 입력: ");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.print("정수 하나 입력: ");
		int num2 = Integer.parseInt(sc.nextLine());
		System.out.printf("%d X %d = %d\n",num1,num2,productTwoNums(num1, num2));
		
		sc.close();
	}
}
