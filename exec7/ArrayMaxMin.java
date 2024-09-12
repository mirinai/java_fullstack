package exec7;

public class ArrayMaxMin {

	// 배열에서 최댓값을 구하는 메서드
	static int maxValue(int[] a) {
		int temp = 0; // 최댓값을 저장할 변수, 초기값은 첫 번째 요소로 설정할 예정
		temp = a[0]; // 배열의 첫 번째 요소로 temp를 초기화

		// 배열의 두 번째 요소부터 끝까지 순회하며 최댓값을 찾음
		for (int i = 1; i < a.length; i++) {
			if (temp < a[i]) { // 현재 temp보다 큰 값이 있으면
				temp = a[i]; // temp를 해당 값으로 바꿈
			}
		}

		return temp; // 마지막으로 가장 작은 값을 리턴하기
	}

	// 배열에서 최솟값을 구하는 메서드
	static int minValue(int[] a) {
		int temp = 0; // 최솟값을 저장할 변수, 초기값은 첫 번째 요소로 설정할 예정
		temp = a[0]; // 배열의 첫 번째 요소로 temp를 초기화

		// 배열의 두 번째 요소부터 끝까지 순회하며 최솟값을 찾음
		for (int i = 1; i < a.length; i++) {
			if (temp > a[i]) { // 현재 temp보다 작은 값이 있으면
				temp = a[i]; // temp를 해당 값으로 바꿈
			}
		}

		return temp; // 마지막으로 가장 작은 값을 리턴하기
	}

	public static void main(String[] args) {
		int[] arr = { 12, 34, 7, 21, 23 }; // 배열 선언 및 초기화
		System.out.println("arr의 최댓값: " + maxValue(arr)); // 최댓값을 출력
		System.out.println("arr의 최솟값: " + minValue(arr)); // 최솟값을 출력
	}
}
