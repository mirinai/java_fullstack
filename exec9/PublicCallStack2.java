package exec9;

public class PublicCallStack2 {
	public static void main(String[] args) {
		System.out.println("main(String[] args) is started");
		firstMethod();
		System.out.println("main(String[] args) is ended");
	}
	static void firstMethod(){
		System.out.println("firstMethod() is started");
		secondMethod();
		System.out.println("firstMethod() is ended");
	}
	static void secondMethod(){
		System.out.println("secondMethod() is started");
		System.out.println("secondMethod() is ended");
	}
}
