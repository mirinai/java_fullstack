package exec4;

import java.util.Scanner;

public class JuminRegisterNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("주민등록번호 입력하기(-포함해서): ");
		String registerNum = sc.nextLine();
		
		System.out.println();
		char std_num = registerNum.charAt(7);
		
		String isMan = null;
		switch (std_num) {
		case '3':
		case '1': {
			isMan = "man";
			break;
		}
		case '4':
		case '2': {
			isMan = "woman";
			break;
		}
		default:
			isMan = "?";
		}
		
		if (!isMan.equals("?")) {
			System.out.printf("you are %s", isMan);
		} else {
			System.out.println("몰?루");
		}
		sc.close();
	}
}
