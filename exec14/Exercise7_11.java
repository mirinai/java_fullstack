package exec14;

class MyTv2{
	private boolean isPowerOn = true;
	private int channel;
	private int volume;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME =0;
	final int MAX_CHANNEL =100;
	final int MIN_CHANNEL =1;
	
	private int preChannel = 0;
	
	boolean getIsPowerOn(){
		return isPowerOn;
	}
	void setIsPowerOn(){
		isPowerOn = !isPowerOn;
	}
	
	int getChannel() {
		return channel;
	}
	void setChannel(int x) {
		if(isPowerOn) {
			preChannel=channel;
			if(x>0) {
				if(channel<MAX_CHANNEL) {
					channel=+channel+x;	
				}
			}
			else {
				if(channel>MIN_CHANNEL) {
					channel=+channel+x;	
				}
			}	
		}
		
		
	}
	int getVolume() {
		return volume;
	}
	void setVolume(int x) {
		if(isPowerOn) {
			if(x>0) {
				if(volume<MAX_VOLUME) {
					volume=+volume+x;	
				}
			}
			else {
				if(volume>MIN_CHANNEL) {
					volume=+volume+x;	
				}
			}	
		}
	}
	
	
	void gotoPrevChannel() {
		channel = preChannel;
	}

}
	


public class Exercise7_11 {
	public static void main(String[] args) {
		MyTv2 t = new MyTv2();
		
		t.setChannel(10);
		System.out.println("CH: "+t.getChannel());
		t.setVolume(20);
		
		t.setVolume(-10);
		System.out.println("VOL: "+t.getVolume());
		t.setIsPowerOn();
		System.out.println("---------------");
		System.out.println("POWER: "+t.getIsPowerOn());

		t.setChannel(10);
		t.setVolume(20);
		System.out.println("channel+,volume+");
		System.out.println("-------------");
		System.out.println("CH: "+t.getChannel());
		System.out.println("VOL: "+t.getVolume());
		t.setIsPowerOn();
		System.out.println("POWER: "+t.getIsPowerOn());
		
		t.setChannel(10);
		t.setVolume(20);
		System.out.println("-------------");
		System.out.println("CH: "+t.getChannel());
		System.out.println("VOL: "+t.getVolume());
		t.gotoPrevChannel();
		System.out.println("PREV_CH: "+t.getChannel());
	}
}
