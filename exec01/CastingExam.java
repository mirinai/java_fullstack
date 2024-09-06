package exec01;

public class CastingExam {
	public static void main(String[] args) {
		int var1 = 10;
		byte var2 = (byte) var1;
		System.out.println(var2);
		// var1은 int 타입으로 10을 가지고 있습니다. 이를 byte로 강제 형변환(casting)하여 var2에 저장합니다.
		// 10은 byte 범위(-128 to 127) 내에 있으므로 문제없이 변환되며, 출력 결과는 10이 됩니다.

		long var3 = 300;
		int var4 = (int) var3;
		System.out.println(var4);
		// var3은 long 타입으로 300을 가지고 있습니다. 이를 int로 강제 형변환하여 var4에 저장합니다.
		// 300은 int 범위(-2^31 to 2^31-1) 내에 있으므로 문제없이 변환되며, 출력 결과는 300이 됩니다.

		int var5 = 65;
		char var6 = (char) var5;
		System.out.println(var6);
		// var5는 int 타입으로 65를 가지고 있습니다. 이를 char로 강제 형변환하여 var6에 저장합니다.
		// 65는 ASCII 코드에서 문자 'A'에 해당하므로, 출력 결과는 'A'가 됩니다.

		double var7 = 3.14;
		int var8 = (int) var7;
		System.out.println(var8);
		// var7은 double 타입으로 3.14를 가지고 있습니다. 이를 int로 강제 형변환하여 var8에 저장합니다.
		// 실수(double)를 정수(int)로 변환할 때 소수점 이하가 버려지므로, 출력 결과는 3이 됩니다.

		
	}
}
