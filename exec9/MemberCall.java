package exec9;

//MemberCall 클래스 정의
class MemberCall {
 // 인스턴스 변수 (Instance Variable)
 int iv = 10; // 각 객체마다 고유한 값을 가지는 변수

 // 클래스 변수 (Class Variable) - static 키워드 사용
 static int cv = 20; // 모든 객체가 공유하는 변수

 // 인스턴스 변수 iv2를 클래스 변수 cv로 초기화
 int iv2 = cv; // 인스턴스 변수 iv2는 클래스 변수 cv의 값을 가지게 됨

 // 오류 발생: 클래스 변수는 인스턴스 변수에 직접 접근할 수 없음
 // static int cv2 = iv; // 컴파일 에러 발생

 // 올바른 방법: 클래스 변수 cv2를 인스턴스 변수 iv의 값을 사용하여 초기화
 static int cv2 = new MemberCall().iv; // 새로운 객체를 생성하여 iv 값을 가져옴

 /**
  * 클래스 메서드 (Static Method) - static 키워드 사용
  * 클래스 메서드 내에서는 클래스 변수에는 직접 접근할 수 있지만, 인스턴스 변수에는 직접 접근할 수 없습니다.
  */
 static void staticMethod1() {
     System.out.println(cv); // 클래스 변수 cv 출력

     // 인스턴스 변수 iv는 클래스 메서드에서 직접 접근할 수 없으므로, 객체를 생성하여 접근해야 함
     // System.out.println(iv); // 컴파일 에러 발생

     // 새로운 MemberCall 객체를 생성하여 인스턴스 변수 iv에 접근
     MemberCall c = new MemberCall();
     System.out.println(c.iv); // 생성된 객체 c의 iv 값 출력
 }

 /**
  * 인스턴스 메서드 (Instance Method) - static 키워드 미사용
  * 인스턴스 메서드 내에서는 클래스 변수와 인스턴스 변수 모두에 접근할 수 있습니다.
  */
 void instanceMethod1() {
     System.out.println(cv); // 클래스 변수 cv 출력
     System.out.println(iv); // 인스턴스 변수 iv 출력
 }

 /**
  * 클래스 메서드 (Static Method) - static 키워드 사용
  * 클래스 메서드 내에서는 인스턴스 메서드를 직접 호출할 수 없습니다.
  */
 static void staticMethod2() {
     staticMethod1(); // 같은 클래스 내의 다른 클래스 메서드 호출

     // 인스턴스 메서드는 객체를 통해서만 호출할 수 있으므로, 직접 호출 시도 시 컴파일 에러 발생
     // instanceMethod1(); // 컴파일 에러 발생

     // 새로운 MemberCall 객체를 생성하여 인스턴스 메서드 호출
     MemberCall c = new MemberCall();
     c.instanceMethod1(); // 객체 c를 통해 instanceMethod1 호출
 }

 /**
  * 인스턴스 메서드 (Instance Method) - static 키워드 미사용
  * 인스턴스 메서드 내에서는 클래스 메서드와 인스턴스 메서드를 모두 호출할 수 있습니다.
  */
 void instanceMethod2() {
     MemberCall.staticMethod1(); // 클래스 이름을 통해 클래스 메서드 호출
     instanceMethod1(); // 같은 객체 내의 다른 인스턴스 메서드 호출
 }

 /**
  * main 메서드: 프로그램의 실행 시작점
  */
 public static void main(String[] args) {
     // MemberCall 클래스의 인스턴스 생성
     MemberCall mc = new MemberCall();

     // 인스턴스 변수와 클래스 변수 출력
     System.out.println("인스턴스 변수 iv: " + mc.iv); // 출력: 인스턴스 변수 iv: 10
     System.out.println("클래스 변수 cv: " + MemberCall.cv); // 출력: 클래스 변수 cv: 20
     System.out.println("클래스 변수 cv2: " + MemberCall.cv2); // 출력: 클래스 변수 cv2: 10

     System.out.println();

     // 클래스 메서드 호출
     MemberCall.staticMethod1();
     // 출력:
     // 20
     // 10

     System.out.println();

     // 인스턴스 메서드 호출
     mc.instanceMethod1();
     // 출력:
     // 20
     // 10

     System.out.println();

     // 클래스 메서드 staticMethod2 호출
     MemberCall.staticMethod2();
     // 출력:
     // 20
     // 10

     System.out.println();

     // 인스턴스 메서드 instanceMethod2 호출
     mc.instanceMethod2();
     // 출력:
     // 20
     // 20
     // 10
 }
}
