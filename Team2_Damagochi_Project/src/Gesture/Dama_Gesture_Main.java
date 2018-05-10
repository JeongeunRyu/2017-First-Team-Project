package Gesture;

import java.util.Scanner;
import java.util.Random;

public class Dama_Gesture_Main {
   Random rd = new Random();
   Scanner sc = new Scanner(System.in);
   int charm = 20;          // 매력
   int friendly = 20;        // 친밀도
   int power = 20;         // 힘
   int inter = 20;        // 지능
   int full = 20;         // 포만감
   
   int exercise;           // 운동 선택 스위치 변수
   
   int numselect;          // 숫자 맞추기 게임 스위치 변수
   boolean play = true;    // 참,거짓 변수
   int user;              // 가위바위보 게임 사용자 번호 선택부분
   int com;              // 가위바위보 게임 1~3번 중 랜덤선택 (다마고치)
   int guess;              // 숫자게임 숫자입력 부분
   int tries = 0;           // 시도횟수
   int number = rd.nextInt(19) + 1;  // 0~20까지 랜덤 수
   
   
   int question;           // 수학문제 스위치 선택 변수
   int answer;           // 문제에 대한 답 변수;
   int study;             //공부 스위치 변수
   
   int wash;              // 씻기 스위치 변수

   public void PrintData() {
      System.out.println("전체 : " + (charm + friendly + power + inter + full));
      System.out.println("힘 : " + power + " ,  매력 : " + charm + " ,  지능 : " + inter + " ,  포만감 : " + full
            + " ,  친밀도 : " + friendly);
   }

   /**
    * 프로그램명 : 다마고치 행동 객체(먹기)
    * 개발자 : 신현빈,류정은,이정훈,정해원
    * 9월 19일 : 다마고치 객체의 행동 중 먹기를 생성
    * 10월 9일 : 랜덤 변수를 사용하여 여러 가지의 음식들을 랜덤으로 먹는 기능 추가
    */
   public void Dama_eat() {
      System.out.println();
      System.out.println("   ■■■■■");
      System.out.println(" ■       ■");
      System.out.println("■  ●   ●  ■");
      System.out.println(" ■   O   ■");
      System.out.println("   ■■■■■");
      System.out.println();
      System.out.println("밥먹기를 선택했네요! 메뉴는 랜덤입니다.");
      int food = rd.nextInt(3) + 1;
      if (food == 1) {
         System.out.println("치킨을 먹습니다!");
         System.out.println("    ■■■■■■■");
         System.out.println("   ■       ■");
         System.out.println("   ■       ■");
         System.out.println("    ■     ■");
         System.out.println("     ■   ■");
         System.out.println("      ■■■");
         System.out.println("      ■■");
         System.out.println("      ■■");
         System.out.println("");
         power += 20;
         friendly += 10;
         full += 20;
         System.out.println("힘이 20, 친밀도 10, 포만감20 증가합니다.");
         System.out.println("");
         PrintData();
         System.out.println("");
      } else if (food == 2) {
         System.out.println("볶음밥을 먹습니다!");
         System.out.println("■■*#**%**#**#**■■");
         System.out.println("  ■■■■■■■■■■■■■");
         System.out.println("     ■■■■■■■");
         System.out.println("");
         power += 10;
         friendly += 5;
         full += 20;
         System.out.println("");
         System.out.println("힘이 10, 친밀도 5, 포만감20 증가합니다.");
         System.out.println("");
         PrintData();
         System.out.println("");
      } else if (food == 3) {
         System.out.println("피자를 먹습니다!");
         System.out.println("         ■");
         System.out.println("       ■  ■");
         System.out.println("     ■ #  ■");
         System.out.println("   ■ #   #■");
         System.out.println(" ■■■■■■■■■■");
         System.out.println("");
         power += 5;
         friendly += 5;
         full += 20;
         System.out.println("");
         System.out.println("힘이 5, 친밀도 5, 포만감20 증가합니다.");
         System.out.println("");
         PrintData();
         System.out.println("");
      } else if (food == 4) {
         System.out.println("빵을 먹습니다!");
         System.out.println("   ■■■  ■■■");
         System.out.println("  ■   ■■   ■");
         System.out.println("  ■        ■");
         System.out.println("  ■        ■");
         System.out.println("  ■■■■■■■■■■");
         System.out.println("");
         power += 5;
         friendly += 5;
         full += 5;
         System.out.println("");
         System.out.println("힘이 5, 친밀도 5, 포만감5 증가합니다.");
         System.out.println("");
         PrintData();
         System.out.println("");
      }

   }

