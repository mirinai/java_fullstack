package exec6;

import java.util.Scanner;

//import javax.swing.text.DefaultTextUI;

public class VendingMachine1_failed {

	static boolean reduceMoneyOutput(int money) {
		if (money < 0) {
			System.out.println("잔액이 부족함");
			return false;
		} else {
			return true;
		}

	}
	static int returnMoney(int money) {
		System.out.printf("%d의 돈이 자판기에서 나옴",money);
		return 0;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String menu = null;
		int reducedMoney = 1000;
		int putMoney = 0;
		System.out.println("메뉴");
		System.out.println("1. 콜라, 2. 사이다, 3. 커피, 4. 물, 5. 종료, 6. 프로그램 종료, 7. 관리자 메뉴");


		int number = 10;
		Replay: while (number >0) {
			System.out.print("입력: ");
			number = sc.nextInt();
			System.out.printf("현재잔액: %d\n",reducedMoney);
			while (true) {
				
				if (number < 8 || number > 0) {
					switch (number) {
					case 1:
						menu = "콜라";
						reducedMoney -= 500;
						break;

					case 2:
						menu = "사이다";
						reducedMoney -= 700;
						break Replay;
					case 3:
						menu = "커피";
						reducedMoney -= 900;
						break Replay;
					case 4:
						System.out.print("돈 넣기: ");
						putMoney = sc.nextInt();
						reducedMoney = reducedMoney + putMoney;

						break Replay;
					case 5:
						System.out.println("동전반환하기");
						reducedMoney=returnMoney(reducedMoney);

						continue;
					case 6:
						System.out.println("프로그램 종료");
						break;
					case 7:
						continue;
						
					}
					
					
					
				} else if (reduceMoneyOutput(reducedMoney) == false) {
					number = 0;
					continue;
				}
				

			}
		}
		

		System.out.println();
		System.out.printf("남은 돈: %d\n", reducedMoney);

		sc.close();
	}
}
