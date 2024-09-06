package exec4;

import java.util.Scanner;

public class problem1_input_score {
    public static void main(String[] args) {
        // 사용자로부터 입력을 받기 위한 Scanner 객체 생성
        Scanner sc = new Scanner(System.in);

        // 사용자에게 점수를 입력받기
        System.out.print("점수 입력하기: ");
        String g = null;  // 학점을 저장할 변수
        int score = sc.nextInt();  // 사용자로부터 점수를 입력받음

        // 입력된 점수가 유효한지 확인
        if (score > 100 || score < 0) {
            System.out.println("잘못된 값을 입력함");  // 점수가 0~100 범위를 벗어났을 경우 오류 메시지 출력

        } else {
            // 점수에 따라 학점 결정
            if (score >= 90) {
                g = "A";  // 90점 이상은 A 학점
            } else if (score >= 80) {
                g = "B";  // 80~89점은 B 학점
            } else if (score >= 70) {
                g = "C";  // 70~79점은 C 학점
            } else {
                g = "F";  // 70점 미만은 F 학점
            }

            // 학점에 '+'를 추가할 조건 확인
            // 점수가 7 이상이거나 100점인 경우 "+"를 붙임
            if ((score % 10 >= 7 && score / 10 >= 7) || score == 100) {
                g += "+";  // 점수의 1의 자리가 7 이상일 때 "+" 추가 (A, B, C 학점에 적용)
            }

            // 최종 학점 출력
            System.out.println("학점 = " + g);
        }
    }
}

