package exec11;

public class Student {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;

	public Student() {

	}

	public Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public int getTotal() {
		return kor + eng + math;
	}

	public float getAverage() {

		// 전체 점수 합계를 3으로 나누고, 소수점 2번째 자리에서 반올림
		return Math.round(getTotal() / 3.0 * 10) / 10.0f;
	}

	public String info() {
		return name + ", " + ban + ", " + no + ", " + kor + ", " + eng + ", " + math + ", " + getTotal() + ", "
				+ getAverage();
	}
}
/*
 * getTotal() / 3.0은 전체 점수를 3으로 나눈 후 소수점 계산이 가능하게 실수형으로 나눕니다.
 * Math.round(getTotal() / 3.0 * 10)은 소수점 첫째 자리가 아닌 둘째 자리에서 반올림을 하도록 만들어 줍니다. 예를
 * 들어, 78.66667이 나오면 786.6667을 반올림해서 787로 만들고, 다시 10으로 나누어 78.7이 반환됩니다.
 */
