package exec8;

import java.util.Scanner;

public class BookRooms3 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int[][] rooms = new int[2][6];
		String[][] roomNames = new String[2][6];
		String[][] roomPasswords = new String[2][6];

		for (int i = 0; i < rooms.length; i++) {
			for (int j = 0; j < rooms[i].length; j++) {
				rooms[i][j] = 0;
				roomNames[i][j] = "";
				roomPasswords[i][j] = "";
			}
		}
		while (true) {
			String name;
			String password;
			System.out.println("+==============================");
			System.out.println("이름과 비밀번호 입력하기");
			System.out.print("name: ");
			name = sc.nextLine();
			System.out.print("password: ");
			password = sc.nextLine();

			if (name.isBlank() || password.isBlank()) {
				System.out.println("이름 또는 비밀번호를 잘못입력함");
				continue;
			}

			boolean exitUser = false;

			while (!exitUser) {
				System.out.println("아래에 나온 숫자만 입력하기");
				System.out.println("1. 예약하기");
				System.out.println("2. 취소하기");
				System.out.println("3. 다른 유저로 로그인하기");
				System.out.println("4. 방번호 보기");
				System.out.println("5. 프로그램 끝내기");
				System.out.print("여기에 입력: ");
				int chooseNum;
				try {
					chooseNum = Integer.parseInt(sc.nextLine());
				} catch (NumberFormatException e) {
					System.out.println("숫자를 다시입력하기");
					continue;
				}
				int roomNum;
				String stringNum;

				switch (chooseNum) {
				case 1:// BOOK
					System.out.println("예약할 방번호 입력하려면 1을 돌아가고 싶으면 0을 누르세요");
					System.out.print("여기에 입력: ");
					try {
						roomNum = Integer.parseInt(sc.nextLine());
					} catch (NumberFormatException e) {
						System.out.println("숫자를 다시입력하기");
						continue;
					}
					if (roomNum != 0) {
						boolean found = false;
						for (int i = 0; i < rooms.length; i++) {
							for (int j = 0; j < rooms[i].length; j++) {
								if (roomNum == (i + 1) * 100 + (j + 1)) {
									found = true;
									if (rooms[i][j] == 1) {
										System.out.println("이미 예약된 방임");
									} else {
										System.out.printf("%d호 방을 예약하시겠습니까?(1: 예, 그 외: 아니오): ", roomNum);
										stringNum = sc.nextLine();
										if (stringNum.equals("1")) {
											rooms[i][j] = 1;
											roomNames[i][j] = name;
											roomPasswords[i][j] = password;
											System.out.printf("%d호 방이 예약되었음\n", roomNum);
										} else {
											System.out.println("예약이 취소하였습니다");
										}
									} // else 예약하는 곳
									break;

								} // 맞을 때 if
							} // 두번째 for
							if (found) {
								break;
							}
						} // 첫번째 for
						if (!found) {
							System.out.println("없는 방 번호임");
						}
					} // case1 안의 if1
					else {
						System.out.println("돌아가기");
					}
					break;
				case 2:
					System.out.println("취소할 방 번호를 입력하세요. 돌아가려면 0을 누르세요");
					System.out.print("여기에 입력: ");
					try {
						roomNum = Integer.parseInt(sc.nextLine());
					} catch (NumberFormatException e) {
						System.out.println("숫자를 입력하세요.");
						continue;
					}
					if (roomNum != 0) {
						boolean found = false;
						for (int i = 0; i < rooms.length; i++) {
							for (int j = 0; j < rooms[i].length; j++) {
								if (roomNum == (i + 1) * 100 + (j + 1)) {
									found = true;
									if (rooms[i][j] == 0) {
										System.out.println("예약되지 않은 방");
									} else {
										if (roomNames[i][j].equals(name) && roomPasswords[i][j].equals(password)) {
											System.out.printf("%d호 방의 예약을 취소하겠습니까?(1: 예, 그 외: 아니오): ", roomNum);
											stringNum = sc.nextLine();
											if (stringNum.equals("1")) {
												rooms[i][j] = 0;
												roomNames[i][j] = "";
												roomPasswords[i][j] = "";
												System.out.println("예약이 취소됨");
											} else {
												System.out.println("취소를 취소함");
											}

										} else {
											System.out.println("예약자 정보가 다름");
										}

									}
									break;

								} // 방번호 맞을 때 if
							} // 두번째 for
							if (found) {
								break;
							}
						} // 첫번째 for
						if (!found) {
							System.out.println("없는 방 번호임");
						}
					} // case1 안의 if1
					else {
						System.out.println("돌아가기");
					}
					break;
				case 3:
					exitUser = true;
					break;
				case 4:
					break;
				case 5:
					System.out.println("프로그램을 종료합니다.");
					sc.close();
					return;
				default:
					System.out.println("올바른 번호를 선택하세요.");
                    break;
				}// SWITCH

			}

		}
	}
}
