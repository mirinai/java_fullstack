package exec02;

public class LogicalOperatorExam {
	public static void main(String[] args) {
		int charCode = 'A';
		// int charCode = 'z';
		// int charCode = '5';

		if ((65 <= charCode) & (charCode <= 90)) {
		    System.out.println("대문자다.");
		}
		if ((97 <= charCode) && (charCode <= 122)) {
		    System.out.println("소문자다.");
		}
		if ((48 <= charCode) && (charCode <= 57)) {
		    System.out.println("0~9사이의 숫자다.");
		}
		System.out.println("---------------------");

		// 'charCode' 변수를 사용하여 문자의 유니코드 값이 대문자, 소문자, 또는 숫자에 해당하는지 확인합니다.
		// 첫 번째 if 조건에서 & 연산자를 사용하고, 두 번째와 세 번째 조건에서는 && 연산자를 사용합니다.

		// & (비트 AND 연산자 또는 논리 AND 연산자):
		// - 이 경우, 비트 단위로 연산이 수행되거나 논리 연산이 수행됩니다.
		// - 논리 연산으로 사용될 때는 두 조건을 모두 평가합니다. 즉, (65 <= charCode)가 거짓이더라도 (charCode <= 90) 조건을 반드시 평가합니다.
		// - 비트 연산자로 사용될 때는 두 숫자의 각 비트가 모두 1인 경우에만 1을 반환합니다.

		// && (논리 AND 연산자 - Short-circuit):
		// - &&는 두 조건이 모두 참이어야 전체 결과가 참이 되는 논리 연산자입니다.
		// - 이 연산자는 Short-circuit 동작을 합니다. 즉, 첫 번째 조건이 거짓인 경우 두 번째 조건은 평가되지 않습니다.
		// - 예를 들어, (97 <= charCode) 조건이 거짓이면 (charCode <= 122)는 평가되지 않습니다.

		// | (비트 OR 연산자 또는 논리 OR 연산자):
		// - |는 비트 단위로 OR 연산을 수행하거나 논리 연산을 수행합니다.
		// - 논리 연산으로 사용될 때는 두 조건을 모두 평가합니다. 하나라도 참이면 전체 결과가 참이 됩니다.
		// - 비트 연산자로 사용될 때는 두 숫자의 각 비트 중 하나라도 1인 경우에 1을 반환합니다.

		// || (논리 OR 연산자 - Short-circuit):
		// - ||는 두 조건 중 하나라도 참이면 전체 결과가 참이 되는 논리 연산자입니다.
		// - 이 연산자도 Short-circuit 동작을 합니다. 첫 번째 조건이 참이면 두 번째 조건은 평가되지 않습니다.

		int value = 6;
		// int value = 7;

		if ((value % 2 == 0) | (value % 3 == 0)) {
		    System.out.println("2또는 3의 배수다.");
		}

		// 여기서 | 연산자는 논리 OR 연산자로 사용되었습니다. 두 조건이 모두 평가되며, 하나라도 참이면 전체 결과가 참이 됩니다.
		// 예를 들어, value가 6이면 (value % 2 == 0)과 (value % 3 == 0) 모두 참이므로, 결과는 true가 됩니다.
		// value가 7이면, 두 조건 모두 거짓이 되므로 결과는 false가 됩니다.

		boolean result = (value % 2 == 0) || (value % 3 == 0);

		if (!result) {
		    System.out.println("2또는 3의 배수가 아니다.");
		}
		

		// 여기서는 || 연산자를 사용하여 두 조건 중 하나라도 참이면 true가 되는 논리 OR 연산을 수행합니다.
		// 이 경우 Short-circuit 동작이 적용되므로, 첫 번째 조건이 참이면 두 번째 조건은 평가되지 않습니다.
		// result가 false인 경우만 "2또는 3의 배수가 아니다."가 출력됩니다.

	}
}
