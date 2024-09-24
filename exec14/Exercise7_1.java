package exec14;

class SutdaDeck {
    final int CARD_NUM = 20; // 총 카드의 개수는 20장

    SutdaCard[] cards = new SutdaCard[CARD_NUM]; // SutdaCard 객체를 저장할 배열을 선언, 20개의 SutdaCard 객체를 담음

    // SutdaDeck 생성자
    SutdaDeck() {
        // 1부터 10까지 각각 두 장씩 생성, 숫자가 1, 3, 8인 경우 첫 번째 카드만 '광(Kwang)'으로 설정
        for (int i = 0; i < CARD_NUM; i++) {
            int num = i % 10 + 1; // 카드 숫자는 1부터 10까지 반복되도록 설정
            
            boolean isKwang = (num == 1 || num == 3 || num == 8) && i < 10; // 1, 3, 8의 첫 번째 카드만 '광'으로 설정

            cards[i] = new SutdaCard(num, isKwang); // SutdaCard 객체를 배열에 저장
        }
    }

    // 섯다카드를 섞는 메소드
    void shuffle() {
        SutdaCard temp; // 카드 교환을 위한 임시 변수

        for (int i = 0; i < CARD_NUM; i++) {
            int r = (int) (Math.random() * 10) + 1; // 1~10 사이의 랜덤 인덱스 생성
            temp = cards[r]; // 임시로 랜덤한 카드를 저장
            cards[r] = cards[i]; // 현재 카드와 랜덤 카드 위치 교환
            cards[i] = temp; // 랜덤 카드의 자리에 현재 카드를 넣음
        }
    }

    // 특정 인덱스의 카드를 뽑는 메소드
    SutdaCard pick(int index) {
        return cards[index]; // 입력된 인덱스에 해당하는 카드를 반환
    }

    // 랜덤하게 카드를 뽑는 메소드
    SutdaCard pick() {
        int r = (int) (Math.random() * 10) + 1; // 1~10 사이의 랜덤 인덱스 생성
        return cards[r]; // 랜덤한 카드를 반환
    }
}

class SutdaCard {
    int num; // 카드에 적힌 숫자
    boolean isKwang; // 광(Kwang) 여부

    // 기본 생성자, 1광(Kwang)으로 기본 설정
    SutdaCard() {
        this(1, true); // 숫자 1, 광(true)로 기본 카드 생성
    }

    // SutdaCard 생성자: num(숫자), isKwang(광 여부)를 매개변수로 받음
    SutdaCard(int num, boolean isKwang) {
        this.num = num; // 카드의 숫자 설정
        this.isKwang = isKwang; // 광(Kwang) 여부 설정
    }

    // toString 메소드: 카드 정보를 문자열로 반환
    public String toString() {
        return num + (isKwang ? "K" : ""); // 광일 경우 'K'를 붙여 출력
    }
}

class Exercise7_1 {
    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck(); // SutdaDeck 객체 생성

        // 0번째 카드를 출력
        System.out.println(deck.pick(0));
        // 랜덤으로 뽑은 카드를 출력
        System.out.println(deck.pick());

         //섯다 카드 전체를 출력하기 전 shuffle 메소드를 실행하면 섞임
         deck.shuffle();

        // 20장의 섯다 카드를 출력
        for (int i = 0; i < deck.cards.length; i++) {
            System.out.print(deck.cards[i] + ", "); // 각 카드 정보를 출력
        }
        System.out.println(); // 줄바꿈을 추가

        // 0번째 카드를 다시 출력 (shuffle을 하지 않았으므로 동일한 카드가 나옴)
        System.out.println(deck.pick(0));
    }
}
