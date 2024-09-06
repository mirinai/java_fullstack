package exec4;

public class ForExam {
	public static void main(String[] args) {
		for (int i = 1;i<11;i++) {
			System.out.print(i+"\t");
		}
		System.out.println();
		System.out.println("--------");
		
		for (int i = 1;i<=20;i++) {
			if(i%2 == 0) {
				System.out.printf("%d\t",i);
			}
		}
		System.out.println();
		System.out.println("--------");
		for (int i = 2;i<=20;i+=2) {
			System.out.printf("%d\t",i);
		}
	}
}
