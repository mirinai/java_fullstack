// 패키지 선언 (현재 파일이 exec9 패키지에 속함)
package exec9;

// ReturnTest 클래스 정의
public class ReturnTest {
    
    /**
     * 두 정수의 합을 반환하는 메서드
     * 
     * @param a 첫 번째 정수
     * @param b 두 번째 정수
     * @return a와 b의 합
     */
    int add(int a, int b) {
        return a + b; // a와 b를 더한 값을 반환
    }
    
    /**
     * 두 정수의 합을 배열을 통해 반환하는 메서드
     * 
     * @param a 첫 번째 정수
     * @param b 두 번째 정수
     * @param result 합을 저장할 배열
     */
    void add(int a, int b, int[] result) {
        result[0] = a + b; // a와 b를 더한 값을 result 배열의 첫 번째 요소에 저장
    }
    
    // main 메서드: 프로그램의 실행 시작점
    public static void main(String[] args) {
        // ReturnTest 클래스의 인스턴스 생성
        ReturnTest rt = new ReturnTest();
        
        // 첫 번째 add 메서드 호출: 두 정수의 합을 반환받아 변수에 저장
        int result = rt.add(3, 5);
        System.out.println(result); // 결과 출력: 8
        
        // 두 번째 add 메서드 호출을 위한 배열 생성 (초기값 0)
        int[] result2 = {0};
        
        // 두 번째 add 메서드 호출: 두 정수의 합을 배열을 통해 반환
        rt.add(3, 5, result2);
        System.out.println(result2[0]); // 결과 출력: 8
    }
}