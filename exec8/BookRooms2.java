package exec8;

import java.util.Scanner;

public class BookRooms2 {
    static Scanner sc = new Scanner(System.in);

    static void roomNum(int[][] rooms, String[][] roomNames) {
        System.out.println("앞에 X가 붙은 것은 이미 예약된 방");
        System.out.println("+--------------------------------------------------------+");
        for (int i = 0; i < rooms.length; i++) {
            System.out.print("|");
            for (int j = 0; j < rooms[i].length; j++) {
                if (rooms[i][j] == 1) {
                    String name = roomNames[i][j];
                    System.out.printf("[X]%d%02d호 [%c*%c] ", i + 1, j + 1, name.charAt(0),
                            name.charAt(name.length() - 1));
                } else {
                    System.out.printf("[O]%d%02d호 ", i + 1, j + 1);
                }
            }
            System.out.println("|");
            System.out.println("+--------------------------------------------------------+");
        }
    }

    public static void main(String[] args) {
        int[][] rooms = new int[2][6];
        String[][] roomNames = new String[2][6];
        String[][] roomPasswords = new String[2][6];

        // 배열 초기화
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
            System.out.println("+---------------------------------------------");
            System.out.println("이름과 비밀번호를 입력하세요.");
            System.out.print("이름 입력: ");
            name = sc.nextLine();
            System.out.print("비밀번호 입력: ");
            password = sc.nextLine();

            if (name.isBlank() || password.isBlank()) {
                System.out.println("이름과 비밀번호를 정확히 입력하세요.");
                continue;
            }

            boolean exitUserSession = false;
            while (!exitUserSession) {
                System.out.println("1. 예약하기, 2. 취소하기, 3. 다른 사용자로 로그인, 4. 방번호 보기, 5. 프로그램 종료");
                System.out.print("여기에 입력: ");
                int chooseNum = 0;
                try {
                    chooseNum = Integer.parseInt(sc.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("숫자를 입력하세요.");
                    continue;
                }

                int roomNum;
                String stringNum;

                switch (chooseNum) {
                    case 1: // 예약하기
                        System.out.println("예약할 방 번호를 입력하세요 (예: 101). 돌아가려면 0을 누르세요.");
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
                                        if (rooms[i][j] == 1) {
                                            System.out.println("이미 예약된 방입니다.");
                                        } else {
                                            System.out.printf("%d호 방을 예약하시겠습니까? (1: 예, 그 외: 아니오): ", roomNum);
                                            stringNum = sc.nextLine();
                                            if (stringNum.equals("1")) {
                                                rooms[i][j] = 1;
                                                roomNames[i][j] = name;
                                                roomPasswords[i][j] = password;
                                                System.out.printf("%d호 방이 예약되었습니다.\n", roomNum);
                                            } else {
                                                System.out.println("예약을 취소하였습니다.");
                                            }
                                        }
                                        break;
                                    }
                                }
                                if (found) break;
                            }
                            if (!found) {
                                System.out.println("존재하지 않는 방 번호입니다.");
                            }
                        } else {
                            System.out.println("돌아가기");
                        }
                        break;

                    case 2: // 취소하기
                        System.out.println("취소할 방 번호를 입력하세요. 돌아가려면 0을 누르세요.");
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
                                            System.out.println("예약되지 않은 방입니다.");
                                        } else {
                                            if (roomNames[i][j].equals(name) && roomPasswords[i][j].equals(password)) {
                                                System.out.printf("%d호 방의 예약을 취소하시겠습니까? (1: 예, 그 외: 아니오): ", roomNum);
                                                stringNum = sc.nextLine();
                                                if (stringNum.equals("1")) {
                                                    rooms[i][j] = 0;
                                                    roomNames[i][j] = "";
                                                    roomPasswords[i][j] = "";
                                                    System.out.println("예약이 취소되었습니다.");
                                                } else {
                                                    System.out.println("취소를 취소하였습니다.");
                                                }
                                            } else {
                                                System.out.println("예약자 정보가 일치하지 않습니다.");
                                            }
                                        }
                                        break;
                                    }
                                }
                                if (found) break;
                            }
                            if (!found) {
                                System.out.println("존재하지 않는 방 번호입니다.");
                            }
                        } else {
                            System.out.println("돌아가기");
                        }
                        break;

                    case 3: // 다른 사용자로 로그인
                        exitUserSession = true;
                        break;

                    case 4: // 방번호 보기
                        roomNum(rooms, roomNames);
                        break;

                    case 5: // 프로그램 종료
                        System.out.println("프로그램을 종료합니다.");
                        sc.close();
                        return;

                    default:
                        System.out.println("올바른 번호를 선택하세요.");
                        break;
                } //switch
            }//while exitUserSession
        }//largest while
    }
    
}

