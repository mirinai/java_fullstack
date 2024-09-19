package exec9;

//Card 클래스 정의
class Card {
 String kind; // 카드의 무늬 (예: heart, spade 등)
 int number;  // 카드의 숫자 (예: 1부터 13까지)
 
 // 모든 카드가 공유하는 너비와 높이 (static 변수)
 static int width = 100;
 static int height = 250;
}

//CardTest 클래스 정의
public class CardTest {

 public static void main(String[] args) {
     
     // 클래스 변수(width와 height)는 클래스 이름으로 직접 접근 가능
     System.out.println("CardTest.width = " + Card.width);   // Card 클래스의 width 출력
     System.out.println("CardTest.height = " + Card.height); // Card 클래스의 height 출력
     
     // 첫 번째 카드 객체 생성
     Card c1 = new Card();
     c1.kind = "heart"; // c1의 무늬를 "heart"로 설정
     c1.number = 7;     // c1의 숫자를 7로 설정
     
     // 두 번째 카드 객체 생성
     Card c2 = new Card();
     c2.kind = "spade"; // c2의 무늬를 "spade"로 설정
     c2.number = 7;     // c2의 숫자를 7로 설정
     
     // c1과 c2의 무늬 출력
     System.out.println("c1.kind: " + c1.kind + ", " + "c2.kind: " + c2.kind);
     
     // c1과 c2의 숫자 출력
     System.out.println("c1.number: " + c1.number + ", " + "c2.number: " + c2.number);
     
     // 카드의 크기 출력 (width와 height)
     System.out.println("크기");
     System.out.println("c1.width: " + Card.width);
     System.out.println("c2.width: " + Card.width);
     System.out.println("c1.height: " + Card.height);
     System.out.println("c2.height: " + Card.height);
     System.out.println();
     
     // 카드 c1을 통해 width와 height를 변경 (static 변수이므로 모든 카드에 영향을 미침)
     System.out.println("c1 -> height와 width를 바꾸기");
     Card.width = 50;   // 모든 카드의 width를 50으로 변경
     Card.height = 80;  // 모든 카드의 height를 80으로 변경
     System.out.println();
     
     // 변경된 c1과 c2의 무늬 출력 (변경되지 않음)
     System.out.println("c1.kind: " + c1.kind + ", " + "c2.kind: " + c2.kind);
     
     // 변경된 c1과 c2의 숫자 출력 (변경되지 않음)
     System.out.println("c1.number: " + c1.number + ", " + "c2.number: " + c2.number);
     
     // 변경된 카드의 크기 출력 (width와 height가 변경됨)
     System.out.println("크기");
     System.out.println("c1.width: " + c1.width);
     System.out.println("c2.width: " + c2.width);
     System.out.println("c1.height: " + c1.height);
     System.out.println("c2.height: " + c2.height);
 }
}

