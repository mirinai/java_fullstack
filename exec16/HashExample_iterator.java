package exec16;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// HashExample_iterator 클래스: HashSet을 사용하여 Iterator를 통해 요소를 순차적으로 처리하는 예제
public class HashExample_iterator {
    public static void main(String[] args) {
        
        // HashSet 선언 및 생성
        Set<String> set = new HashSet<String>();  // 문자열을 저장하는 HashSet 생성
        
        // HashSet에 요소 추가
        set.add("java");    // "java" 추가
        set.add("JDBC");    // "JDBC" 추가
        set.add("JSP");     // "JSP" 추가
        set.add("Spring");  // "Spring" 추가
        
        // Iterator 생성: HashSet의 요소들을 순차적으로 접근하기 위한 Iterator 객체
        Iterator<String> iterator = set.iterator();
        
        // Iterator를 사용하여 요소 순회
        while(iterator.hasNext()) {  // HashSet에 다음 요소가 있으면 반복 실행
            String element = iterator.next();  // 다음 요소를 가져옴
            System.out.println(element);  // 요소 출력
            
            // 특정 조건에서 요소 제거 (예: "JSP"인 경우)
            if (element.equals("JSP")) {  
                iterator.remove();  // "JSP" 요소 제거
            }
        }
        
        System.out.println();  // 줄바꿈
        
        // HashSet에서 "JDBC" 요소 제거
        set.remove("JDBC");  // remove() 메서드를 사용해 "JDBC"를 삭제
        
        // 향상된 for문을 사용해 HashSet의 남은 요소 출력
        for (String element : set) {
            System.out.println(element);  // HashSet에 남은 요소 출력
        }
    }
}
