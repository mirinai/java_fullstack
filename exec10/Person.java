package exec10;

public class Person {
    private String name;
    private int age;
    private String address;

    // 기본 생성자
    public Person() {
        this("Unknown", 0, "Not Provided");
        System.out.println("기본 생성자 호출");
    }

    // 이름과 나이를 받는 생성자
    public Person(String name, int age) {
        this(name, age, "Not Provided");
        System.out.println("이름과 나이를 받는 생성자 호출");
    }

    // 모든 필드를 초기화하는 생성자
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
        System.out.println("모든 필드를 초기화하는 생성자 호출");
    }

    public void displayInfo() {
        System.out.println("이름: " + name + ", 나이: " + age + ", 주소: " + address);
    }

    public static void main(String[] args) {
        // 기본 생성자 호출
        Person person1 = new Person();
        person1.displayInfo();

        System.out.println();

        // 이름과 나이를 받는 생성자 호출
        Person person2 = new Person("홍길동", 25);
        person2.displayInfo();

        System.out.println();

        // 모든 필드를 초기화하는 생성자 호출
        Person person3 = new Person("김철수", 30, "서울");
        person3.displayInfo();
    }
}