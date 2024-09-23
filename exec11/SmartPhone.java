package exec11;

// SmartPhone 클래스는 Phone 클래스를 상속
public class SmartPhone extends Phone {
    public boolean wifi;  // 와이파이 상태를 나타내는 변수 (true: 켜짐, false: 꺼짐)
    
    // SmartPhone 생성자: 모델명과 색상을 받아 초기화
    public SmartPhone(String model, String color) {
        this.model = model;  // Phone 클래스의 model 필드 상속받음
        this.color = color;  // Phone 클래스의 color 필드 상속받음
    }
    
    // 와이파이 상태를 설정하는 메서드
    public void setWifi(boolean wifi) {
        this.wifi = wifi;  // 와이파이 상태 변경
        System.out.println("와이파이의 상태 바뀜");  // 상태 변경 시 출력 메시지
    }
    
    // 인터넷에 연결되는 메서드
    public void internet() {
        System.out.println("인터넷에 연결됨");
    }
}
