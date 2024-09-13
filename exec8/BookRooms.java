package exec8;

import java.util.Scanner;

public class BookRooms {
	static Scanner sc = new Scanner(System.in);

	static void roomNum(int[][] a, String name) {
		System.out.println("앞에 X가 붙은 것은 이미 예약된 방");
		System.out.println("+---------------------------------------------");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print("|");
				if (a[i][j] == 1) {
					System.out.printf("[X] %d%02d호 [%c*%c] ", i + 1, j + 1, name.charAt(0),
							name.charAt(name.length() - 1));
				} else {
					System.out.printf("[O] %d%02d호 ", i + 1, j + 1);
				}

			}
			System.out.print("|");
			System.out.println();
			System.out.println("+---------------------------------------------");
		}
	}

	public static void main(String[] args) {
		int[][] rooms = new int[2][6];
		int chooseNum = 0;
		for (int i = 0; i < rooms.length; i++) {
			for (int j = 0; j < rooms[i].length; j++) {
				rooms[i][j] = 0;
			}
		}
		String name;
		String password;
//		rooms[0][0] = 1;
//		rooms[0][1] = 1;
//		rooms[0][2] = 1;

		boolean isName = false;
		boolean isPassword = false;

		Header: while (true) {

			Main: while (true) {
				System.out.println("+---------------------------------------------");
				System.out.println("이름과 비밀번호 입력하기");
				System.out.print("이름 입력:");
				name = sc.nextLine();
				System.out.print("비밀번호 입력:");
				password = sc.nextLine();

				isName = name.isBlank();
				isPassword = password.isBlank();

				System.out.println("1. 예약하기, 2. 취소, 3. 나가기, 4. 방번호 보기");
				System.out.print("여기에 입력: ");
				chooseNum = Integer.parseInt(sc.nextLine());
				String stringNum = null;
				System.out.println();
				int roomNum;
				if (isName == false && isPassword == false) {

					switch (chooseNum) {
					case 1:
						System.out.println("방 고르기 돌아가려면 0를 누르기");
						System.out.print("여기에 입력: ");
						roomNum = Integer.parseInt(sc.nextLine());
						if (roomNum != 0) {
							for (int i = 0; i < rooms.length; i++) {
								for (int j = 0; j < rooms[i].length; j++) {
									if (roomNum == (i + 1) * 100 + (j + 1) && rooms[i][j] == 1) {
										System.out.println("이미 예약된 방");

									} else if (roomNum == (i + 1) * 100 + (j + 1)) {
										System.out.printf("%d방을 예약하겠습니까? 예약한다면 1아니면 아무거나 입력하세요: ", roomNum);
										stringNum = sc.nextLine();

										if (stringNum.equals("1")) {
											rooms[i][j] = 1;
											System.out.printf("%d호 방이 예약됨\n", roomNum);
											stringNum = null;
											break Main;
										} else {
											System.out.println("돌아가기");
											break Main;
										}
									}

								} // for2
							} // for1
						} else {
							break;
						}

						break;

					case 2:

						System.out.println("취소할 방 번호를 입력하세요. 취소하지 않는다면 0를 입력하세요");
						System.out.print("여기에 입력: ");
						roomNum = Integer.parseInt(sc.nextLine());
						if (roomNum != 0) {
							for (int i = 0; i < rooms.length; i++) {
								for (int j = 0; j < rooms[i].length; j++) {
									if (roomNum == (i + 1) * 100 + (j + 1)) {
										if (rooms[i][j] == 0) {
											System.out.println("예약없는 방");
											break Main;
										} else {
											System.out.printf("%d방을 취소하겠습니까? 취소한다면 1아니면 아무거나 입력하세요: ", roomNum);
											stringNum = sc.nextLine();

											if (stringNum.equals("1")) {
												if (rooms[i][j] != 0) {
													rooms[i][j] = 0;
													System.out.println("예약취소됨");
												} else {
													System.out.println("예약없는 방");
												}

												break Main;
											} else {
												System.out.println("돌아가기");
												break Main;
											}
										}

									}

								} // for2
							} // for1
						}

						else {
							System.out.println("돌아가기");
							break;
						}

						break;
					case 3:
						System.out.println("프로그램 끝남");
						break Header;
					case 4:
						roomNum(rooms, name);

						break;
					default:
						System.out.println("다시 입력하세요");
						break;
					}// switch
				} //if 
				else {
					System.out.println("이름과 비밀번호를 제대로 입력하세요");
					break;
				} // else

			} // while

		} // first while

	}
}
