package exec16;

public class Member {
    // 멤버 변수 선언: 이름(name)과 나이(age)
    public String name;
    public int age;

    // 생성자: Member 객체를 생성할 때 이름과 나이를 초기화
    Member(String name, int age) {
        this.name = name;  // 입력받은 이름을 멤버 변수에 저장
        this.age = age;    // 입력받은 나이를 멤버 변수에 저장
    }

    // hashCode() 메서드 재정의: Member 객체의 해시 코드를 반환
    @Override
    public int hashCode() {
        // 이름의 해시 코드와 나이를 더한 값을 반환
        // name.hashCode(): 문자열 name의 해시 코드
        // age: 나이 값을 더해서 고유한 해시 코드를 생성
        return name.hashCode() + age;
    }

    // equals() 메서드 재정의: 두 객체가 같은지 비교하는 메서드
    @Override
    public boolean equals(Object obj) {
        // 입력된 객체가 Member 타입인지 확인하고, Member 타입일 경우 비교 진행
        if (obj instanceof Member target) {
            // 이름과 나이가 모두 같으면 true 반환, 그렇지 않으면 false 반환
            return target.name.equals(name) && (target.age == age);
        }
        else {
            // 입력된 객체가 Member 타입이 아닌 경우 false 반환
            return false;
        }
    }
}
