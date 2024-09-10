package do_it_algorithm_java_ch03_3;

import java.util.Scanner;

public class BinarySearchTester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요솟수: ");
		int num = sc.nextInt();
		int[] x = new int[num];
		
		System.out.println("오름차순으로 입력해야 함");
		
		System.out.print("x[0]: ");
		x[0] = sc.nextInt();
		
		for(int i = 1;i<num;i++) {
			while (true) {
				System.out.print("x["+i+"]: ");
				x[i] = sc.nextInt();
				if (x[i]<x[i-1]) {
					System.out.println("다시 입력하세요");
				}
				else {
					break;
				}
			}
			
		}
		
		
	}
}
