package exec15;

public class Exercise7_19_1 {
    public static void main(String[] args) {
        Buyer b = new Buyer();
        b.buy(new Tv());
        b.buy(new Computer());
        b.buy(new Tv());
        b.buy(new Audio());
        b.buy(new Computer());
        b.buy(new Computer());
        b.buy(new Computer());
        b.buy(new Computer());
        
        b.summary();
    }
}

class Buyer_1 {
    int money = 1000; // 구매자의 돈
    Product[] cart = new Product[3]; // 장바구니의 초기 크기
    int i = 0; // 장바구니에 담긴 물건의 개수

    // 물건을 구매하는 메서드
    void buy(Product p) {
        if (money < p.price) {
            System.out.println("돈이 부족함");
        } else {
            money -= p.price; // 구매 후 잔액 차감
            add(p); // 장바구니에 물건 추가
        }
    }

    // 장바구니에 물건을 추가하는 메서드
    void add(Product p) {
        // 장바구니가 가득 찼을 때 크기를 두 배로 늘림
        if (i >= cart.length) {
            Product[] cart2 = new Product[cart.length * 2]; // 크기를 두 배로 확장
            for (int j = 0; j < cart.length; j++) {
                cart2[j] = cart[j]; // 기존 장바구니의 내용을 새 배열로 복사
            }
            cart = cart2; // 장바구니를 새로운 배열로 교체
        }
        cart[i++] = p; // 물건을 장바구니에 추가 후 인덱스 증가
    }

    // 구매한 물건들을 요약 출력하는 메서드
    void summary() {
        int sum = 0; // 총 가격
        System.out.println("구매 목록:");
        
        // 장바구니에 담긴 물건들의 목록 출력 및 총 가격 계산
        for (int k = 0; k < i; k++) { // 실제로 담긴 물건 수만큼 반복
            System.out.println(cart[k]); // 물건 출력
            sum += cart[k].price; // 총 가격 계산
        }

        // 총 가격과 남은 돈 출력
        System.out.println("총 가격: " + sum + "원");
        System.out.println("남은 돈: " + money + "원");
    }
}

class Product_1 {
    int price; // 제품 가격

    Product_1(int price) {
        this.price = price;
    }
}

class Tv_1 extends Product {
    Tv_1() {
        super(100); // TV 가격은 100
    }

    public String toString() {
        return "Tv";
    }
}

class Computer_1 extends Product {
    Computer_1() {
        super(200); // 컴퓨터 가격은 200
    }

    public String toString() {
        return "Computer";
    }
}

class Audio_1 extends Product {
    Audio_1() {
        super(50); // 오디오 가격은 50
    }

    public String toString() {
        return "Audio";
    }
}