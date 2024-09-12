package exec6;

import java.util.Scanner;

public class VendingMachine2 {

    static Scanner sc = new Scanner(System.in); // 전역으로 Scanner 선언

    static int endOrKeep() {
        System.out.println("잔액이 부족함");
        System.out.print("끝낼거면 y를 이어서 할것이라면 아무거나 입력: ");
        String c = sc.nextLine();

        if (c.equals("y")) {
            return 6;
        } else {
            return 4;
        }
    }

    public static void main(String[] args) {

        // Scanner 객체는 전역적으로 관리되므로 여기서 다시 생성할 필요 없음

        String[] products = new String[3];
        products[0] = "콜라";
        products[1] = "사이다";
        products[2] = "커피";
        int[] prices = new int[3];
        prices[0] = 500;
        prices[1] = 700;
        prices[2] = 900;
        int[] counts = new int[3];
        counts[0] = 10;
        counts[1] = 10;
        counts[2] = 10;

        int select = 0;
        int putMoney = 0;
        int num = 0;
        String manage = null;
        String menu = null;
        int present_money = 0;

        Exit: while (true) {

            SecondLoop: while (true) {

                System.out.println("+----------------------------------------------------------------------");
                System.out.printf("1. %s: %d, 2. %s: %d, 3. %s: %d ", products[0], prices[0], products[1], prices[1],
                        products[2], prices[2]);
                System.out.println("4. 동전넣기, 5. 동전반환, 6. 프로그램 종료, 7. 관리자 메뉴");
                System.out.println("+----------------------------------------------------------------------");

                if (num == 0) {
                    System.out.print("숫자 입력: ");
                    num = sc.nextInt();
                    sc.nextLine();  // 남은 개행문자 제거
                }

                switch (num) {
                case 1:
                    num = 0;
                    if (counts[0] == 0) {
                        System.out.println("상품이 없음");
                        break;
                    } else if (present_money >= prices[0]) {
                        menu = products[0];
                        System.out.printf("%s 나옴\n", menu);
                        present_money -= prices[0];
                        counts[0]--;

                    } else {
                        num = endOrKeep();
                    }
                    break;

                case 2:
                    num = 0;
                    if (counts[1] == 0) {
                        System.out.println("상품이 없음");
                        break;
                    }
                    if (present_money >= prices[1]) {
                        menu = products[1];
                        System.out.printf("%s 나옴\n", menu);
                        present_money -= prices[1];
                        counts[1]--;

                    } else {
                        num = endOrKeep();
                    }
                    break;

                case 3:
                    num = 0;
                    if (counts[2] == 0) {
                        System.out.println("상품이 없음");
                        break;
                    }
                    if (present_money >= prices[2]) {
                        menu = products[2];
                        System.out.printf("%s 나옴\n", menu);
                        present_money -= prices[2];
                        counts[2]--;

                    } else {
                        num = endOrKeep();
                    }
                    break;

                case 4:
                    num = 0;
                    System.out.print("돈 넣기: ");
                    putMoney = Integer.parseInt(sc.nextLine());
                    present_money += putMoney;

                    break;
                case 5:
                    num = 0;
                    System.out.printf("거스름돈: %d\n", present_money);
                    present_money = 0;

                    break;
                case 6:

                    if (present_money == 0) {
                        System.out.println("end program");
                        break Exit;
                    } else {
                        System.out.println("잔돈이 아직 있음");
                        System.out.printf("거스름돈: %d\n", present_money);
                        present_money = 0;
                        System.out.println("end program");
                        break Exit;
                    }

                case 7:
                    num = 0;
                    System.out.println("관리자 모드");
                    System.out.println("If you want to exit, put x or put xxx");
                    System.out.print("입력: ");
                    manage = sc.nextLine();

                    System.out.printf("manage: %s\n", manage);
                    if (manage.equals("x")) {

                        System.out.println("exit");
                        break SecondLoop;
                    } else if (manage.equals("xxx")) {

                        System.out.println("NO1 product: put 1, NO2 product:  put 2, NO3 product:  put 3, 4. exit");
                        System.out.print("입력: ");
                        select = sc.nextInt();
                        sc.nextLine();
                        if (select < 4 && select >= 1) {
                            for (int i = 0; i < 3; i++) {
                                if (select == i + 1) {
                                    System.out.printf("%d번째 상품이름: ", i + 1);
                                    products[i] = sc.nextLine();

                                    System.out.printf("%d번째 상품가격: ", i + 1);
                                    prices[i] = sc.nextInt();
                                    System.out.printf("%d번째 상품갯수: ", i + 1);
                                    counts[i] = sc.nextInt();
                                    break;
                                }

                            }
                        } else if (select == 4) {
                            System.out.println("return to putting number");
                            break SecondLoop;
                        } else {
                            System.out.println("Wrong number");
                            break;
                        }
                    } 

                default:
                    break;

                }
                System.out.printf("남은 돈: %d\n", present_money);
                if (num >= 1 && num < 4) {
                    System.out.printf("menu: %s\n", menu);
                }
            }
        }
        sc.close(); // 프로그램 종료 시 Scanner 닫기
    }
}
