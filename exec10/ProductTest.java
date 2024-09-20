package exec10;

//Product 클래스 정의
class Product {
 int serialNo;              // 각 제품의 고유 시리얼 번호
 static int count = 0;      // 생성된 제품의 총 개수를 추적하는 정적 변수

 // 인스턴스 초기화 블록
 {
     ++count;               // 제품이 생성될 때마다 count를 1 증가시킴
     serialNo = count;      // 현재 제품의 시리얼 번호를 count 값으로 설정
 }

 // 기본 생성자
 public Product() {}
}

//ProductTest 클래스 정의
class ProductTest {
 public static void main(String[] args) {
     Product p1 = new Product();  // 첫 번째 Product 객체 생성
     Product p2 = new Product();  // 두 번째 Product 객체 생성
     Product p3 = new Product();  // 세 번째 Product 객체 생성

     // 각 Product 객체의 시리얼 번호 출력
     System.out.println("p1의 시리얼넘버: " + p1.serialNo); // 출력: p1의 시리얼넘버: 1
     System.out.println("p2의 시리얼넘버: " + p2.serialNo); // 출력: p2의 시리얼넘버: 2
     System.out.println("p3의 시리얼넘버: " + p3.serialNo); // 출력: p3의 시리얼넘버: 3

     // 생성된 제품의 총 개수 출력
     System.out.println("총 생성된 제품의 수: " + Product.count); // 출력: 총 생성된 제품의 수: 3
 }
}
