package exec11_2;

public class DeckTest {
    public static void main(String[] args) {
        Deck d = new Deck();  // 새로운 Deck 객체 생성
        Card c = d.pick(0);   // 덱에서 첫 번째 카드를 선택

        // 선택한 카드를 출력
        System.out.println(c);
//        System.out.println(c.toString());
        
        System.out.println("After mixing cards\n");
        d.shuffle();  // 덱을 섞음
        c = d.pick(0);  // 섞은 후 다시 첫 번째 카드를 선택

        // 새로 선택한 카드를 출력
//        System.out.println(c);
        System.out.println(c.toString());
        
        System.out.println("After mixing cards\n");
        d.shuffle();  // 덱을 섞음
        c = d.pick(0);  // 섞은 후 다시 첫 번째 카드를 선택
        
        // 새로 선택한 카드를 출력
        System.out.println(c);
//        System.out.println(c.toString());
        
        
        System.out.println("After mixing cards\n");
        d.shuffle();  // 덱을 섞음
        c = d.pick(0);  // 섞은 후 다시 첫 번째 카드를 선택
        
        // 새로 선택한 카드를 출력
        System.out.println(c.toString());
    }
}

class Deck {
    final int CARD_NUM = 52;  // 카드의 개수는 52장
    Card cardArr[] = new Card[CARD_NUM];  // 카드 배열 선언

    // 생성자: 덱을 초기화 (카드 배열에 카드 생성)
    Deck() {
        int i = 0;
        // 카드의 종류와 숫자를 순차적으로 배열에 넣음
        for (int k = Card.KIND_MAX; k > 0; k--) {
            for (int n = 0; n < Card.NUM_MAX; n++) {
                cardArr[i++] = new Card(k, n + 1);
            }
        }
    }

    // 인덱스를 받아 그 위치의 카드를 반환
    Card pick(int index) {
        return cardArr[index];
    }

    // 랜덤으로 카드를 선택하는 메소드
    Card pick() {
        int index = (int) (Math.random() * CARD_NUM);  // 랜덤 인덱스 생성
        return pick(index);  // 해당 인덱스의 카드 반환
    }

    // 덱을 섞는 메소드
    void shuffle() {
        for (int i = 0; i < cardArr.length; i++) {
            int r = (int) (Math.random() * CARD_NUM);  // 랜덤한 위치 선정

            // 두 카드의 위치를 교환
            Card temp = cardArr[i];
            cardArr[i] = cardArr[r];
            cardArr[r] = temp;
        }
    }
}

class Card {
    // 카드 종류와 숫자의 최대값
    static final int KIND_MAX = 4;
    static final int NUM_MAX = 13;

    // 카드의 종류 상수 선언
    static final int SPADE = 4;
    static final int DIAMOND = 3;
    static final int HEART = 2;
    static final int CLOVER = 1;

    // 카드의 종류와 숫자
    int kind;
    int number;

    // 기본 생성자: SPADE 1로 기본 카드 생성
    Card() {
        this(SPADE, 1);
    }

    // 카드의 종류와 숫자를 받아 카드 생성
    Card(int kind, int number) {
        this.kind = kind;
        this.number = number;
    }

    // 카드를 문자열로 출력하는 메소드
    public String toString() {
        String[] kinds = {"", "CLOVER", "HEART", "DIAMOND", "SPADE"};  // 카드 종류 배열
        String numbers = "0123456789XJQK";  // 숫자 및 특수 문자 배열
        
        // 카드의 종류와 숫자를 반환
        return "kind: " + kinds[this.kind] + ", number: " + numbers.charAt(this.number);
    }
}
