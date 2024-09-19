package exec9;

public class FactorialTest {
	static int factorial(int n) {
		int result = 0;
		
		if (n==1) {
			result = 1;
		}
		else {
			
			if (n==2) {
				System.out.printf("2 x 1",n);
			}
			else {
				System.out.printf("%d x",n);
				System.out.print(" ");
			}

			result = n*factorial(n-1);
		}
		return result;
	}
	public static void main(String[] args) {
		int result = FactorialTest.factorial(8);
		System.out.println();
		System.out.println(result);
		
	}
}
