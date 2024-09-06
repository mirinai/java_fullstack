package exec3;

import java.util.Scanner;

public class GradeCalculator1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String msg = new String();
		int temp = 0;
		
		System.out.print("점수 입력: ");

		int subj1 = sc.nextInt();
		
		System.out.print("점수 입력: ");

		int subj2 = sc.nextInt();
		
		System.out.print("연산기호 입력: ");
		String c = sc.next();
		
		if(c.equals("+")) {
			msg = subj1+" + "+subj2+" = "+(subj1+subj2);
		}
		else if(c.equals("-")) {
			if(subj1<subj2)
			{
				temp = subj2;
				subj2 = subj1;
				subj1 = temp;
			}
			msg = subj1+" - "+subj2+" = "+(subj1-subj2);
		}
		else if(c.equals("*")) {
			msg = subj1+" * "+subj2+" = "+(subj1*subj2);
		}
		else if(c.equals("/")) {
			msg = subj1+" / "+subj2+" = "+((double)subj1/subj2);
		}
		else if(c.equals("%")) {
			msg = subj1+" % "+subj2+" = "+((double)subj1%subj2);
		}
		else {
			System.out.println("연산기호 잘못 입력함");
		}
		System.out.println(msg);
		
	}
}
