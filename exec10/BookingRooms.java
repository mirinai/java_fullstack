package exec10;

import java.util.Scanner;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class BookingRooms {
	private static final int TOTAL_ROOMS = 12;

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

	static String hashPassword(String password) {
		try {
			MessageDigest md = MessageDigest.getInstance("SHA-256");
			byte[] hash = md.digest(password.getBytes());
			StringBuilder sb = new StringBuilder();
			for (byte b : hash) {
				sb.append(String.format("%02x", b));
			}
			return sb.toString();
		} catch (NoSuchAlgorithmException e) {
			throw new RuntimeException(e);
		}
	}

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int[] rooms = new int[TOTAL_ROOMS];
			String[] roomName = new String[TOTAL_ROOMS];
			String[] roomPassword = new String[TOTAL_ROOMS];

			for (int i = 0; i < TOTAL_ROOMS; i++) {
				rooms[i] = 0;
				roomName[i] = "";
				roomPassword[i] = "";
			}

			boolean userExit = false;
			int menuNum = 0;

			while (!userExit) {
				BookingRooms.menu();
				try {
					menuNum = Integer.parseInt(sc.nextLine());
				} catch (NumberFormatException e) {
					System.out.println("잘못 입력함");
					continue;
				}

				switch (menuNum) {
				case 1:
					System.out.println("방 예약하기");
					System.out.printf("호실을 고르시오(1~%d) 나가고 싶다면 0을 누르시오: ", TOTAL_ROOMS);
					int roomNum;
					try {
						roomNum = Integer.parseInt(sc.nextLine());
					} catch (NumberFormatException e) {
						System.out.println("잘못된 입력임");
						break;
					}
					if (roomNum == 0) {
						System.out.println("예약 취소");
						break;
					}
					if (roomNum < 1 || roomNum > TOTAL_ROOMS) {
						System.out.println("잘못된 값");
						break;
					}
					int index = roomNum - 1;
					if (rooms[index] != 1) {
						System.out.println("예약할 수 있음");
						System.out.printf("%d방을 예약하려면 1을, 돌아가려면 아무거나 누르시오: ", roomNum);
						String book = sc.nextLine();
						if (book.equals("1")) {
							System.out.print("이름: ");
							String name = sc.nextLine().trim();
							System.out.print("비밀번호: ");
							String password = sc.nextLine().trim();
							if (name.isEmpty() || password.isEmpty()) {
								System.out.println("이름 또는 비밀번호를 잘못 입력함");
							} else {
								roomName[index] = name;
								roomPassword[index] = hashPassword(password);
								rooms[index] = 1;
								System.out.printf("%d호실이 예약되었습니다.\n", roomNum);
							}
						} else {
							System.out.println("메뉴로 돌아가기");
						}
					} else {
						System.out.println("이미 예약된 방");
					}
					break;
				case 2:
					BookingRooms.seeRooms(rooms, roomName);
					System.out.println("예약을 취소하기");
					System.out.printf("호실을 고르시오(1~%d), 취소하려면 0을 입력: ", TOTAL_ROOMS);
					int chooseNum;
					try {
						chooseNum = Integer.parseInt(sc.nextLine());
					} catch (NumberFormatException e) {
						System.out.println("잘못 입력함");
						break;
					}
					if (chooseNum == 0) {
						System.out.println("취소 작업 취소");
						break;
					}
					if (chooseNum < 1 || chooseNum > TOTAL_ROOMS) {
						System.out.println("없는 번호임");
						break;
					}
					index = chooseNum - 1;
					if (rooms[index] != 0) {
						System.out.printf("%d방을 취소하려면 1을, 돌아가려면 아무거나 누르시오: ", chooseNum);
						String cancel = sc.nextLine();
						if (cancel.equals("1")) {
							System.out.print("이름: ");
							String name = sc.nextLine().trim();
							System.out.print("비밀번호: ");
							String password = sc.nextLine().trim();
							if (roomName[index].equals(name) && roomPassword[index].equals(hashPassword(password))) {
								rooms[index] = 0;
								roomName[index] = "";
								roomPassword[index] = "";
								System.out.printf("%d호실의 예약이 취소됨\n", chooseNum);
							} else {
								System.out.println("이름 또는 비밀번호가 다름");
							}
						} else {
							System.out.println("메뉴로 돌아가기");
						}
					} else {
						System.out.println("예약이 안된 방");
					}
					break;
				case 3:
					BookingRooms.seeRooms(rooms, roomName);
					break;
				case 99:
					System.out.println("프로그램 끝남");
					userExit = true;
					break;
				default:
					System.out.println("다시 입력하세요");
					break;
				}
			}
		}
	}
}
