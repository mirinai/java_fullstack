package exec14;

class Product {
    int price;      // 제품의 가격
    int bonusPoint; // 보너스 포인트

    // Product 생성자, 가격을 매개변수로 받아 초기화
    Product(int price) {
        this.price = price; // 가격 설정
        bonusPoint = (int)(price / 10.0); // 보너스 포인트는 가격의 10%
    }
}

class Tv extends Product {
    
    // Tv 생성자
    Tv() {
        super(100); // 부모 클래스의 생성자를 호출하여 가격을 100으로 설정
    }

    // toString 메소드: Tv 객체가 출력될 때 "Tv" 문자열을 반환
    public String toString() {
        return "Tv";
    }
}

public class Exercise7_5 {
    public static void main(String[] args) {
        Tv t = new Tv(); // Tv 객체 생성 (가격은 부모 생성자를 통해 100으로 설정됨)
        
        // Tv 객체의 가격과 보너스 포인트 출력
        System.out.println("t.price: " + t.price); // 부모 클래스의 price 필드 출력
        System.out.println("t.bonusPoint: " + t.bonusPoint); // 부모 클래스의 bonusPoint 필드 출력
    }
}
