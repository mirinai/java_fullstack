package do_it_algorithm_java_ch02_1;

import java.util.Random;
import java.util.Scanner;

public class MaxOfArrayRand {
	private static int maxOf(int[] a) {
		int max = a[0];
		for(int i = 0;i<a.length;i++) {
			if(a[i]>max)
				max = a[i];
		}
		return max;
	}
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("키의 최댓값 구하기");
		System.out.print("사람 수: ");
		int num = sc.nextInt();
		
		int[] height = new int[num];
		
		for(int i = 0;i<height.length;i++) {
			height[i] = 100+rand.nextInt(100);
			System.out.println("height[" + i + "]: "+height[i]);
			
		}
		System.out.println("최댓값은 "+maxOf(height)+"(이)다.");
		sc.close();
	}

}
