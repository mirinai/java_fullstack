package exec3;

import java.util.Scanner;

public class Condition1 {
	// if(condition){
	// 조건이 참일 때 실행됨
	// } else{
	// //거짓일 때 실행됨
	// }
	// if(condition){
	// 조건이 참일 때 실행됨
	// } else if(condition){
	// //거짓이면 조건 다시 따짐
	// else{
	// 거짓일 때 실행됨
	// }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("짝수인지 홀수인지 0인지 따지는 코드\n");
		System.out.print("정수 입력: ");
		int n = sc.nextInt();
		System.out.print("The number is ");
		if (n != 0 && n % 2 == 0) {
			System.out.println("even");
		} else if (n % 2 == 1) {
			System.out.println("odd");
		} else {
			System.out.println("zero");
		}
		sc.close();
	}
}
