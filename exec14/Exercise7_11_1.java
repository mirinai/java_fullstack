package exec14;

class MyTv2_1 {
    // 인스턴스 변수
    private boolean isPowerOn = true;
    private int channel;
    private int volume;
    private int preChannel = 0;

    // 상수
    private static final int MAX_VOLUME = 100;
    private static final int MIN_VOLUME = 0;
    private static final int MAX_CHANNEL = 100;
    private static final int MIN_CHANNEL = 1;

    // 전원 상태 반환
    boolean isPowerOn() {
        return isPowerOn;
    }

    // 전원 켜기/끄기
    void togglePower() {
        isPowerOn = !isPowerOn;
    }

    // 현재 채널 반환
    int getChannel() {
        return channel;
    }

    // 채널 설정
    void changeChannel(int x) {
        if (!isPowerOn) return; // 전원이 꺼져있으면 채널 변경 불가

        preChannel = channel; // 이전 채널 저장
        channel = Math.max(MIN_CHANNEL, Math.min(channel + x, MAX_CHANNEL)); // 채널 범위 제한
    }

    // 현재 볼륨 반환
    int getVolume() {
        return volume;
    }

    // 볼륨 설정
    void changeVolume(int x) {
        if (!isPowerOn) return; // 전원이 꺼져있으면 볼륨 변경 불가

        volume = Math.max(MIN_VOLUME, Math.min(volume + x, MAX_VOLUME)); // 볼륨 범위 제한
    }

    // 이전 채널로 이동
    void goToPrevChannel() {
        int temp = channel;
        channel = preChannel;
        preChannel = temp;
    }
}

// 메인 클래스
public class Exercise7_11_1 {
    public static void main(String[] args) {
    	MyTv2_1 t = new MyTv2_1();

        t.changeChannel(10);
        System.out.println("CH: " + t.getChannel());

        t.changeVolume(20);
        System.out.println("VOL: " + t.getVolume());

        t.togglePower();
        System.out.println("POWER: " + t.isPowerOn());

        t.togglePower();
        t.changeChannel(10);
        t.changeVolume(20);
        System.out.println("CH: " + t.getChannel());
        System.out.println("VOL: " + t.getVolume());

        t.goToPrevChannel();
        System.out.println("PREV_CH: " + t.getChannel());
    }
}

