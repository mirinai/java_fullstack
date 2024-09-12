package exec7;

public class MethodPractice1 {
    // 메서드 선언 형식: 
    // 리턴타입 이름(타입 변수) {
    //     return 값;
    // }

    // 두 개의 정수를 더해 그 합을 반환하는 인스턴스 메서드 (객체 생성 후 호출 가능)
    int numAdd1(int num1, int num2) {
        return num1 + num2; // 두 숫자의 합을 반환
    }

    // 두 개의 정수를 더해 그 합을 반환하는 클래스(static) 메서드 (객체 생성 없이 호출 가능)
    static int numAdd2(int num1, int num2) {
        int result = num1 + num2; // 두 숫자의 합을 계산
        return result; // 계산된 합을 반환
    }

    // 값을 반환하지 않고 메시지를 출력하는 인스턴스 메서드 (리턴 타입이 void)
    void hello1() {
        System.out.println("이 메소드는 넘겨주는 값이 없음 왜냐하면 void라서");
    }

    public static void main(String[] args) {
        
        // MethodPractice1 클래스의 객체를 생성
        MethodPractice1 method1 = new MethodPractice1();
        
        // 객체를 통해 인스턴스 메서드 numAdd1을 호출하여 2와 3을 더한 값을 출력
        System.out.println("<Object>.numAdd1(2, 3) = " + method1.numAdd1(2, 3));
        
        // static 메서드는 객체를 생성하지 않고 바로 호출 가능
        System.out.println("numAdd2(4, 8) = " + numAdd2(4, 8));

        // 문자열 "asdf"의 첫 번째 문자를 가져오는 코드
        String str = "asdf";
        char c1 = str.charAt(0); // str의 첫 번째 문자를 가져옴 (a)

        // 객체를 통해 인스턴스 메서드 hello1을 호출하여 메시지를 출력
        method1.hello1();
    }
}