   /**
    * 프로그램명 : 다마고치 행동 객체(운동)
    * 개발자 : 신현빈,류정은,이정훈,정해원
    * 9월 19일 : 다마고치 객체의 행동 중 운동을 생성
    * 9월 29일 : 다마고치의 운동 부분을 무산소 운동과 유산소 운동으로 나눔.
    */
   
   public void Dama_health() {
      System.out.println("   ■■■■■");
      System.out.println(" ■       ■");
      System.out.println("■  ●   ●  ■  _");
      System.out.println(" ■   -   ■\\/");
      System.out.println("   ■■■■■");
      System.out.println();
      System.out.println("어떤운동을 시키겠습니까?");
      System.out.println("┌─────────────┬─────────────┐");
      System.out.println("│ 1.유산소 운동    │ 2.무산소 운동    │");
      System.out.println("└─────────────┴─────────────┘");

      exercise = sc.nextInt();

      switch (exercise) {

      case 1:
         power += 10;
         friendly -= 5;
         full -= 10;
         System.out.println("");
         System.out.println("힘이 10증가하고, 친밀감이 5, 포만감이 10감소합니다.");
         System.out.println("");
         PrintData();
         System.out.println("");
         break;

      case 2:
         power += 5;
         friendly -= 5;
         full -= 10;
         System.out.println("");
         System.out.println("힘이 5증가하고, 친밀감이 5, 포만감이 10감소합니다.");
         System.out.println("");
         PrintData();
         System.out.println("");
         break;
      }

   }

   /**
    * 프로그램명 : 다마고치 행동 객체(놀이)
    * 개발자 : 신현빈,류정은,이정훈,정해원
    * 9월 19일 : 다마고치 객체의 행동 중 놀이를 생성
    * 10월 21일 : 다마고치의 놀이 부분에 랜덤변수를 사용하여 카드놀이와  숫자게임 추가.  
    */
   
