package exec9;

class NumberHolder {
	int number;
}

public class ParameterTest2 {
	static void modifyPrimitive(int num) {
		num+=10;
		 System.out.println("modifyPrimitive 메서드 내 num: " + num);
	}
	static void modifyReference(NumberHolder nh) {
		nh.number = nh.number+10;
		System.out.println("modifyReference 메서드 내 nh.number: " + nh.number);
	}

	static NumberHolder createNewNumberHolder(int num) {
		NumberHolder newNh = new NumberHolder();
		newNh.number = num+20;
		System.out.println("createNewNumberHolder 메서드 내 newNh.number: " + newNh.number);
		return newNh;
	}
	public static void main(String[] args) {
		int a = 5; // 기본형 변수 a 선언 및 초기화
        NumberHolder nh1 = new NumberHolder(); // NumberHolder 객체 nh1 생성
        nh1.number = 15; // nh1의 number 필드에 값 할당
        
        System.out.println("main 메서드 시작");
        System.out.println("a: " + a);
        System.out.println("nh1.number: " + nh1.number);
        System.out.println();
        
        modifyPrimitive(a); // 기본형 매개변수 메서드 호출 //15
        modifyReference(nh1); // 참조형 매개변수 메서드 호출//25
        NumberHolder nh2 = createNewNumberHolder(a); // 참조형 리턴타입 메서드 호출 및 반환값 저장
        
        System.out.println();
        System.out.println("main 메서드 종료");
        System.out.println("a: " + a);
        System.out.println("nh1.number: " + nh1.number);
        System.out.println("nh2.number: " + nh2.number); //25
	}
}
