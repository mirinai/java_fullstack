package exec3;

public class SelectingMenu {
    public static void main(String[] args) {
        // Math.random()을 이용하여 0~6 사이의 난수를 생성하고, 그 값을 정수로 변환하여 출력하는 예시 코드
        // 이 부분은 주석 처리되어 실행되지 않음
        // double a = Math.random() * 6;
        // System.out.println((int) a);

        int menuNum = 0;  // 메뉴 번호를 저장할 변수 선언

        // Math.random()을 이용하여 1부터 5까지의 난수를 생성하여 menuNum에 저장하는 예시 코드
        // 이 부분도 주석 처리되어 실행되지 않음
        // menuNum = (int) (Math.random() * 5) + 1;
        // System.out.println(menuNum);

        System.out.println("5menu selecting program");  // 프로그램 시작을 알리는 출력문

        int i = 0;  // 반복문에서 사용할 카운터 변수 i 선언

        // i가 50이 될 때까지 반복
        while (i < 50) {
            i++;  // i를 1씩 증가
            // 1부터 5 사이의 난수를 생성하여 menuNum에 저장
            menuNum = (int) (Math.random() * 5) + 1;
            // 생성된 menuNum을 2자리 정수 형식으로 출력
            System.out.printf("%2d", menuNum);

            // i가 10의 배수일 때마다 줄바꿈을 실행하여 10개씩 출력
            if (i % 10 == 0) {
                System.out.println();  // 줄바꿈
            }
        }

        // 난수로 선택된 menuNum에 따라 메뉴를 출력
        if (menuNum == 1) {
            System.out.println("americano");  // menuNum이 1일 때 "americano" 출력
        } else if (menuNum == 2) {
            System.out.println("milktea");  // menuNum이 2일 때 "milktea" 출력
        } else if (menuNum == 3) {
            System.out.println("cafe latte");  // menuNum이 3일 때 "cafe latte" 출력
        } else if (menuNum == 4) {
            System.out.println("strawberry latte");  // menuNum이 4일 때 "strawberry latte" 출력
        } else {
            System.out.println("etc..");  // menuNum이 5일 때 "etc.." 출력
        }
    }
}

