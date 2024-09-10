package exec6;

import java.util.Scanner;

public class VendingMachine2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		System.out.println("메뉴");
//		System.out.println("+----------------------------------------------------------------------");
//		System.out.println("1. 콜라, 2. 사이다, 3. 커피");
//		System.out.println("4. 동전넣기, 5. 동전반환, 6. 프로그램 종료, 7. 관리자 메뉴");
//		System.out.println("+----------------------------------------------------------------------");
		int putMoney = 0;
		int num = 0;
		String menu = null;
		int present_money = 1000;
		String isEnd = "";
		System.out.println(isEnd);
		Exit: while (true) {

			while (true) {
				System.out.println("+----------------------------------------------------------------------");
				System.out.println("1. 콜라, 2. 사이다, 3. 커피");
				System.out.println("4. 동전넣기, 5. 동전반환, 6. 프로그램 종료, 7. 관리자 메뉴");
				System.out.println("+----------------------------------------------------------------------");
				if (present_money < 0) {
					System.out.println("잔액 부족");
					num = 4;

				} 
				else if (present_money == 0 && num == 5){
						System.out.print("끝낼거면 y를 이어서 할것이라면 아무거나 입력: ");
						isEnd = sc.nextLine();
						sc.nextLine();
					if (isEnd == "y") {
						break Exit;
					}
					else {
						num = 4;
					}
				}
				else {
					System.out.print("숫자 입력: ");
					num = sc.nextInt();
				}
				switch (num) {
				case 1:
					menu = "콜라";
					present_money -= 500;
					break;
				case 2:
					menu = "사이다";
					present_money -= 700;
					break;
				case 3:
					menu = "커피";
					present_money -= 900;
					break;
				case 4:
					System.out.print("돈 넣기: ");
					putMoney = sc.nextInt();
					present_money += putMoney;
					break;
				case 5:
					System.out.printf("거스름돈: %d\n", present_money);
					present_money = 0;
					break;
				case 6:
					System.out.println("end program");
					break Exit;
				case 7:
					System.out.println("아직 아무것도 없음");
					break;
				default:
					break;
				}
				System.out.printf("남은 돈: %d\n", present_money);
				if(num>=1 && num<4) {
					System.out.printf("menu: %s\n", menu);	
				}
				
				System.out.println("------------------------");

			}
		}

		sc.close();
	}
}
