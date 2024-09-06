package exec3;

import java.util.Scanner;

import java.util.Scanner;

public class GradeCalculator2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner 객체를 사용하여 사용자 입력을 받기 위한 준비

        System.out.println("학점계산기"); // 프로그램 제목 출력

        int grd = 0; // 점수를 저장할 변수 grd 선언
//      char c; // 사용하지 않은 변수 c (문자형 변수로 사용할 경우를 대비한 주석 처리)
        String c = null; // 학점을 저장할 문자열 변수 c 선언, 초기값은 null

        // 점수가 0에서 100 사이가 아니면 반복해서 입력받는 do-while 루프
        do {
            System.out.print("점수 입력(0~100)): "); // 사용자에게 점수를 입력하도록 안내
            grd = sc.nextInt(); // 사용자로부터 정수형 점수를 입력받음
            if (grd > 100 || grd < 0) // 입력한 점수가 0~100 범위를 벗어났을 경우
                System.out.println("잘못 입력함"); // 잘못된 입력 경고 메시지 출력
        } while (grd > 100 || grd < 0); // 점수가 0~100 사이가 아니면 반복하여 입력받음

        // 학점 계산: 점수가 90을 초과할 경우 A 학점 부여
        if (grd > 90) {
            c = "A"; // A 학점 부여
//      if (grd % 10 == 0) {
//          c = c + "+"; // 점수가 10의 배수일 경우 + 추가 (주석 처리)
        } 
        // 점수가 80을 초과할 경우 B 학점 부여
        else if (grd > 80) {
            c = "B"; // B 학점 부여
//      if (grd % 10 == 0) {
//          c += "+"; // 점수가 10의 배수일 경우 + 추가 (주석 처리)
        }
        // 점수가 70을 초과할 경우 C 학점 부여
        else if (grd > 70) {
            c = "C"; // C 학점 부여
//      if (grd % 10 == 0) {
//          c += "+"; // 점수가 10의 배수일 경우 + 추가 (주석 처리)
        }
        // 그 외의 경우 (점수가 70 이하일 경우) F 학점 부여
        else
            c = "F"; // F 학점 부여

        // 학점에 +를 추가하는 조건: 점수가 70 이상이고 10의 배수이거나 점수가 100인 경우
        if (((grd % 10 == 0) && grd > 70)) {
            c += "+"; // 10의 배수인 경우 학점에 + 추가
        }

        // 최종 결과 출력: 점수와 학점을 출력
        System.out.printf("Your score is %d and The grade is %s\n", grd, c);
    }
}

