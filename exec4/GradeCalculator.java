package exec4;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {

        // 사용자 입력을 위한 Scanner 객체 생성
        Scanner sc = new Scanner(System.in);

        int score = 0;  // 점수를 저장하는 변수
        String grd = null;  // 학점을 저장하는 변수

        // 유효한 점수(0~100)가 입력될 때까지 반복
        do {
            System.out.print("점수 입력: ");
            score = sc.nextInt();  // 사용자로부터 점수를 입력 받음

            // 입력된 점수가 0~100 범위를 벗어나면 경고 메시지를 출력
            if (score > 100 || score < 0) {
                System.out.println("잘못 입력함");
            }
            else {
                break;  // 유효한 점수라면 반복문을 종료
            }
        } while (true);  // 계속해서 점수를 입력받음

        // 점수의 첫 번째 자리 (10의 자리)와 나머지 (1의 자리)를 계산
        int sc1 = score / 10;  // 점수를 10으로 나눈 몫 (10의 자리)
        int sc2 = score % 10;  // 점수를 10으로 나눈 나머지 (1의 자리)

        // 점수에 따라 학점을 결정하는 switch문
        switch (sc1) {
        case 9:
        case 10: 
            grd = "A";  // 90점 이상은 A
            break;
        case 8:
            grd = "B";  // 80~89점은 B
            break;
        case 7:
            grd = "C";  // 70~79점은 C
            break;
        default:
            grd = "F";  // 70점 미만은 F
            break;
        }

        // 1의 자리가 7 이상이고, 학점이 F가 아닌 경우 "+"를 추가
        if (sc2 > 7 && sc1 >= 7) {
            grd = grd + "+";  // A, B, C 학점에 "+" 추가
        }

        // 최종 학점을 출력
        System.out.println("grade: " + grd);
    } // MAIN
}

