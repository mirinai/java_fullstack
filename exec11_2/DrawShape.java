package exec11_2;

public class DrawShape {
    public static void main(String[] args) {
        // Point 객체 배열을 생성하고 좌표값을 지정함 (삼각형을 만들기 위한 3개의 점)
        Point[] p = { 
            new Point(100, 100), 
            new Point(140, 50), 
            new Point(200, 200), 
        };

        // Point 배열을 기반으로 Triangle 객체 생성
        Triangle t = new Triangle(p);

        // 원의 중심 좌표와 반지름을 지정하여 Circle 객체 생성
        Circle c = new Circle(new Point(150, 150), 50);

        // 삼각형을 그림
        t.draw();

        // 원을 그림
        c.draw();
    }
}

class Shape {
    String color = "black";  // 기본 색상 설정

    // 도형을 그릴 때 색상을 출력하는 메서드
    void draw() {
        System.out.printf("[color = %s]\n", color);
    }
}

class Point {
    int x;  // x 좌표
    int y;  // y 좌표

    // 좌표를 초기화하는 생성자
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // 기본 생성자: (0, 0) 좌표로 초기화
    Point() {
        this(0, 0);
    }

    // 좌표를 "(x, y)" 형식으로 반환하는 메서드
    String getXY() {
        return "(" + x + "," + y + ")";
    }
}

class Circle extends Shape {
    Point center;  // 원의 중심 좌표를 나타내는 Point 객체
    int r;  // 반지름

    // 기본 생성자: 중심 좌표를 (0, 0), 반지름을 100으로 설정
    Circle() {
        this(new Point(0, 0), 100);
    }

    // 중심 좌표와 반지름을 받아서 원을 초기화하는 생성자
    Circle(Point center, int r) {
        this.center = center;
        this.r = r;
    }

    // 원을 그리는 메서드: 중심 좌표와 반지름, 색상을 출력
    void draw() {
        System.out.printf("[center=(%d, %d), r = %d, color = %s]\n", center.x, center.y, r, color);
    }
}

class Triangle extends Shape {
    Point[] p = new Point[3];  // 삼각형의 3개의 점을 저장할 배열

    // 삼각형을 정의하는 3개의 점을 받아서 초기화하는 생성자
    Triangle(Point[] p) {
        this.p = p;
    }

    // 삼각형을 그리는 메서드: 세 점의 좌표와 색상을 출력
    void draw() {
        System.out.printf("[p1 = %s, p2 = %s, p3 = %s, color = %s]\n", 
                          p[0].getXY(), p[1].getXY(), p[2].getXY(), color);
    }
}