   public void Dama_play() {
      System.out.println("   ■■■■■ ");
      System.out.println(" ■       ■");
      System.out.println("■　" + "☆      ^  ■");
      System.out.println(" ■   O   ■");
      System.out.println("   ■■■■■");
      System.out.println();
      System.out.println("어떤 놀이를 하시겠습니까?");
      System.out.println("┌─────────────┬─────────────┐");
      System.out.println("│ 1.가위바위보     │ 2.숫자맞추기     │");
      System.out.println("└─────────────┴─────────────┘");

      numselect = sc.nextInt();

      switch (numselect) {

      case 1:
         System.out.println("가위 바위 보 게임입니다.");

         while (play) {
            System.out.println("1.주먹 2.가위 3.보");
            System.out.println("입력 :");
            user = sc.nextInt();
            System.out.println();
            com = rd.nextInt(3);
            com += 1;

            if (user == 1) {
               if (com == 1) {
                  friendly += 5;
                  System.out.println("비겼습니다!");
                  System.out.println("상대방 : 주먹");
                  System.out.println("");
                  System.out.println("친근감이 5 상승합니다.");
                  System.out.println("");
                  PrintData();
                  System.out.println("");
                  break;
               } else if (com == 2) {
                  friendly += 10;
                  System.out.println("이겼습니다!");
                  System.out.println("상대방 : 가위");
                  System.out.println("");
                  System.out.println("친근감이 10 상승합니다.");
                  System.out.println("");
                  PrintData();
                  System.out.println("");
                  break;
               } else if (com == 3) {
                  friendly -= 3;
                  System.out.println("졌습니다 ㅜㅜ!");
                  System.out.println("상대방 : 보");
                  System.out.println("");
                  System.out.println("친근감이 3 하락합니다.");
                  System.out.println("");
                  PrintData();
                  System.out.println("");
                  break;
               }
            } else if (user == 2) {
               if (com == 1) {
                  friendly -= 3;
                  System.out.println("졌습니다ㅜㅜ!");
                  System.out.println("상대방 : 주먹");
                  System.out.println("");
                  System.out.println("친근감이 3 하락합니다.");
                  System.out.println("");
                  PrintData();
                  System.out.println("");
                  break;
               } else if (com == 2) {
                  friendly += 5;
                  System.out.println("비겼습니다!");
                  System.out.println("상대방 : 가위");
                  System.out.println("");
                  System.out.println("친근감이 5 상승합니다.");
                  System.out.println("");
                  PrintData();
                  System.out.println("");
                  break;
               } else if (com == 3) {
                  friendly += 10;
                  System.out.println("이겼습니다!");
                  System.out.println("상대방 : 보");
                  System.out.println("");
                  System.out.println("친근감이 10 상승합니다.");
                  System.out.println("");
                  PrintData();
                  System.out.println("");
                  break;
               }
            } else if (user == 3) {
               if (com == 1) {
                  friendly += 10;
                  System.out.println("이겼습니다!");
                  System.out.println("상대방 : 주먹");
                  System.out.println("");
                  System.out.println("친근감이 10 상승합니다.");
                  System.out.println("");
                  PrintData();
                  System.out.println("");
                  break;
               } else if (com == 2) {
                  friendly -= 3;
                  System.out.println("졌습니다 ㅜㅜ!");
                  System.out.println("상대방 : 가위");
                  System.out.println("");
                  System.out.println("친근감이 3 하락합니다.");
                  System.out.println("");
                  PrintData();
                  System.out.println("");
                  break;
               } else if (com == 3) {
                  friendly += 5;
                  System.out.println("비겼습니다!");
                  System.out.println("상대방 : 보");
                  System.out.println("");
                  System.out.println("친근감이 5 상승합니다.");
                  System.out.println("");
                  PrintData();
                  System.out.println("");
                  break;
               }
            } else
               System.out.println("잘못 입력했어요.");

         }
         break;
      case 2:
         do {
            System.out.print("0~20 중 숫자를 맞추는 게임입니다.");
            System.out.print("정답을  추측하여 보세요 : ");
            System.out.println();
            guess = sc.nextInt();
            tries++;

            if (guess > number) {
               System.out.println("정답보다 높은 수 입니다!");
               System.out.println();
            }
            if (guess < number) {
               System.out.println("정답보다 낮은 수 입니다!");
               System.out.println();
            }

         } while (guess != number);
         System.out.println("축하합니다! 정답이에요! 시도횟수는" + tries + "번이에요.");
         if (tries < 5) {
            charm += 5;
            friendly += 5;
            full -= 5;
            System.out.println(tries + "회 만에 정답을 맞춰서 , 매력이 5, 친밀감이5 상승했고 포만감이 5하락했어요!");
            PrintData();
         } else {
            charm -= 5;
            friendly -= 5;
            full -= 5;
            System.out.println("정답을 맞추는데" + tries + "회 이상 시도되어, 매력이 5, 친밀감5, 포만감이 5하락했어요ㅜㅜ!");
            PrintData();
         }
      }
   }

   /**
    * 프로그램명 : 다마고치 행동 객체(공부하기)
    * 설명 : 다마고치가 어떤 공부를 하는지에 대해 나타낸 것
    * 개발자 : 신현빈,류정은,이정훈,정해원
    * 9월 19일 : 다마고치 객체의 행동 중 공부을 생성
    * 10월 11일 : 다마고치의 공부 세분화 (프로그래밍 공부,일본어 공부,수학 공부)
    */
   
