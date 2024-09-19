package exec9;

//Person 클래스 정의 (참조형 매개변수 예제에 사용)
class Person {
 String name;
 int age;

 Person(String name, int age) {
     this.name = name;
     this.age = age;
 }
}

//ParameterTest 클래스 정의
public class ParameterTest {

 public static void main(String[] args) {
	 
     // 기본형 매개변수 테스트
     int originalValue = 10;
     
     System.out.println("메서드 호출 전 originalValue: " + originalValue);
     modifyPrimitive(originalValue);
     System.out.println("메서드 호출 후 originalValue: " + originalValue);
     System.out.println();

     
     // 참조형 매개변수 테스트
     Person person = new Person("Alice", 25);
     
     System.out.println("메서드 호출 전 person.name: " + person.name + ", person.age: " + person.age);
     modifyReference(person);
     System.out.println("메서드 호출 후 person.name: " + person.name + ", person.age: " + person.age);
     System.out.println();

     // 참조형 매개변수 테스트 - 객체 재할당 시도
     System.out.println("메서드 호출 전 person.name: " + person.name + ", person.age: " + person.age);
     reassignReference(person);
     System.out.println("메서드 호출 후 person.name: " + person.name + ", person.age: " + person.age);
 }

 // 기본형 매개변수를 수정하려는 메서드
 public static void modifyPrimitive(int number) {
     number = 20; // 로컬 변수 'number'의 값을 변경
     System.out.println("modifyPrimitive 메서드 내 number: " + number);
 }

 // 참조형 매개변수를 수정하려는 메서드
 public static void modifyReference(Person p) {
     p.age = 30; // 객체의 필드 'age'를 변경
     System.out.println("modifyReference 메서드 내 p.name: " + p.name + ", p.age: " + p.age);
 }

 // 참조형 매개변수를 재할당하려는 메서드
 public static void reassignReference(Person p) {
     p = new Person("Bob", 40); // 로컬 변수 'p'를 새로운 객체로 재할당
     System.out.println("reassignReference 메서드 내 p.name: " + p.name + ", p.age: " + p.age);
 }
}
