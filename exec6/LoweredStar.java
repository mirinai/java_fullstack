package exec6;

import java.util.Scanner;

public class LoweredStar {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("별 갯수 입력: ");
		int starNum = sc.nextInt();
		
		for (int i = 0;i<starNum;i++) {
			for (int j = starNum - i;j>=1;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();
	}
}
