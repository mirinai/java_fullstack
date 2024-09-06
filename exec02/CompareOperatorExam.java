package exec02;

public class CompareOperatorExam {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		boolean result1 = (num1 == num2);
		boolean result2 = (num1 != num2);
		boolean result3 = (num1 <= num2);

		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);
		System.out.println("result3: " + result3);

		// result1: true
		// num1과 num2는 모두 10이므로, (num1 == num2)는 true를 반환합니다.

		// result2: false
		// num1과 num2는 같기 때문에, (num1 != num2)는 false를 반환합니다.

		// result3: true
		// num1이 num2보다 작거나 같으므로, (num1 <= num2)는 true를 반환합니다.

		System.out.println("---------------------------");

		char char1 = 'A';
		char char2 = 'B';
		boolean result4 = (char1 < char2);

		System.out.println("result4: " + result4);

		// result4: true
		// 'A'의 유니코드 값은 65이고, 'B'의 유니코드 값은 66입니다.
		// 따라서 'A' < 'B'는 true를 반환합니다.

		System.out.println("---------------------------");

		int num3 = 1;
		double num4 = 1.0;
		boolean result5 = (num3 == num4);
		System.out.println("result5: " + result5);

		// result5: true
		// num3는 int 타입이고, num4는 double 타입이지만 값은 같으므로,
		// (num3 == num4)는 true를 반환합니다.

		System.out.println("---------------------------");

		float num5 = 0.1f;
		double num6 = 0.1;
		boolean result6 = (num5 == num6);
		boolean result7 = (num5 == (float) num6);
		System.out.println("result6: " + result6);
		System.out.println("result7: " + result7);

		// result6: false
		// float과 double 간의 비교에서는 부동 소수점의 정밀도 차이로 인해,
		// 0.1f와 0.1(double)은 정확히 같지 않다고 판단되어 false를 반환합니다.

		// result7: true
		// num6을 float로 캐스팅하면 0.1f와 비교되기 때문에, 이 경우 true를 반환합니다.

		System.out.println("---------------------------");

		String str1 = "자바";
		String str2 = "Java";

		boolean result8 = (str1.equals(str2));
		boolean result9 = (!str1.equals(str2));

		System.out.println("result8: " + result8);
		System.out.println("result9: " + result9);

		// result8: false
		// "자바"와 "Java"는 서로 다른 문자열이므로, str1.equals(str2)는 false를 반환합니다.

		// result9: true
		// 두 문자열이 같지 않으므로, !str1.equals(str2)는 true를 반환합니다.

	}

}
