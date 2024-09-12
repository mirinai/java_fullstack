package do_it_algorithm_java_ch03_3;

import java.util.Arrays;
import java.util.Scanner;

public class StringBinarySearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 자바에서 사용하는 키워드
		String[] x = {
		    "abstract", "assert", "boolean", "break", "byte",
		    "case", "catch", "char", "class", "const",
		    "continue", "default", "do", "double", "else",
		    "enum", "extends", "final", "finally", "float",
		    "for", "goto", "if", "implements", "import",
		    "instanceof", "int", "interface", "long", "native",
		    "new", "package", "private", "protected", "public",
		    "return", "short", "static", "strictfp", "super",
		    "switch", "synchronized", "this", "throw", "throws",
		    "transient", "try", "void", "volatile", "while"
		};
		
		System.out.print("키워드 입력: ");
		String ky = sc.next();
		
		int idx = Arrays.binarySearch(x, ky);
		
		if(idx<0) {
			System.out.println("그런 키워드는 없음");
		}else {
			System.out.println("맞는 키워드는 x["+idx+"]: "+x[idx]);
		}
		
		sc.close();
	}
}
