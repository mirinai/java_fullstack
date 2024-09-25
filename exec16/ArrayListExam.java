package exec16;

import java.util.ArrayList;
import java.util.List;

// ArrayListExam 클래스: ArrayList를 활용해 Board 객체들을 관리하는 메인 클래스
public class ArrayListExam {
	public static void main(String[] args) {
		// Board 객체들을 저장할 ArrayList 선언 및 생성
		List<Board> list = new ArrayList<>();

		// 리스트에 5개의 Board 객체 추가
		list.add(new Board("title1", "article1", "author1"));
		list.add(new Board("title2", "article2", "author2"));
		list.add(new Board("title3", "article3", "author3"));
		list.add(new Board("title4", "article4", "author4"));
		list.add(new Board("title5", "article5", "author5"));

		// 리스트의 크기(저장된 Board 객체의 개수) 출력
		int size = list.size();// total counts: 5
		System.out.println("total counts: " + size); // 총 저장된 객체 수 출력
		// title3 article3 author3
		System.out.println(); // 줄바꿈

		// 인덱스 2번에 해당하는 Board 객체를 가져와서 제목, 내용, 작성자 출력
		Board board = list.get(2);
		System.out.println(board.getSubject() + "\t" + board.getContent() + "\t" + board.getWriter());
		System.out.println(); // 줄바꿈

		// 모든 Board 객체들의 정보를 순차적으로 출력 (인덱스를 사용한 반복문)
		for (int i = 0; i < list.size(); i++) {
			Board b = list.get(i);
			System.out.println(b.getSubject() + "\t" + b.getContent() + "\t" + b.getWriter());
		}
		/*
		 * title1 article1 author1 title2 article2 author2 title3 article3 author3
		 * title4 article4 author4 title5 article5 author5
		 */
		System.out.println(); // 줄바꿈

		// 리스트에서 인덱스 2번과 3번에 해당하는 Board 객체 제거
		list.remove(2); // 인덱스 2번 객체 제거 (title3)
		list.remove(2); // 인덱스 2번에 있던 객체가 삭제된 후에, 다시 인덱스 2번에 있던 객체 제거 (title4)

		// 모든 Board 객체들의 정보를 순차적으로 출력 (향상된 for 루프 사용)
		for (Board b : list) {
			System.out.println(b.getSubject() + "\t" + b.getContent() + "\t" + b.getWriter());
		}
		/*
		 * title1 article1 author1 
		 * title2 article2 author2 
		 * title5 article5 author5
		 */
	}
}
