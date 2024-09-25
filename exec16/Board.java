package exec16;

//Board 클래스: 게시물의 제목, 내용, 작성자를 저장하는 클래스
public class Board {
 // Board 클래스의 멤버 변수: 제목(subject), 내용(content), 작성자(writer)
 private String subject;
 private String content;
 private String writer;
 
 // 생성자: Board 객체를 생성할 때 제목, 내용, 작성자를 초기화
 public Board(String subject, String content, String writer) {
     this.subject = subject;
     this.content = content;
     this.writer = writer;
 }
 
 // Getter와 Setter 메서드
 public String getSubject() { return subject; }
 public void setSubject(String subject) { this.subject = subject; }
 public String getContent() { return content; }
 public void setContent(String content) { this.content = content; }
 public String getWriter() { return writer; }
 public void setWriter(String writer) { this.writer = writer; }
}
