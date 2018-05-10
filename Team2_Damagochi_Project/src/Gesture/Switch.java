package Gesture;

/**
 * 프로그램명 : 다마고치 스위치 부분
 * 설명 : 다마고치의 행동 객체들을 하나로 이어 스위치문을 활용하여 가독성을 높이기 위해 사용
 * 개발자 : 신현빈,류정은,이정훈,정해원
 * 9월 21일 : 다마고치의 행동 30회 제한으로 행동제한 30의 for문과 각 행동들을 불러오는 switch문을 사용.
 * 9월 29일 : 다마고치의 행동 30회 제한 > 낮과 밤의 시간 개념 도입
 * 10월 11일 : 기존 한 클래스 파일을 작성한 것들을입력 부분과 행동 부분 메인 부분 세 가지를 패키지와 클래스파일로 각각 생성 
 */

import java.util.Scanner;

public class Switch {
      

   public void Switch() {
      
      int select;
      Scanner input = new Scanner(System.in);
      int Switch_select;
      int day;
      int gesture_number;
      Dama_Gesture_Main Gesture = new Dama_Gesture_Main();

      System.out.println("   ■■■■■");
      System.out.println(" ■       ■");
      System.out.println("■  ●   ●  ■");
      System.out.println(" ■   -   ■");
      System.out.println("   ■■■■■");
      System.out.println();
      System.out.println("지금부터 다마고치 키우기를 시작합니다.");
      for (day = 1; day <= 30; day++) {
         System.out.println("");
         System.out.println(day + "일차 날이 밝았습니다 !!");
         System.out.println("");
         System.out.println("다마고치에게 원하는 명령을 입력해 주세요.");
         for (gesture_number = 1; gesture_number < 3; gesture_number++) {
            System.out.println("행동을 입력해 주세요.");
            if (gesture_number == 1) {
               System.out.println("오전입니다. 다마고치에게 어떤 행동을 명령 하시겠습니까?");
               System.out.println("┌───────┬───────┬───────┬───────┬───────────┐");
               System.out.println("│ 1.운동   │ 2.공부   │ 3.놀이   │ 4.씻기   │ 5.밥먹이기      │");
               System.out.println("└───────┴───────┴───────┴───────┴───────────┘");
               Switch_select = input.nextInt();
               switch (Switch_select) {
               case 1:
                  Gesture.Dama_health();
                  break;
               case 2:
                  Gesture.Study();
                  break;
               case 3:
                  Gesture.Dama_play();
                  break;
               case 4:
                  Gesture.wash();
                  break;
               case 5:
                  Gesture.Dama_eat();
                  break;
               }
            } else if (gesture_number == 2) {
               System.out.println("오후입니다. 다마고치에게 어떤 행동을 명령 하시겠습니까?");
               System.out.println("┌───────┬───────┬───────┬───────┬───────────┐");
               System.out.println("│ 1.운동   │ 2.공부   │ 3.놀이   │ 4.씻기   │ 5.밥먹이기      │");
               System.out.println("└───────┴───────┴───────┴───────┴───────────┘");
               Switch_select = input.nextInt();
               switch (Switch_select) {
               case 1:
                  Gesture.Dama_health();
                  break;
               case 2:
                  Gesture.Study();
                  break;
               case 3:
                  Gesture.Dama_play();
                  break;
               case 4:
                  Gesture.wash();
                  break;
               case 5:
                  Gesture.Dama_eat();
                  break;
               }
            }
         }
         System.out.println("밤이 되었습니다.");
         System.out.println("다마고치가 잠을 잡니다.");
         System.out.println("   ■■■■■    Z");
         System.out.println(" ■       ■ z");
         System.out.println("■  -   -  ■");
         System.out.println(" ■   -   ■");
         System.out.println("   ■■■■■");
         System.out.println();
      }
      Gesture.last();
   }
   
}