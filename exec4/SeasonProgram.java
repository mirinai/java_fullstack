package exec4;

import java.util.Scanner;

public class SeasonProgram {
	public static void main(String[] args) {
		int month = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇월인지 치기(숫자만): ");
		month = sc.nextInt();
		switch (month) {
		case 12:
		case 1:
		case 2:{
			System.out.println("겨울이다.");
			break;
		}
			
		
		case 3:
		case 4:
		case 5:{
			System.out.println("봄이다");
			break;
		}
		case 6:
		case 7:
		case 8:{
			System.out.println("여름이다");
			break;
		}
		case 9:
		case 10:
		case 11:{
			System.out.println("가을이다");
			break;
		}
		default:
			System.out.println("잘못된 입력임");
			break;
			
	
	
		} //switch
		
		
	} //main
	
}
	
