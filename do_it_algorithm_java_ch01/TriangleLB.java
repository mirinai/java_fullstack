package do_it_algorithm_java_ch01;

import java.util.Scanner;

public class TriangleLB {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("왼쪽 아래가 90도인 이등변 삼각형을 별로 그리기");
		
		do {
			System.out.print("계단 수: ");
			n = sc.nextInt();
		}while(n<=0);
//		for (int i =1;i<=n;i++) {
//			for (int j=0;j<i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		triangleLBMethod(n);
		nPiramid(n);
		
		
	}
	static void triangleLBMethod(int n){
		for (int i =1;i<=n;i++) {
			for (int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	static void nPiramid(int n) {
		for (int i =1;i<=n;i++) {
			for (int k = 0;k<n-i;k++) {
				System.out.print(" ");
			}
			for (int j=0;j<i;j++) {
				System.out.print(i);
			}
			for (int j=1;j<i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
	}
}
