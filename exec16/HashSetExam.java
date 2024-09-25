package exec16;

import java.util.HashSet;
import java.util.Set;

// HashSetExam 클래스: HashSet을 활용하여 중복되지 않는 문자열 객체를 저장하고 관리하는 예제
public class HashSetExam {
    public static void main(String[] args) {
        
        // HashSet 선언 및 생성
        Set<String> set = new HashSet<String>(); // Set 인터페이스로 HashSet 객체 생성 (중복을 허용하지 않음)
        
        // HashSet에 요소 추가
        set.add("java");   // "java" 추가
        set.add("JDBC");   // "JDBC" 추가
        set.add("JSP");    // "JSP" 추가
        set.add("java");   // "java"는 중복이므로 저장되지 않음
        set.add("Spring"); // "Spring" 추가

        // HashSet의 크기(저장된 요소의 개수) 확인
        int size = set.size(); // HashSet에 저장된 고유한 객체들의 개수를 반환
        
        // 저장된 객체의 수 출력 (중복된 "java"는 한 번만 저장되었음)
        System.out.println("The number of the total objects: " + size); // 출력: 저장된 객체의 수
    }
}

