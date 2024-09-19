package exec9;

public class Television {
	public static void main(String[] args) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		
		System.out.println("t1의 채널: "+t1.channel);
		System.out.println("t2의 채널: "+t2.channel);
		
		t1.channel = 7;
		
		System.out.println("t1의 채널 변경");
//		t2 = t1;// 주소를 대입함
		
		System.out.println("t1의 채널: "+t1.channel);
		System.out.println("t2의 채널: "+t2.channel);
	}

}

class Tv{
	String color;
	boolean power;
	int channel;
	int volume;
	
	void power() {power = !power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
	
	void volumeUp() {++volume;}
	void volumeDown() {--volume;}
}
