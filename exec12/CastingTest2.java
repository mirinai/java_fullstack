package exec12;

public class CastingTest2 {
	public static void main(String[] args) {
//		 Car car = new Car();  // Car 객체 생성
//	        Car car2 = null;      // Car 타입 참조변수 선언, 초기화되지 않음
//	        FireEngine fe = null; // FireEngine 타입 참조변수 선언, 초기화되지 않음
//
//	        car.drive();  // Car 클래스의 drive() 메소드 호출
//	        
//	        // fe = (FireEngine)car;
//	        // 강제 다운캐스팅을 시도하지만, 실제로 car는 FireEngine 객체가 아니므로 
//	        // 실행 시 ClassCastException 예외가 발생합니다.
//	        
////	        fe.drive();  // 위의 예외 때문에 이 부분은 실행되지 않음
//	        
//	        car2 = fe;   // fe를 Car 타입으로 업캐스팅 (자동 형변환)
//	        car2.drive();  // Car 클래스의 drive() 메소드 호출 (FireEngine 객체도 Car 메소드를 사용 가능)
		 Car car = new FireEngine();  // FireEngine 객체로 생성 (업캐스팅)
	        Car car2 = null;             // Car 타입 참조변수 선언
	        FireEngine fe = null;        // FireEngine 타입 참조변수 선언

	        car.drive();  // FireEngine 객체지만 Car 타입으로 업캐스팅된 상태에서 drive() 호출

	        fe = (FireEngine)car;  // 다운캐스팅: 실제 객체가 FireEngine이므로 형변환 가능
	        fe.drive();  // 다운캐스팅 후 FireEngine 객체로서 drive() 호출
	        fe.water();  // FireEngine의 water() 메소드 호출

	        car2 = fe;   // FireEngine 객체를 다시 Car 타입으로 업캐스팅
	        car2.drive();  // Car 타입으로 업캐스팅된 상태에서 drive() 호출
	}
}
