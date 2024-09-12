package exec7;

public class ArrayPrintEven {
	public static void main(String[] args) {
		int[] numArr = new int[10];
		
		for (int i =0;i<10;i++) {
			numArr[i] = (int)(Math.random()*10)+1; //1~10에 이르는 정수들을 어레이에 넣기
			if (i%2 == 0 || numArr[i]%2 == 0) { // 인덱스 또는 값이 짝수면 출력하기
				System.out.print("numArr["+i+"]: "+numArr[i]);
				if(i < 9) {
					System.out.print(", ");					
				}
				
			}
			
		}
		System.out.println();
		
		
	}
}
