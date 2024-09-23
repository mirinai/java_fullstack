package exec11;

// 기본 Phone 클래스 정의
public class Phone {
    public String model;  // 전화기의 모델명
    public String color;  // 전화기의 색상
    
    // 벨이 울리는 메서드
    public void bell() {
        System.out.println("벨이 울림");
    }
    
    // 음성을 보내는 메서드 (사용자가 말할 때)
    public void sendVoice(String message) {
        System.out.println("나: " + message);
    }
    
    // 음성을 받는 메서드 (상대방이 말할 때)
    public void receiveVoice(String message) {
        System.out.println("다른 사람: " + message);
    }
    
    // 전화를 끊는 메서드
    public void hangUp() {
        System.out.println("전화 끊기");
    }
}

