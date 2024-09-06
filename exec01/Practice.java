package exec01;

public class Practice {
	public static void main(String[] args) {
		int inum1 = 3;
		int inum2 = 4;
		int inum3 = inum1 + inum2;

		System.out.printf("%d + %d = %d\n", inum1, inum2, inum3);
		// 출력: 3 + 4 = 7

		System.out.printf("%d + %d = %d\n", inum1, inum2, inum1 + inum2);
		// 출력: 3 + 4 = 7

		inum1 = 7;
		inum2 = 9;

		System.out.printf("%s = %d, %s = %d\n\n", "inum1", inum1, "inum2", inum2);
		// 출력: inum1 = 7, inum2 = 9

		int temp;
		System.out.println("temp로 inum1과 inum2의 값을 서로 바꾸기");
		// 출력: temp로 inum1과 inum2의 값을 서로 바꾸기

		temp = inum1;
		inum1 = inum2;
		inum2 = temp;

		System.out.printf("%s = %d, %s = %d", "inum1", inum1, "inum2", inum2);
		// 출력: inum1 = 9, inum2 = 7

		System.out.println();
		int value = 1200;

		System.out.println("---------------------");

		System.out.printf("값 :%d\n", value);
		// 출력: 값 :1200

		System.out.printf("값 :%6d\n", value);
		// 출력: 값 : 1200 (6자리 폭, 오른쪽 정렬)

		System.out.printf("값 :%-6d\n", value);
		// 출력: 값 :1200 (6자리 폭, 왼쪽 정렬)

		System.out.printf("값 :%06d\n", value);
		// 출력: 값 :001200 (6자리 폭, 빈 공간은 0으로 채움)

		double area = 3.141592 * 10 * 10;

		System.out.printf("반지름이 %d인 원의 넓이 : %10.2f\n", 10, area);
		// 출력: 반지름이 10인 원의 넓이 : 314.16 (10자리 폭, 소수점 둘째 자리까지 출력)

		float fnum1 = inum1 / inum2;
		// fnum1 = 9 / 7 = 1.0 (정수 나눗셈의 결과가 1로 계산되고 float으로 변환)

		float fnum2 = inum1 % inum2;
		// fnum2 = 9 % 7 = 2.0 (9를 7로 나눈 나머지)

		int a = inum1 + inum2;
		// a = 9 + 7 = 16

		int b = inum1 - inum2;
		// b = 9 - 7 = 2

		int c = inum1 * inum2;
		// c = 9 * 7 = 63

		System.out.println("-------------------");

		System.out.printf("fnum1(몫)= %d / %d = %8.2f\n", inum1, inum2, fnum1);
		// 출력: fnum1(몫)= 9 / 7 =     1.00

		System.out.printf("fnum2(나머지) = %d %% %d = %-8.2f\n", inum1, inum2, fnum2);
		// 출력: fnum2(나머지) = 9 % 7 = 2.00 

		System.out.printf("%d + %d = %d\n", inum1, inum2, a);
		// 출력: 9 + 7 = 16

		System.out.printf("%d - %d = %d\n", inum1, inum2, b);
		// 출력: 9 - 7 = 2

		System.out.printf("%d * %d = %d\n", inum1, inum2, c);
		// 출력: 9 * 7 = 63

		System.out.println("---------------------------");

		String str = "hello";
		System.out.println(str + " java!");
		// 출력: hello java!

		System.out.printf("%s java!\n", str);
		// 출력: hello java!

	}

}
