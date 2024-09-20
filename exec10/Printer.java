package exec10;
//매개변수 타입에 따른 오버로딩
public class Printer {
	
	public void print(int number) {
		System.out.println("output integer: "+number);
	}
	public void print(double number) {
		System.out.println("output integer: "+number);
	}
	public void print(String text) {
		System.out.println("ouput string: "+text);
	}
	
	
	public static void main(String[] args) {
		Printer printer = new Printer();
		
		printer.print(100);
		printer.print(99.99);
		printer.print("hello java");
	}
}