   public void Study() {
      System.out.println("   ■■■■■");
      System.out.println(" ■       ■");
      System.out.println("■  $   $  ■");
      System.out.println(" ■   -   ■");
      System.out.println("   ■■■■■");
      System.out.println();
      System.out.println("어떤공부를 시키겠습니까?");
      System.out.println("┌─────────────┬─────────┬───────┐");
      System.out.println("│ 1.프로그래밍     │ 2.일본어   │ 3.수학  │");
      System.out.println("└─────────────┴─────────┴───────┘");

      study = sc.nextInt();

      switch (study) {

      case 1:
         System.out.println("프로그래밍 공부를 시작하겠습니다.");
         int programing_quest = rd.nextInt(4) + 1;

         if (programing_quest == 1) {
            System.out.println("현재 배우고 있는 프로그래밍 언어는 무엇입니까?");
            System.out.println("1.Java 2.C 3.C++ 4.Python");
            int pqu1 = sc.nextInt();
            if (pqu1 == 1) {
               inter += 10;
               friendly -= 5;
               full -= 5;
               System.out.println("정답입니다!");
               System.out.println("지능이 10증가하고, 친밀감이 5, 포만감이 5감소합니다.");
               System.out.println("");
               PrintData();
               System.out.println("");
            } else if (pqu1 == 1 || pqu1 == 3 || pqu1 == 4) {
               System.out.println("틀렸습니다 ㅜㅜ!");
               System.out.println("");
               inter -= 5;
               friendly -= 5;
               full -= 5;
               System.out.println("지능이 5, 친밀감이 5, 포만감이 5감소합니다.");
               PrintData();
               System.out.println("");
            }
            break;
         }

         if (programing_quest == 2) {
            System.out.println("다음 중 반복문에 해당하지 않는것은?");
            System.out.println("1.for문　2.while문　3.do-while문 4.switch문");
            int pqu2 = sc.nextInt();
            if (pqu2 == 4) {
               inter += 10;
               friendly -= 5;
               full -= 5;
               System.out.println("정답입니다!");
               System.out.println("지능이 10증가하고, 친밀감이 5, 포만감이 5감소합니다.");
               System.out.println("");
               PrintData();
               System.out.println("");
            } else if (pqu2 == 1 || pqu2 == 2 || pqu2 == 3) {
               System.out.println("틀렸습니다 ㅜㅜ!");
               System.out.println("");
               inter -= 5;
               friendly -= 5;
               full -= 5;
               System.out.println("지능이 5, 친밀감이 5, 포만감이 5감소합니다.");
               PrintData();
               System.out.println("");
            }
            break;
         }
         if (programing_quest == 3) {
            System.out.println("다음 연산자 중 우선순위가 가장 낮은 것은?");
            System.out.println("1.&&　   2.||  3.%  4.!=");
            int pqu3 = sc.nextInt();
            if (pqu3 == 2) {
               inter += 10;
               friendly -= 5;
               full -= 5;
               System.out.println("정답입니다!");
               System.out.println("지능이 10증가하고, 친밀감이 5, 포만감이 5감소합니다.");
               System.out.println("");
               PrintData();
               System.out.println("");
            } else if (pqu3 == 1 || pqu3 == 3 || pqu3 == 4) {
               System.out.println("틀렸습니다 ㅜㅜ!");
               System.out.println("");
               inter -= 5;
               friendly -= 5;
               full -= 5;
               System.out.println("지능이 5, 친밀감이 5, 포만감이 5감소합니다.");
               PrintData();
               System.out.println("");
            }
            break;

         }
         if (programing_quest == 4) {
            System.out.println("40억 이상의 정수를 표현하고자할 때 어떤 정수형을 써야하는가?");
            System.out.println("1.byte　   2.short  3.long  4.int");
            int pqu4 = sc.nextInt();
            if (pqu4 == 3) {
               inter += 10;
               friendly -= 5;
               full -= 5;
               System.out.println("정답입니다!");
               System.out.println("지능이 10증가하고, 친밀감이 5, 포만감이 5감소합니다.");
               System.out.println("");
               PrintData();
               System.out.println("");
            } else if (pqu4 == 1 || pqu4 == 2 || pqu4 == 4) {
               System.out.println("틀렸습니다 ㅜㅜ!");
               System.out.println("");
               inter -= 5;
               friendly -= 5;
               full -= 5;
               System.out.println("지능이 5, 친밀감이 5, 포만감이 5감소합니다.");
               PrintData();
               System.out.println("");
            }
            break;

         }

      case 2:
         System.out.println("");
         System.out.println("일본어 공부를 하겠습니다!");
         System.out.println("");
         int quest = rd.nextInt(4) + 1;

         if (quest == 1) {
            System.out.println("この時計は私（？）です。");
            System.out.print("1. は　2.　の　3.と");
            int q1 = sc.nextInt();
            if (q1 == 2) {
               inter += 10;
               friendly -= 5;
               full -= 5;
               System.out.println("정답입니다!");
               System.out.println("지능이 10증가하고, 친밀감이 5, 포만감이 5감소합니다.");
               System.out.println("");
               PrintData();
               System.out.println("");
            } else if (q1 == 3 || q1 == 1) {
               System.out.println("틀렸습니다 ㅜㅜ!");
               System.out.println("");
               inter -= 5;
               friendly -= 5;
               full -= 5;
               System.out.println("지능이 5, 친밀감이 5, 포만감이 5감소합니다.");
               PrintData();
               System.out.println("");
            }
            break;
         }

         if (quest == 2) {
            System.out.println("오전에 하는 인삿말은 무엇인가요??");
            System.out.print("1. こんにちは　2.　こんばんは　3.おはようございます");
            int q2 = sc.nextInt();
            if (q2 == 3) {
               inter += 10;
               friendly -= 5;
               full -= 5;
               System.out.println("지능이 10증가하고, 친밀감이 5, 포만감이 5감소합니다.");
               System.out.println("");
               PrintData();
               System.out.println("");
            } else if (q2 == 1 || q2 == 2) {
               System.out.println("틀렸습니다 ㅜㅜ!");
               System.out.println("");
               inter -= 5;
               friendly -= 5;
               full -= 5;
               System.out.println("지능이 5, 친밀감이 5, 포만감이 5감소합니다.");
               PrintData();
               System.out.println("");
            }
            break;
         }
         if (quest == 3) {
            System.out.println("한자와 후리가나가 알맞게 짝지어진 것은 무엇인가요?");
            System.out.print("1. 友達（ともたち）　2.　木曜日（どようび）　3.電話（でんわ）");
            int q3 = sc.nextInt();
            if (q3 == 3) {
               inter += 10;
               friendly -= 5;
               full -= 5;
               System.out.println("지능이 10증가하고, 친밀감이 5, 포만감이 5감소합니다.");
               System.out.println("");
               PrintData();
               System.out.println("");
            } else if (q3 == 1 || q3 == 2) {
               System.out.println("틀렸습니다 ㅜㅜ!");
               System.out.println("");
               inter -= 5;
               friendly -= 5;
               full -= 5;
               System.out.println("지능이 5, 친밀감이 5, 포만감이 5감소합니다.");
               PrintData();
               System.out.println("");
            }
            break;

         }
      case 3:
         System.out.println("문제를 선택해주세요.");
         System.out.println("1.덧셈문제 2.뺄셈문제 3.곱셈문제");
         question = sc.nextInt();

         switch (question) {

         case 1:
            int num1 = 1 + (int) (Math.random() * 100); // 1~100까지 중에서 랜덤으로 수 지정
            int num2 = 1 + (int) (Math.random() * 100);
            int sum = num1 + num2; // 랜덤으로 지정한 수 num1과 num2를 더한 값 sum
            System.out.println(+num1 + "+" + num2 + "은 ?"); // 문제
            answer = sc.nextInt(); // 답 입력
            if (answer == sum) {
               inter += 10;
               friendly -= 5;
               full -= 5;
               System.out.println("");
               System.out.println("지능이 10증가하고, 친밀감이 5, 포만감이 5감소합니다.");
               System.out.println("");
               PrintData();
               System.out.println("");
               break;

            } else {
               System.out.println("오답입니다.");
               friendly -= 5;
               full -= 5;
               System.out.println("");
               System.out.println("지능이 0증가하고, 친밀감이 5, 포만감이 5감소합니다.");
               System.out.println("");
               PrintData();
               System.out.println("");
               break;
            }
         case 2:
            int num3 = 1 + (int) (Math.random() * 100); // 1~100까지 중에서 랜덤으로 수 지정
            int num4 = 1 + (int) (Math.random() * 100);
            int sub = num3 - num4;
            System.out.println(+num3 + "-" + num4 + "은 ?"); // 문제
            answer = sc.nextInt(); // 답 입력
            if (answer == sub) {
               inter += 10;
               friendly -= 5;
               full -= 5;
               System.out.println("");
               System.out.println("지능이 10증가하고, 친밀감이 5, 포만감이 5감소합니다.");
               System.out.println("");
               PrintData();
               System.out.println("");
               break;

            } 
            else {
               System.out.println("오답입니다.");
               friendly -= 5;
               full -= 5;
               System.out.println("");
               System.out.println("지능이 0증가하고, 친밀감이 5, 포만감이 5감소합니다.");
               System.out.println("");
               PrintData();
               System.out.println("");
               break;
            }

         case 3:
            int num5 = 1 + (int) (Math.random() * 20); // 1~100까지 중에서 랜덤으로 수 지정
            int num6 = 1 + (int) (Math.random() * 20);
            int multi = num5 * num6;
            System.out.println(+num5 + "X" + num6 + "은 ?"); // 문제
            answer = sc.nextInt(); // 답 입력
            if (answer == multi) {
               inter += 15;
               friendly -= 5;
               full -= 5;
               System.out.println("");
               System.out.println("지능이 15증가하고, 친밀감이 5, 포만감이 5감소합니다.");
               System.out.println("");
               PrintData();
               System.out.println("");
               break;

            } 
            else {
               System.out.println("오답입니다.");
               friendly -= 5;
               full -= 5;
               System.out.println("");
               System.out.println("지능이 0증가하고, 친밀감이 5, 포만감이 5감소합니다.");
               System.out.println("");
               PrintData();
               System.out.println("");
               break;

            }

         }
      }

   }
   
