package exec16;

import java.util.HashSet;
import java.util.Set;

// HashSetExample 클래스: HashSet을 활용하여 Member 객체를 관리하는 예제
public class HashSetExample {
    public static void main(String[] args) {
        // Member 객체를 저장할 HashSet 생성
        Set<Member> set = new HashSet<Member>();
        
        // HashSet에 두 개의 동일한 Member 객체를 추가 (이름과 나이가 동일)
        set.add(new Member("eva", 25));  // 첫 번째 "eva" 추가
        set.add(new Member("eva", 25));  // 두 번째 "eva" 추가 (중복된 값)

        // 저장된 객체의 총 개수 출력
        System.out.println("The number of the total objects: " + set.size());
    }
}