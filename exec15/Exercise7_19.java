package exec15;

public class Exercise7_19 {
	public static void main(String[] args) {
		Buyer b = new Buyer();

		// 여러 가지 제품을 구매하는 과정
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());

		// 구매 요약을 출력
		b.summary();
	}
}

class Buyer {
	int money = 1000; // 구매자가 가지고 있는 돈
	Product[] cart = new Product[3]; // 장바구니의 초기 크기
	int i = 0; // 장바구니에 담긴 제품 수를 추적하는 변수
	boolean isNotified = false; // 잔액 부족 메시지를 한 번만 출력하는 플래그

//	void buy(Product p) {
//		if(money<p.price) {
//			System.out.printf("돈이 부족함, %s를 못삼\n",p);
//		}
//		else {
//
//			money-=p.price;
//			add(p);
//		}
//		
//	}
//	void add(Product p) {
//		if(i>=cart.length) {
//			Product[] cart2 = new Product[cart.length*2];
//			for (int j =0;j<cart.length;j++) {
//				cart2[j] = cart[j];
//			}
//			//새로운 장바구니와 기존의 장바구니를 바꾸기
//			cart = cart2;
//			//물건을 장바구니에 저장하기 그리고 i의 값을 1 늘리기
//			cart[i] = p;
//			i++;
//		}
//	}
//	
//	
//	
//	void summary() {
//		//장바구니에 담긴 목록을 만들어서 출력하기
//		int sum = 0;
//		
//		System.out.println("구매 목록:");
//		//가격들을 모두 더해서 출력하기
//		for (int k =0;k<i;k++) {
//			System.out.println("goods: "+cart[k]);
//			sum+=cart[k].price;
//		}
//		//남은 돈 출력하기
//		System.out.println("총 가격: " + sum + "원");
//		System.out.println("남은 돈: " + money + "원");
//	}

	void buy(Product p) {
		// 잔액이 부족한 경우 메시지 한 번만 출력하고 종료
		if (money < p.price) {
			if (!isNotified) { // 아직 잔액 부족 메시지가 출력되지 않은 경우
				System.out.println("잔액이 부족하여 " + p + " 살수 없습니다.");
				isNotified = true; // 잔액 부족 메시지를 출력했으므로 플래그 설정
			}
			return; // 잔액이 부족하면 구매 시도를 중지하고 종료
		}
		money -= p.price; // 물건을 구매할 수 있으면 돈 차감
		add(p); // 장바구니에 물건 추가
		isNotified = false; // 구매가 성공하면 다시 플래그 초기화
	}

	// 장바구니에 제품을 추가하는 메서드
	void add(Product p) {
		if (i >= cart.length) { // 1.1 i의 값이 장바구니의 크기보다 같거나 크면
			Product[] tmp = new Product[cart.length * 2]; // 1.1.1 2 . 기존의 장바구니보다 2배 큰 새로운 배열을 생성
			// 1.1.2 . 기존의 장바구니의 내용을 새로운 배열에 복사
			System.arraycopy(cart, 0, tmp, 0, cart.length);
			// 1.1.3 . 새로운 장바구니와 기존의 장바구니를 교체
			cart = tmp;
		}
		cart[i++] = p; // 1.2 (cart) . i 1 . 물건을 장바구니에 저장하고, i의 값을 증가시킴
	}

	// 구매한 물건들을 요약 출력하는 메서드
	void summary() {
		String itemList = ""; // 구입한 물건 목록을 저장할 문자열
		int sum = 0; // 총 금액을 저장할 변수
		for (int i = 0; i < cart.length; i++) {
			if (cart[i] == null)
				break; // 장바구니에서 null이 나올 때까지 반복
			itemList += cart[i] + ","; // 1.1 . 장바구니에 담긴 물건 목록을 생성
			sum += cart[i].price; // 1.2 . 장바구니에 담긴 물건들의 가격을 모두 더함
		}
		// 1.3 (돈) . 물건을 사고 남은 금액 출력
		System.out.println("구입한 물건 :" + itemList); // 구입한 물건 목록 출력
		System.out.println("사용한 금액 :" + sum); // 사용한 금액 출력
		System.out.println("남은 금액 :" + money); // 남은 금액 출력
	}
}

class Product {
	int price; // 제품의 가격

	Product(int price) {
		this.price = price; // 제품의 가격을 초기화하는 생성자
	}
}

class Tv extends Product {
	Tv() {
		super(100); // TV의 가격을 100으로 설정
	}

	public String toString() {
		return "Tv"; // TV의 이름을 반환
	}
}

class Computer extends Product {
	Computer() {
		super(200); // Computer의 가격을 200으로 설정
	}

	public String toString() {
		return "Computer"; // Computer의 이름을 반환
	}
}

class Audio extends Product {
	Audio() {
		super(50); // Audio의 가격을 50으로 설정
	}

	public String toString() {
		return "Audio"; // Audio의 이름을 반환
	}
}
