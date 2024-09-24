package exec14;

class Parent {
    int x = 100;  // Parent 클래스의 인스턴스 변수 x, 초기값은 100

    // Parent 클래스의 기본 생성자
    Parent() {
        this(200);  // Parent(int x) 생성자를 호출하여 x의 값을 200으로 설정
    }

    // Parent 클래스의 매개변수 있는 생성자
    Parent(int x) {
        this.x = x;  // 인스턴스 변수 x를 매개변수로 받은 x로 설정
    }

    // x 값을 반환하는 메서드
    int getX() {
        return x;
    }
}

class Child extends Parent {
    int x = 3000;  // Child 클래스의 인스턴스 변수 x, 초기값은 3000

    // Child 클래스의 기본 생성자
    Child() {
        this(1000);  // Child(int x) 생성자를 호출하여 x의 값을 1000으로 설정
    }

    // Child 클래스의 매개변수 있는 생성자
    Child(int x) {
        this.x = x;  // 인스턴스 변수 x를 매개변수로 받은 x로 설정
    }
}

public class Exercise7_7 {
    public static void main(String[] args) {
        Child c = new Child();  // Child 클래스의 기본 생성자를 호출

        // getX()는 Parent 클래스의 메서드를 호출하므로 Parent 클래스의 x 값을 반환
        System.out.println("x = " + c.getX());  // x = 200 출력
    }
}



