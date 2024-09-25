package exec14;

class MyTv2 {
	// 인스턴스 변수
	private boolean isPowerOn = true; // TV의 전원 상태 (true = 켜짐, false = 꺼짐)
	private int channel; // 현재 채널
	private int volume; // 현재 볼륨

	// 상수: 최대 및 최소 볼륨과 채널 값
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;

	// 이전 채널을 저장하기 위한 변수
	private int preChannel = 0;

	// TV 전원 상태를 반환하는 메서드
	boolean getIsPowerOn() {
		return isPowerOn;
	}

	// TV 전원을 켜거나 끄는 메서드 (현재 상태의 반대로 전환)
	void setIsPowerOn() {
		isPowerOn = !isPowerOn; // 전원 상태를 반전
	}

	// 현재 채널을 반환하는 메서드
	int getChannel() {
		return channel;
	}

	// 채널을 설정하는 메서드
	// x의 값에 따라 채널을 증가 또는 감소시킴
	void setChannel(int x) {
		if (isPowerOn) { // 전원이 켜져 있을 때만 동작
			preChannel = channel; // 이전 채널 저장
			if (x > 0) { // x가 양수일 경우 채널 증가
				if (channel < MAX_CHANNEL) { // 채널이 최대값보다 작을 경우
					channel = +channel + x; // 채널 증가
				}
			} else { // x가 음수일 경우 채널 감소
				if (channel > MIN_CHANNEL) { // 채널이 최소값보다 클 경우
					channel = +channel + x; // 채널 감소
				}
			}
		}
	}

	// 현재 볼륨을 반환하는 메서드
	int getVolume() {
		return volume;
	}

	// 볼륨을 설정하는 메서드
	// x의 값에 따라 볼륨을 증가 또는 감소시킴
	void setVolume(int x) {
		if (isPowerOn) { // 전원이 켜져 있을 때만 동작
			if (x > 0) { // x가 양수일 경우 볼륨 증가
				if (volume < MAX_VOLUME) { // 볼륨이 최대값보다 작을 경우
					volume = +volume + x; // 볼륨 증가
				}
			} else { // x가 음수일 경우 볼륨 감소
				if (volume > MIN_VOLUME) { // 볼륨이 최소값보다 클 경우
					volume = +volume + x; // 볼륨 감소
				}
			}
		}
	}

	// 이전 채널로 이동하는 메서드
	void gotoPrevChannel() {
		channel = preChannel; // 이전 채널을 현재 채널로 설정
	}
	// public boolean getIsPowerOn() {
//  return isPowerOn;
//}
//public void setPowerOn(boolean isPowerOn) {
//  this.isPowerOn = !isPowerOn;
//}
//public void setVolume(int volume){
// if(volume > MAX_VOLUME || volume < MIN_VOLUME) {
//    return;
// }
// this.volume = volume;
//}
//public int getVolume(){
// return volume;
//}
//public void setChannel(int channel){
// if(channel > MAX_CHANNEL || channel < MIN_CHANNEL) {
//    return;
// }
// this.channel = channel;
//}
//public int getChannel(){
// return channel;
//}

//	public void setChannel(int channel){
//	      if(channel > MAX_CHANNEL || channel < MIN_CHANNEL) {
//	         return;
//	      }
//	      prevChannel = this.channel; // . 현재 채널을 이전 채널에 저장한다
//	      this.channel = channel;
//	   }
//	public void gotoPrevChannel() {
//	      setChannel(prevChannel); //현재 체널을 이전 채널로 변경한다
//	   }
}

// 메인 클래스
public class Exercise7_11 {
	public static void main(String[] args) {
		MyTv2 t = new MyTv2(); // MyTv2 인스턴스 생성

		// 채널 설정 및 출력
		t.setChannel(10);
		System.out.println("CH: " + t.getChannel());

		// 볼륨 설정 및 출력
		t.setVolume(20);
		t.setVolume(-10);
		System.out.println("VOL: " + t.getVolume());

		// 전원 상태 변경 및 출력
		t.setIsPowerOn();
		System.out.println("---------------");
		System.out.println("POWER: " + t.getIsPowerOn());

		// 채널과 볼륨 변경 후 상태 출력
		t.setChannel(10);
		t.setVolume(20);
		System.out.println("channel+10, volume+20");
		System.out.println("-------------");
		System.out.println("CH: " + t.getChannel());
		System.out.println("VOL: " + t.getVolume());

		// 전원 다시 켜기
		t.setIsPowerOn();
		System.out.println("POWER: " + t.getIsPowerOn());

		// 이전 채널로 돌아가기 테스트
		t.setChannel(10);
		t.setVolume(20);
		System.out.println("-------------");
		System.out.println("CH: " + t.getChannel());
		System.out.println("VOL: " + t.getVolume());
		t.gotoPrevChannel(); // 이전 채널로 이동
		System.out.println("PREV_CH: " + t.getChannel());
	}
}
