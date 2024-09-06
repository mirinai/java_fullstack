package do_it_algorithm_java_ch02_1;

public class PrimeNumber2 {
    public static void main(String[] args) {
        int counter = 0;  // 나눗셈의 횟수를 저장하는 변수
        int ptr = 0;  // 발견된 소수의 개수를 저장하는 변수이자, 소수를 저장할 배열의 인덱스 역할
        int[] prime = new int[500];  // 소수를 저장할 배열 (최대 500개의 소수를 저장 가능)
        
        prime[ptr++] = 2;  // 첫 번째 소수인 2를 배열에 저장하고 ptr 값을 증가

        // 3부터 1000까지의 홀수 숫자에 대해 소수를 판별
        for (int n = 3; n <= 1000; n = n + 2) {  // 짝수는 소수가 아니므로 홀수만 체크 (2는 이미 포함됨)
            int i;
            // 이미 발견된 소수들로 n이 소수인지 판별
            for (i = 1; i < ptr; i++) {
                counter++;  // 나눗셈 횟수 증가
                if (n % prime[i] == 0) {  // n이 소수가 아니면 루프 종료
                    break;
                }
            }
            // 소수인 경우 (모든 기존 소수로 나누어 떨어지지 않았을 때)
            if (ptr == i) {
                prime[ptr] = n;  // 소수를 배열에 저장
                ptr++;  // 소수 개수를 증가시킴
            }
        }

        // 발견된 소수들을 출력
        for (int i = 0; i < ptr; i++) {
            System.out.println(prime[i]);  // 배열에 저장된 소수 출력
        }

        // 나눗셈의 총 횟수를 출력
        System.out.println("나눗셈을 한 횟수: " + counter);//나눗셈을 한 횟수: 14622
    }
}

