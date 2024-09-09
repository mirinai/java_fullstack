package exec5;

import java.util.Scanner;

public class TestType {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("문자입력: ");
//		char ch1 = sc.next().charAt(0);
//		char isChar1 = '\t';
//		System.out.printf("%b",isChar1=='\t');
//		System.out.println();
//		System.out.printf("%b",isChar1==' ');
//		System.out.println();
//		char isChar2 = ' ';
//		System.out.printf("%b",isChar2=='\t');
//		System.out.println();
//		System.out.printf("%b",isChar2==' ');
//		System.out.println();
//		System.out.printf("%c\n",'0');
//		System.out.printf("%c\n",'9');
		
		int sum = 0;
		int cnt = 0;
		
		for (int i = 0;i<11;i++) {
			for (int j = 0;j<i;j++) {
				sum = sum + j;
				cnt++;	
			}
			
		}
		
		System.out.printf("sum: %d, count: %d\n",sum,cnt);
		sum=0;
		cnt=0;
		int n = 0;
		for (int i = 1;i<100;i++) {
			n = (-1)*(n+i);
			sum = sum+n;
			System.out.printf("%d + %d\n",sum,n);
			
		}
		
		System.out.printf("sum: %d, count: %d\n",sum,cnt);
	}
	
}
