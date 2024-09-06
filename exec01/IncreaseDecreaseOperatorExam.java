package exec01;

public class IncreaseDecreaseOperatorExam {
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;

		x++;
		++x;

		System.out.println("x= " + x);

		// x= 12
		// x++는 후위 증가 연산자로, x가 먼저 10에서 11로 증가합니다.
		// ++x는 전위 증가 연산자로, x가 11에서 12로 증가합니다.
		// 최종적으로 x는 12가 됩니다.

		System.out.println("---------------");

		y--;
		--y;

		System.out.println("y= " + y);

		// y= 8
		// y--는 후위 감소 연산자로, y가 먼저 10에서 9로 감소합니다.
		// --y는 전위 감소 연산자로, y가 9에서 8로 감소합니다.
		// 최종적으로 y는 8이 됩니다.

		System.out.println("---------------");

		z = x++;
		System.out.println("z=" + z);
		System.out.println("x=" + x);

		// z= 12
		// x++는 후위 증가 연산자로, 현재 x의 값 12가 z에 할당된 후, x는 13으로 증가합니다.
		// 따라서 z는 12, x는 13이 됩니다.

		System.out.println("---------------");

		z = ++x;
		System.out.println("z=" + z);
		System.out.println("x=" + x);

		// z= 14
		// ++x는 전위 증가 연산자로, x가 먼저 13에서 14로 증가한 후 z에 할당됩니다.
		// 따라서 z는 14, x도 14가 됩니다.

		System.out.println("---------------");

		z = ++x + y++;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		System.out.println("y=" + y);

		// z= 23
		// ++x는 x를 14에서 15로 증가시킵니다.
		// y++는 현재 y 값을 먼저 사용하고, 나중에 증가시킵니다. y는 8로 사용된 후 9로 증가합니다.
		// z = 15 (증가된 x) + 8 (현재 y 값) = 23
		// 최종적으로 z는 23, x는 15, y는 9가 됩니다.

	}

}
