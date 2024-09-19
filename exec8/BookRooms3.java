package exec8;

import java.util.Scanner;

public class BookRooms3 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int[][] rooms = new int[2][6];
		String[][] roomNames = new String[2][6];
		String[][] roomPasswords = new String[2][6];
		
		for (int i = 0;i<rooms.length;i++) {
			for (int j = 0;j<rooms[i].length;j++) {
				rooms[i][j] = 0;
				roomNames[i][j] = "";
                roomPasswords[i][j] = "";
			}
		}
		while(true) {
			String name;
			String password;
			System.out.println("+==============================");
			System.out.println("이름과 비밀번호 입력하기");
			System.out.print("name: ");
			name= sc.nextLine();
			System.out.print("password: ");
			password = sc.nextLine();
			
			if (name.isBlank() && password.isBlank()) {
				System.out.println("이름 또는 비밀번호를 잘못입력함");
				continue;
			}
			
		}
	}
}
