package exec01;

public class OperationPromotionExam {
	public static void main(String[] args) {
		byte result1 = 10 + 20;
		System.out.println("result1: " + result1);
		// result1은 10과 20을 더한 값이므로 30이 됩니다. result1의 자료형이 byte이므로 30은 byte 범위 내에 포함되어
		// 문제없이 저장됩니다.

		byte v1 = 10;
		byte v2 = 20;
		int result2 = v1 + v2;
		System.out.println("result2: " + result2);
		// v1과 v2는 각각 byte형이지만, 산술 연산(+ 연산자)을 수행하면 자동으로 int로 변환됩니다.
		// 따라서 result2의 자료형은 int이며, 결과는 30이 됩니다.

		byte v3 = 10;
		int v4 = 100;
		long v5 = 1000l;
		long result3 = v3 + v4 + v5;
		System.out.println("result3: " + result3);
		// v3는 byte, v4는 int, v5는 long 타입입니다. 이들을 더하는 과정에서 가장 큰 타입인 long으로 자동 형변환이
		// 이루어집니다.
		// 따라서 result3은 long 타입이며, 결과는 1110이 됩니다.

		char v6 = 'A';
		char v7 = 1;
		int result4 = v6 + v7;
		System.out.println("result4: " + result4);
		System.out.println("result4: " + (char) result4);
		// v6는 문자 'A'이고, v7는 문자 1을 의미하는 char 타입입니다.
		// 'A'는 ASCII 값으로 65를 가지므로, 65 + 1 = 66이 됩니다.
		// result4는 int 타입으로 결과는 66이 되고, char로 형변환하면 'B'가 출력됩니다.

		int v8 = 10;
		int result5 = v8 / 4;
		System.out.println("result5: " + result5);
		// 정수끼리의 나눗셈이므로 10 / 4는 2.5가 아닌 2로 나옵니다.
		// 소수점 이하 값은 버려지기 때문입니다.

		int v9 = 10;
		double result6 = v9 / 4;
		System.out.println("result6: " + result6);
		// v9는 int 타입이고 4도 int 타입이므로, 먼저 정수 나눗셈이 이루어져서 2가 됩니다.
		// 그 후 이 값이 double로 변환되기 때문에 result6은 2.0이 됩니다.

		int v10 = 1;
		int v11 = 2;
		double result7 = (double) v10 / v11;
		System.out.println("result7: " + result7);
		// v10을 double로 형변환한 후 나눗셈이 이루어지므로, 1.0 / 2가 되어 결과는 0.5가 됩니다.

	}
}
