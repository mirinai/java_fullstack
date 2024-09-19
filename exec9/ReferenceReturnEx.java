// 패키지 선언 (현재 파일이 exec9 패키지에 속함)
package exec9;

// Data 클래스 정의
class Data {
    int x; // 정수형 필드 x를 선언
}

// ReferenceReturnEx 클래스 정의
public class ReferenceReturnEx {
    
    // main 메서드: 프로그램의 실행 시작점
    public static void main(String[] args) {
        // Data 클래스의 새로운 인스턴스 d를 생성
        Data d = new Data();
        
        // d 객체의 x 필드에 값 10을 할당
        d.x = 10;
        
        // d 객체를 copy 메서드에 전달하여 d2 객체에 할당
        Data d2 = copy(d);
        
        // d 객체의 x 필드 값을 출력
        System.out.println("d.x = " + d.x);
        
        // d2 객체의 x 필드 값을 출력
        System.out.println("d2.x = " + d2.x);
    }
    
    /**
     * Data 객체를 복사하여 반환하는 메서드
     * 
     * @param d 원본 Data 객체
     * @return 복사된 Data 객체
     */
    static Data copy(Data d) {
        // 새로운 Data 객체 tmp를 생성
        Data tmp = new Data();
        
        // tmp 객체의 x 필드에 d 객체의 x 값을 할당
        tmp.x = d.x;
        
        // 원본 객체 d를 반환 (실제로는 tmp를 반환해야 함)
        return d;
    }
}

