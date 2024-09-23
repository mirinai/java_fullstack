package exec11;

public class SmartPhoneExample {
    public static void main(String[] args) {
        // SmartPhone 객체 생성 (모델명: iphon, 색상: silver)
        SmartPhone mp = new SmartPhone("iphon", "silver");
        
        // SmartPhone 객체의 필드 출력 (모델명, 색상)
        System.out.println("model: " + mp.model);
        System.out.println("color: " + mp.color);
        
        // 초기 wifi 상태 출력 (false로 기본값 설정)
        System.out.println("wifi state: " + mp.wifi);
        
        // Phone 클래스로부터 상속받은 메서드 호출
        mp.bell();  // 벨이 울림
        mp.sendVoice("hello");  // 음성 송신
        mp.receiveVoice("hello, I'm jonny");  // 음성 수신
        mp.sendVoice("nice to talk to you");  // 추가 음성 송신
        mp.hangUp();  // 전화 끊기
        
        // SmartPhone 클래스 고유의 메서드 호출
        mp.setWifi(true);  // 와이파이 켬
        mp.internet();  // 인터넷에 연결됨
    }
}
