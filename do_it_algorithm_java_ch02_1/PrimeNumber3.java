package do_it_algorithm_java_ch02_1;

public class PrimeNumber3 {
    public static void main(String[] args) {
        int counter = 0;  // 곱셈과 나눗셈을 수행한 총 횟수를 저장하는 변수
        int ptr = 0;  // 소수 배열의 인덱스이자 소수 개수를 저장하는 변수
        int[] prime = new int[500];  // 최대 500개의 소수를 저장할 배열
        
        // 초기 소수 2와 3을 배열에 저장
        prime[ptr] = 2;  // 첫 번째 소수 2 저장
        ptr++;  // 소수 개수 증가
        prime[ptr] = 3;  // 두 번째 소수 3 저장
        ptr++;  // 소수 개수 증가
        
        // 5부터 1000까지의 홀수에 대해 소수 판별 (짝수는 2만 소수이므로 홀수만 검사)
        for (int n = 5; n <= 1000; n += 2) {  // n을 5부터 시작하여 2씩 증가 (홀수만 검사)
            boolean flag = false;  // 소수 여부를 나타내는 플래그 (false는 소수임을 의미)
            
            // 이미 발견된 소수들로 n을 나누어 보며 소수 여부를 확인
            // n이 소수라면 소수 목록에서 sqrt(n) 이하의 소수들만 검사하면 됨
            for (int i = 1; prime[i] * prime[i] <= n; i++) {
                counter += 2;  // 두 번의 연산 (곱셈과 나눗셈)을 했으므로 카운터에 2 추가
                
                if (n % prime[i] == 0) {  // n이 소수로 나누어 떨어지면 소수가 아님
                    flag = true;  // 소수가 아님을 표시
                    break;  // 더 이상의 검사는 필요 없으므로 루프 탈출
                }
            }
            
            // flag가 false인 경우, 즉 소수로 판별된 경우 배열에 저장
            if (!flag) {
                prime[ptr] = n;  // 소수를 배열에 저장
                ptr++;  // 소수 개수 증가
                counter++;  // 소수를 찾았을 때 추가 연산을 반영
            }
        }
        
        // 발견된 모든 소수를 출력
        for (int i = 0; i < ptr; i++) {
            System.out.println(prime[i]);  // 배열에 저장된 소수 출력
        }
        
        // 총 곱셈과 나눗셈의 횟수를 출력
        System.out.println("곱셈과 나눗셈을 한 횟수: " + counter);  // 최종적으로 계산한 연산 횟수 출력
        //곱셈과 나눗셈을 한 횟수: 3774
    }
}

