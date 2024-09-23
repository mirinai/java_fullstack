package test;

import java.util.Scanner;

public class BookingRooms {
	static void seeRooms(int[] rooms, String[] roomName) {
		System.out.println("---------------------");
		for (int i = 0; i < rooms.length; i++) {
			if (rooms[i] != 0) {
				System.out.printf("%d호실은 예약됨(예약한 사람: %s)\n", i + 1, roomName[i]);
			} else {
				System.out.printf("%d호실은 비어있음\n", i + 1);
			}
		}
		System.out.println("------------");
	}
	static void menu() {
		System.out.println("---------메뉴----------");
		System.out.println("1. 예약하기");
		System.out.println("2. 취소하기");
		System.out.println("3. 호실확인");
		System.out.println("99. 프로그램 끝내기");
		System.out.print("위의 번호를 입력: ");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] rooms = new int[12];
		String[] roomName = new String[rooms.length];
		String[] roomPassword = new String[rooms.length];
		int roomNum = 0;
		for (int i = 0; i < rooms.length; i++) {
			rooms[i] = 0;
			roomName[i] = "";
			roomPassword[i] = "";

		}

		String name;
		String password;
		boolean userExit = false;
		int menuNum = 0;
//		boolean found = false;
		String book;

		int chooseNum = 0;
		while (!userExit) {

			BookingRooms.menu();
			try {
				menuNum = Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("잘못입력함");
				continue;
			}

			while (true) {
				switch (menuNum) {
				case 1:
					System.out.println("방 예약하기");
					System.out.printf("호실을 고르시오(1~12) 나가고 싶다면 0을 누르시오: ");
					try {
						roomNum = Integer.parseInt(sc.nextLine());
					} catch (NumberFormatException e) {
						System.out.println("잘못된 입력임");
						continue;
					}
					if (roomNum <= 12 && roomNum > 0) {
						for (int i = 0; i < rooms.length; i++) {
							if (roomNum == i + 1) {
								if (rooms[i] != 1) {
									System.out.println("예약할 수 있음");
									System.out.printf("%d방을 예약하려면 1을 돌아가려면 아무거나 누르시오: ", roomNum);

									book = sc.nextLine();
									if (book.equals("1")) {
										System.out.print("이름: ");
										roomName[i] = sc.nextLine();
										System.out.print("비밀번호: ");
										roomPassword[i] = sc.nextLine();
										if (roomName[i].isBlank() && roomPassword[i].isBlank()) {
											System.out.println("이름 또는 비밀번호를 잘못입력함");

											break;
										} else {
											rooms[i] = 1;

										}

									} // 에약 if
									else {
										System.out.println("메뉴로 돌아가기");
										break;
									}
								} // 비어있는 지 보는 if
								else {
									System.out.println("이미 예약된 방");
									break;
								}
							} // 입력한 게 있는지 보는 if

						} // for
					} else if (roomNum == 0) {
						System.out.println("나가기");
						break;

					}
					else {
						System.out.println("잘못된 값");
						
					}

					break;
				case 2:
					BookingRooms.seeRooms(rooms, roomName);
					System.out.println("예약을 취소하기");
					System.out.printf("호실을 고르시오(1~12), 취소한다면 0을 입력: ");
					try {
						chooseNum = Integer.parseInt(sc.nextLine());
					} catch (NumberFormatException e) {
						System.out.println("잘못 입력함");
						continue;
					}
					if (chooseNum > 12 || chooseNum<0) {
						System.out.println("없는 번호임");
						break;
					} else if (chooseNum != 0) {
						for (int i = 0; i < rooms.length; i++) {
							if (chooseNum == i + 1) {
								if (rooms[i] != 0) {
									System.out.println("취소할 수 있음");
									System.out.printf("%d방을 취소하려면 1을 돌아가려면 아무거나 누르시오: ", chooseNum);

									book = sc.nextLine();
									if (book.equals("1")) {
										System.out.print("이름: ");
										name = sc.nextLine();
										System.out.print("비밀번호: ");
										password = sc.nextLine();
										if (roomName[i].equals(name) && roomPassword[i].equals(password)) {
											rooms[i] = 0;
											roomName[i] = "";
											roomPassword[i] = "";
											System.out.printf("%d호실의 예약이 취소됨\n", chooseNum);
											break;
										} else {
											System.out.println("이름 또는 비밀번호가 다름");
											break;
										}

									} // 에약 if
									else {
										System.out.println("메뉴로 돌아가기");
										break;
									}
								} // 비어있는 지 보는 if
								else {
									System.out.println("예약이 안된 방");
									break;
								}
							} // 입력한 게 있는지 보는 if
							

						} // for
					} // else if
					else {
						break;
					}

					break;
				case 3:

					BookingRooms.seeRooms(rooms, roomName);

					break;
				case 99:
					System.out.println("프로그램 끝남");
					sc.close();
					userExit = true;
					break;
				default:
					System.out.println("다시 입력하세요");
					break;
				}
				break;
			} // 나갈

		}
	}
}
