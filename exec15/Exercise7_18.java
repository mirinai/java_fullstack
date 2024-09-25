package exec15;

public class Exercise7_18 {
    
  public static void action(Robot r) {
//	   if(r instanceof DanceRobot) {
//	      DanceRobot dr = (DanceRobot)r;
//	      dr.dance();
//	   } else if(r instanceof SingRobot) {
//	      SingRobot sr = (SingRobot)r;
//	      sr.sing();
//	   } else if(r instanceof DrawRobot) {
//	      DrawRobot dr = (DrawRobot)r;
//	      dr.draw();
//	   }
//	}
	
	
    // action 메서드: 로봇의 종류에 따라 다른 동작을 수행
//    static void action(Robot r) {
//        // 각각의 로봇 타입별로 인스턴스를 생성
////        DanceRobot dr = new DanceRobot();
////        SingRobot sr = new SingRobot();
////        DrawRobot drr = new DrawRobot();
//
////        // 전달된 로봇 r이 DanceRobot 타입이면 dance() 호출
////        if(r instanceof DanceRobot) {
////            dr.dance();
////        }
////        // 전달된 로봇 r이 SingRobot 타입이면 sing() 호출
////        else if(r instanceof SingRobot) {
////            sr.sing();
////        }
////        // 전달된 로봇 r이 DrawRobot 타입이면 draw() 호출
////        else if(r instanceof DrawRobot) {
////            drr.draw();
////        }
        // 전달된 로봇의 타입에 따라 적절한 메서드를 호출
        if (r instanceof DanceRobot) {
            ((DanceRobot) r).dance();
        } else if (r instanceof SingRobot) {
            ((SingRobot) r).sing();
        } else if (r instanceof DrawRobot) {
            ((DrawRobot) r).draw();
        }else {
        	System.out.println("no");
        }
    }

    // 메인 메서드: 프로그램의 시작점
    public static void main(String[] args) {
        // DanceRobot, SingRobot, DrawRobot 객체들을 배열에 저장
        Robot[] arr = {new DanceRobot(), new SingRobot(), new DrawRobot()};
        
        // 배열에 저장된 각 로봇에 대해 action 메서드를 호출
        for(int i = 0; i < arr.length; i++) {
            action(arr[i]); // 각 로봇에 대해 적절한 행동을 수행
        }
    }
}

// 기본 Robot 클래스
class Robot {
    // Robot의 생성자: 객체가 생성될 때 호출
    Robot() {
        System.out.println("Robot's constructor is acted");
    }
}

// DanceRobot 클래스: Robot을 상속받아 dance() 메서드를 구현
class DanceRobot extends Robot {
    // DanceRobot이 춤을 추는 메서드
    void dance() {
        System.out.println("dance");
    }
}

// SingRobot 클래스: Robot을 상속받아 sing() 메서드를 구현
class SingRobot extends Robot {
    // SingRobot이 노래하는 메서드
    void sing() {
        System.out.println("sing");
    }
}

// DrawRobot 클래스: Robot을 상속받아 draw() 메서드를 구현
class DrawRobot extends Robot {
    // DrawRobot이 그림을 그리는 메서드
    void draw() {
        System.out.println("draw");
    }
}
