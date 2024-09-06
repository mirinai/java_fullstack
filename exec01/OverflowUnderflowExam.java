package exec01;

public class OverflowUnderflowExam {
	public static void main(String[] args) {
		byte var1 = 125;
		for (int i = 0; i < 5; i++) {
			var1++;
			System.out.println("var1: " + var1);
		}

		// 이 코드는 var1이라는 byte 변수를 125로 초기화하고, 반복문을 통해 var1을 5번 증가시킵니다.
		// byte 타입은 -128부터 127까지의 값을 가질 수 있습니다.
		// var1이 125에서 시작하여 5번 증가하면, 다음과 같은 일이 발생합니다:
		// - i = 0: var1 = 126
		// - i = 1: var1 = 127
		// - i = 2: var1 = 128이 되어야 하지만,
		// byte 타입은 127이 최대값이므로 오버플로우가 발생하여 -128이 됩니다.
		// - i = 3: var1 = -127
		// - i = 4: var1 = -126
		// 따라서 출력은 다음과 같습니다:
		// var1: 126
		// var1: 127
		// var1: -128 (오버플로우 발생)
		// var1: -127
		// var1: -126

		System.out.println("======================");

		byte var2 = -125;
		for (int i = 0; i < 5; i++) {
			var2--;
			System.out.println("var2: " + var2);
		}

		// 이 코드는 var2라는 byte 변수를 -125로 초기화하고, 반복문을 통해 var2를 5번 감소시킵니다.
		// 마찬가지로, byte 타입은 -128부터 127까지의 값을 가질 수 있습니다.
		// var2가 -125에서 시작하여 5번 감소하면, 다음과 같은 일이 발생합니다:
		// - i = 0: var2 = -126
		// - i = 1: var2 = -127
		// - i = 2: var2 = -128
		// - i = 3: var2 = -129이 되어야 하지만, byte 타입은 -128이 최소값이므로
		// 언더플로우가 발생하여 127이 됩니다.
		// - i = 4: var2 = 126
		// 따라서 출력은 다음과 같습니다:
		// var2: -126
		// var2: -127
		// var2: -128
		// var2: 127 (언더플로우 발생)
		// var2: 126

	}

}
