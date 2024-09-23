package exec11;

class StudaCard {
    int num;          // 카드의 숫자
    boolean isKwang;  // 카드가 '광'인지 여부를 저장하는 변수
    
    // 생성자 1: isKwang만을 매개변수로 받아 num은 랜덤하게 설정
    public StudaCard(boolean isKwang) {
        // this()를 사용하여 두 매개변수를 받는 생성자를 호출 (num은 랜덤 값)
        this((int) (Math.random() * 10) + 1, isKwang); // 랜덤한 숫자 (1~10)과 isKwang 전달
    }

    // 기본 생성자: num은 1, isKwang은 true로 설정된 기본 카드 생성
    public StudaCard() {
        // 기본 카드 값: 숫자 1, isKwang은 true
        this(1, true); 
    }

    // 생성자 3: num과 isKwang 모두를 매개변수로 받아 카드 생성
    public StudaCard(int num, boolean isKwang) {
        // 주어진 num과 isKwang 값으로 초기화
        this.num = num;
        this.isKwang = isKwang;
    }

 // 카드 정보를 반환하는 메서드
    public String info() {
        // isKwang 값에 따라 'K' 또는 'nothing'을 문자열로 저장
        String result = isKwang ? "K" : "nothing";  
        // 카드 번호와 isKwang 여부를 문자열로 반환
        return "card number: " + num + ", isKwang: " + result;
    }
}

public class Exercise6_2 {
    public static void main(String[] args) {
        // num = 3, isKwang = false인 카드 생성
        StudaCard cd1 = new StudaCard(3, false);
        // 기본 생성자 호출 (num = 1, isKwang = true)
        StudaCard cd2 = new StudaCard();
        
        // 생성된 카드들의 정보 출력
        System.out.println(cd1.info());
        System.out.println(cd2.info());
    }
}

