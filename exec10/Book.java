package exec10;
//생성자 오버로딩
public class Book {
    private String title;
    private String author;
    private double price;

    // 기본 생성자
    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    // 제목과 저자를 받는 생성자
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.price = 0.0;
    }

    // 제목, 저자, 가격을 받는 생성자
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("제목: " + title + ", 저자: " + author + ", 가격: $" + price);
    }

    public static void main(String[] args) {
        Book defaultBook = new Book();
        Book bookWithoutPrice = new Book("1984", "George Orwell");
        Book completeBook = new Book("Clean Code", "Robert C. Martin", 29.99);

        defaultBook.displayInfo();       // 출력: 제목: Unknown, 저자: Unknown, 가격: $0.0
        bookWithoutPrice.displayInfo();  // 출력: 제목: 1984, 저자: George Orwell, 가격: $0.0
        completeBook.displayInfo();      // 출력: 제목: Clean Code, 저자: Robert C. Martin, 가격: $29.99
    }
}