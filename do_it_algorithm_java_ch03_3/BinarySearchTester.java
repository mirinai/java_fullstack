package do_it_algorithm_java_ch03_3;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchTester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요솟수: ");
		int num =Integer.parseInt(sc.nextLine());
		int[] x = new int[num];
		
		System.out.println("오름차순으로 입력해야 함");
		
		System.out.print("x[0]: ");
		x[0] = Integer.parseInt(sc.nextLine());
		
		for(int i = 1;i<num;i++) {
			do {
				System.out.print("x["+i+"]: ");
				x[i] = Integer.parseInt(sc.nextLine());
				
			} while(x[i]<x[i-1]);
		}
		
		System.out.print("검색할 값: ");
		int ky = Integer.parseInt(sc.nextLine());
		
		int idx = Arrays.binarySearch(x, ky);
		
		if (idx <0) {
			System.out.println("그 값의 요소가 없음");
		}
		else {
			System.out.println("그 값은 x["+idx+"]에 있음");
		}
		sc.close();
	}
}
