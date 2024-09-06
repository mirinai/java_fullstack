package exec01;

public class StringConcatExam {
	public static void main(String[] args) {

		int result1 = 10 + 2 + 8;
		System.out.println("result1: " + result1);

		// result1: 20
		// 이 라인은 정수형 연산입니다. 10 + 2 = 12, 그리고 12 + 8 = 20. 결과는 정수 20이 됩니다.

		String result2 = 10 + 2 + "8";
		System.out.println("result2: " + result2);

		// result2: 128
		// 10 + 2 = 12는 정수 연산입니다. 
		//그 다음 "8"이라는 문자열이 있으면, 12가 문자열로 변환되어 "128"이라는 문자열이 됩니다.

		String result3 = 10 + "2" + 8;
		System.out.println("result3: " + result3);

		// result3: 1028
		// "2"라는 문자열과 10이 만나면, 10은 문자열로 변환됩니다. 
		// 그래서 "102"가 되고, 그 다음에 8도 문자열로 변환되어 최종적으로 "1028"이 됩니다.

		String result4 = "10" + 2 + 8;
		System.out.println("result4: " + result4);

		// result4: 1028
		// 첫 번째 피연산자가 문자열 "10"이므로, 이후의 2와 8은 모두 문자열로 변환됩니다. 
		// 따라서 결과는 "1028"이라는 문자열입니다.

		String result5 = "10" + (2 + 8);
		System.out.println("result5: " + result5);

		// result5: 1010
		// 괄호 안에 있는 2 + 8이 먼저 계산됩니다. 2 + 8 = 10이 되고, 
		// 이 값이 문자열 "10"에 더해져 "1010"이라는 문자열이 됩니다.

	}

}
