package exec16;

import java.util.List;
import java.util.Vector;

// VectorExam 클래스: 멀티스레드 환경에서 Vector를 이용하여 Board 객체를 저장하는 예제
public class VectorExam {
    public static void main(String[] args) {
        // Vector를 사용하여 Board 객체들을 저장할 리스트 생성
        List<Board> list = new Vector<>();

        // Thread A 정의: "title", "article", "author" + i 로 구성된 Board 객체를 1000개 추가
        Thread threadA = new Thread() {
            @Override
            public void run() {
                for (int i = 1; i <= 1000; i++) {
                    list.add(new Board("title" + i, "article" + i, "author" + i)); // Board 객체 생성 및 리스트에 추가
                }
            }
        };

        // Thread B 정의: "title", "article", "author" + i 로 구성된 Board 객체를 1000개 추가
        Thread threadB = new Thread() {
            @Override
            public void run() {
                for (int i = 1; i <= 1000; i++) {
                    list.add(new Board("title" + i, "article" + i, "author" + i)); // Board 객체 생성 및 리스트에 추가
                }
            }
        };

        // 두 스레드 시작: threadA와 threadB에서 동시에 객체를 추가하도록 시작
        threadA.start();
        threadB.start();

        // 두 스레드가 모두 완료될 때까지 대기 (join 사용)
        try {
            threadA.join();  // threadA가 끝날 때까지 대기
            threadB.join();  // threadB가 끝날 때까지 대기
        } catch (Exception e) {
            e.printStackTrace();  // 예외 발생 시 출력
        }

        // 리스트의 크기 출력 (저장된 Board 객체의 개수)
        int size = list.size();
        System.out.println("The number of the total objects: " + size);
        System.out.println();
    }
}
