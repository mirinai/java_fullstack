package exec12;


public class CastingTest1 {
    public static void main(String[] args) {

        Car car = null;  // Car 타입의 참조변수 선언, 아직 초기화되지 않음
        FireEngine fe = new FireEngine();  // FireEngine 객체 생성
        FireEngine fe2 = null;  // FireEngine 타입의 참조변수 선언, 아직 초기화되지 않음

        // FireEngine 객체 fe를 사용하여 메소드 호출
        fe.drive();  // Car 클래스에 정의된 메소드 호출
        fe.stop();   // Car 클래스에 정의된 메소드 호출
        fe.water();  // FireEngine 클래스에 정의된 메소드 호출 (소방차의 물 뿌리기 기능)
        
        car = fe;    // 업캐스팅: FireEngine 타입이 Car 타입으로 자동 변환
        // 업캐스팅 후, car는 FireEngine 객체를 참조하지만 Car 타입이므로 Car 클래스의 메소드만 호출 가능
        System.out.println("===========");
        
        fe.drive();  // 여전히 FireEngine 타입이므로 모든 메소드 호출 가능
        fe.stop();
        fe.water();
        
        System.out.println("===========");
        
        // car.water();  // 컴파일 오류: Car 타입은 FireEngine의 water() 메소드에 접근할 수 없음
        
        fe2 = (FireEngine)car;  // 다운캐스팅: Car 타입을 다시 FireEngine 타입으로 변환
        // 다운캐스팅을 통해 FireEngine의 모든 메소드에 다시 접근 가능
        
        fe2.drive();  // FireEngine 객체로서 drive() 메소드 호출
        fe2.stop();   // FireEngine 객체로서 stop() 메소드 호출
        fe2.water();  // FireEngine 객체로서 water() 메소드 호출
        
        System.out.println("===========");
        
        car.drive();  // car는 여전히 Car 타입이므로 Car 클래스의 메소드만 호출 가능
        car.stop();
        
    }
}

class Car {
    String color;  // 차량의 색상
    int door;  // 차량의 문 개수

    void drive() {  // 운전하는 기능
        System.out.println("drive, Brrrr~");
    }

    void stop() {   // 멈추는 기능
        System.out.println("stop!!");
    }
}

class FireEngine extends Car {  // FireEngine 클래스는 Car 클래스를 상속받음
    void water() {  // 물을 뿌리는 기능 (소방차 기능)
        System.out.println("water!!!");
    }
}
