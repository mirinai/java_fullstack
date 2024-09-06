package exec01;

public class PrimitiveAndStringConversionExam {
	public static void main(String[] args) {
		int val1 = Integer.parseInt("10");
		double val2 = Double.parseDouble("3.14");
		boolean val3 = Boolean.parseBoolean("true");

		System.out.println("val1: " + val1);
		System.out.println("val2: " + val2);
		System.out.println("val3: " + val3);

		// val1: 10
		// 문자열 "10"을 정수(int)로 변환. Integer.parseInt() 메서드를 사용하여 문자열을 정수형으로 변환합니다.

		// val2: 3.14
		// 문자열 "3.14"를 실수(double)로 변환. Double.parseDouble() 메서드를 사용하여 문자열을 실수형으로 변환합니다.

		// val3: true
		// 문자열 "true"를 불리언(boolean) 값으로 변환. Boolean.parseBoolean() 메서드를 사용하여 문자열을 불리언 값으로 변환합니다.

		String str1 = String.valueOf(10);
		String str2 = String.valueOf(3.14);
		String str3 = String.valueOf(true);

		System.out.println("str1: " + str1);
		System.out.println("str2: " + str2);
		System.out.println("str3: " + str3);

		// str1: 10
		// 정수 10을 문자열로 변환. String.valueOf() 메서드를 사용하여 정수형 데이터를 문자열로 변환합니다.

		// str2: 3.14
		// 실수 3.14를 문자열로 변환. String.valueOf() 메서드를 사용하여 실수형 데이터를 문자열로 변환합니다.

		// str3: true
		// 불리언 값 true를 문자열로 변환. String.valueOf() 메서드를 사용하여 불리언 데이터를 문자열로 변환합니다.

	}
}
