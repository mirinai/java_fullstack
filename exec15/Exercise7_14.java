package exec15;

/*
 * 	이 문제는 SutdaCard 클래스의 **카드 숫자(num)**와 **광 여부(isKwang)**가 한 번 설정되면 변경되지 않도록 하라는 내용입니다. 즉, **불변성(immutable)**을 유지해야 한다는 뜻입니다. 이는 실수로 카드 값을 바꿔서 같은 카드가 여러 장 생기는 문제를 방지하기 위한 것입니다.

	해결 방법:
	num과 isKwang을 변경할 수 없도록 설정해야 합니다. 이를 위해 두 필드를 final로 선언하면, 한 번 설정된 값은 수정할 수 없습니다.
	final로 선언하면, 생성자를 통해 초기화된 이후에는 값을 변경할 수 없게 됩니다.
 */

import exec15.SutdaCard;
//import exec15.SutdaDeck;

// SutdaCard 클래스 정의
class SutdaCard {
	// 필드를 final로 선언하여 값이 한번 설정되면 변경되지 않도록 함
	final int num; // 카드에 적힌 숫자 (한번 설정되면 변경 불가)
	final boolean isKwang; // 광(Kwang) 여부 (한번 설정되면 변경 불가)

	// 기본 생성자, 1광(Kwang)으로 기본 설정
	SutdaCard() {
		this(1, true); // 숫자 1, 광(true)로 기본 카드 생성
	}

	// SutdaCard 생성자: num(숫자), isKwang(광 여부)를 매개변수로 받음
	SutdaCard(int num, boolean isKwang) {
		this.num = num; // 카드의 숫자 설정 (한번 설정 후 변경 불가)
		this.isKwang = isKwang; // 광(Kwang) 여부 설정 (한번 설정 후 변경 불가)
	}

	// toString 메소드: 카드 정보를 문자열로 반환
	public String toString() {
		return num + (isKwang ? "K" : ""); // 광일 경우 'K'를 붙여 출력
	}
}

// 메인 클래스
class Exercise7_14 {
	public static void main(String[] args) {
		// SutdaCard 인스턴스를 생성하고 카드 정보를 출력
		SutdaCard card = new SutdaCard(1, true);
		System.out.println(card.toString()); // 1K 출력 (광이므로 K가 붙음)
	}
}
