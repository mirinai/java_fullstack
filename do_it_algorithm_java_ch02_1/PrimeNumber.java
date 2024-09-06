package do_it_algorithm_java_ch02_1;

public class PrimeNumber {
    public static void main(String[] args) {
        int counter = 0; // 나눗셈의 횟수를 저장하는 변수
        int i;  // 약수 후보 숫자를 저장할 변수

        // 2부터 999까지의 숫자 중에서 소수를 찾는 루프
        for (int n = 2; n < 1000; n++) {

            // 2부터 n-1까지의 수로 n을 나누면서 소수 여부를 판정
            for (i = 2; i < n; i++) {
                counter++;  // 나눗셈을 수행한 횟수를 증가시킴
                if (n % i == 0) {  // n이 i로 나누어 떨어지면 소수가 아님
                    break;  // 소수가 아니므로 반복문 탈출
                }
            }

            // n이 i와 같다면 n은 소수 (n이 어떤 수로도 나누어지지 않았을 때)
            if (n == i) {
                System.out.println("prime number: " + n);  // 소수 출력
            }
        }

        // 총 나눗셈 횟수를 출력
        System.out.println("나눗셈을 한 횟수: " + counter);//나눗셈을 한 횟수: 78021
    }
}

