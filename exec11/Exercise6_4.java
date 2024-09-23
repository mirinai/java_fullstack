package exec11;


public class Exercise6_4 {
	
	public static void main(String[] args) {
		Student s = new Student();
		s.name = "asd";
		s.ban=1;
		s.no=100;
		s.kor=100;
		s.eng=60;
		s.math=76;
		
		System.out.println("name: "+s.name);
		System.out.println("total score: "+s.getTotal());

		System.out.printf("average: "+s.getAverage());
	
	
	}
}
