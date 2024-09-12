package do_it_algorithm_java_ch03_3;

//Id 클래스: 각 객체에 고유한 id를 부여하고, id의 개수를 추적하는 클래스
class Id {
 private static int counter = 0; // 클래스 변수, 생성된 id의 개수를 추적 (모든 객체가 공유)
 private int id; // 인스턴스 변수, 각 객체에 고유한 id를 저장
 
 // 생성자: 객체가 생성될 때마다 id에 현재 counter 값을 부여하고, counter를 1 증가시킴
 public Id() {
     id = counter++; // id를 현재 counter 값으로 설정한 후 counter 값을 1 증가시킴
 }
 
 // 클래스 메서드: 생성된 id의 개수를 반환
 public static int getCounter() {
     return counter;
 }

 // 인스턴스 메서드: 객체의 고유 id 값을 반환
 public int getId() {
     return id;
 }
}

//IdTester 클래스: Id 클래스를 테스트하는 메인 클래스
public class IdTester {
 public static void main(String[] args) {
     Id a = new Id(); // Id 클래스의 첫 번째 객체 생성
     Id b = new Id(); // Id 클래스의 두 번째 객체 생성
     
     // 각 객체의 고유 id 값을 출력
     System.out.println("a의 id: " + a.getId()); // 첫 번째 객체 a의 id 출력
     System.out.println("b의 id: " + b.getId()); // 두 번째 객체 b의 id 출력
     System.out.println("a의 id: " + a.getId()); // 첫 번째 객체 a의 id를 다시 출력 (동일한 값)
     
     // 현재까지 생성된 id의 개수를 출력 (클래스 메서드를 사용하여 출력)
     System.out.println("주어진 id의 갯수: " + Id.getCounter());
 }
}