   /**
    * 프로그램명 : 다마고치 행동 객체(씻기)
    * 개발자 : 신현빈,류정은,이정훈,정해원
    * 9월 19일 : 다마고치 객체의 행동 중 씻기를 생성
    * 10월 21일 : 다마고치의 씻기 행동 부분을 세수하기와 샤워하기로 세분화 작업
    */
   
   public void wash() {
      System.out.print("   ■■■ ");
      System.out.println("♨♨");
      System.out.println(" ■       ■");
      System.out.println("■  ^   ^  ■");
      System.out.println(" ■   O   ■");
      System.out.println("   ■■■■■");
      System.out.println();
      System.out.println("┌─────────────┬─────────────┐");
      System.out.println("│ 1. 세수하기      │ 2. 샤워하기      │");
      System.out.println("└─────────────┴─────────────┘");
      System.out.println("입력 :");

      wash = sc.nextInt();

      switch (wash) {

      case 1:
         charm += 5;
         friendly -= 5;
         full -= 5;
         System.out.println("");
         System.out.println("매력이5 증가하고 친근감이 5, 포만감이 5 하락합니다.");
         System.out.println("");
         System.out.println("세수만 했습니다. 몸에서 냄새나네요.");
         System.out.println("");
         PrintData();
         break;

      case 2:
         charm += 10;
         friendly -= 10;
         full -= 10;
         System.out.println("");
         System.out.println("매력이 10 증가하고, 친근감이 10, 포만감이 10 하락합니다.");
         System.out.println("");
         System.out.println("샤워를 해서 깔끔해졌습니다.");
         System.out.println("");
         PrintData();
         break;

      }
   }

