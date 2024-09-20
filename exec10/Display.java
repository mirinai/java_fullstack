package exec10;
//매개변수 순서에 따른 오버로딩
public class Display {
	public void show(int number, String text) {
		System.out.println("번호"+number+", "+"텍스트: "+text);
	}
	
	public void show(String text, int number) {
		System.out.println("텍스트: "+text+", "+"번호"+number);
	}
	public static void main(String[] args) {
		Display display = new Display();
		
		display.show(42, "answer");
		
		display.show("age", 30);
	}
}
