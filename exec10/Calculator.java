package exec10;
//매개변수 개수에 따른 오버로딩
public class Calculator {
	
	public int add(int a, int b) {
		return a+b;
	}
	
	public int add(int a,int b, int c) {
		return a+b+c;
	}
	
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
		int sum1 = calc.add(5, 10);
		int sum2 = calc.add(5, 10,15);
		
		System.out.println("sum1= "+sum1);
		//output: sum1= 15
		System.out.println("sum2= "+sum2);
		//output: sum2= 30
		
	}
}