   public void last() {
      /* power charm in */
      if (power > charm && power > inter) {
         System.out.println("힘이 센 다마고치는 운동 선수가 되었습니다.");
         System.out.println("   ■■■■■");
         System.out.println(" ■       ■");
         System.out.println("■  *   *  ■\\  /");
         System.out.println(" ■   O   ■ \\/");
         System.out.println("   ■■■■■");
         System.out.println();
         System.out.println("게임이 종료되었습니다.");
      }
      if (inter > charm && inter > power) {

         System.out.println("똑똑한 다마고치는 프로그래머가 되었습니다.");
         System.out.println("   ■■■■■");
         System.out.println(" ■       ■");
         System.out.println("■  $   $  ■");
         System.out.println(" ■   O   ■");
         System.out.println("   ■■■■■");
         System.out.println();
         System.out.println("게임이 종료되었습니다.");
      }
      if (charm > power && charm > inter) {

         System.out.println("매력이 많은 다마고치는 연예인이 되었습니다!");

         System.out.println("    ★★★");
         System.out.println("   ■■■■■");
         System.out.println(" ■       ■");
         System.out.println("■  ●   ●  ■");
         System.out.println(" ■   O   ■");
         System.out.println("   ■■■■■");
         System.out.println();

         System.out.println("게임이 종료되었습니다.");

      }
   }
}