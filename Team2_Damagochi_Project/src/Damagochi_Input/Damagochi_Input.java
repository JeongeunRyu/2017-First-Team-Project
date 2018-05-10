/**
 * 프로그램명 : 다마고치 입력 정보 설정
 * 개발자 : 신현빈,류정은,이정훈,정해원
 * 9월 20일 : 중첩 if-else문을 이용하여 잘못 설정한 경우 처음으로 돌아가도록 함.
 * 9월 25일 if문과  String변수를 사용하여 기존의 키보드로 '남자' '여자'를 직접 입력 받던 것을 숫자로 입력하여 설정가능토록 만듦.
 * 10월 11일 : if문과 else문으로 썻던 복잡성을 do-while문을 활용하여 명령문을 간략화
 * 10월 15일 : 사용자가 재설정을 한다는 것을 알려주기 위해서 if문을 사용하여 알림 메시지 추가.
 * 사용자가 재설정을 요구하면 if문으로 재설정 메시지를 출력함.
 */

package Damagochi_Input;

import java.util.Scanner;

public class Damagochi_Input {
   String name;             // 다마고치의 이름 지정
   int age;                // 다마고치 나이 지정
   int info_select;          // 다마고치 정보 재설정 여부
   int gender_select;          // 다마고치 성별 설정
   String gender;             // 다마고치 성별 숫자로 입력받아 문자로 출력
   Scanner input = new Scanner(System.in); // 다마고치 정보 입력 요소(이름,나이,성별)

   public void Damagochi_input() {
      do {
         if (info_select == 2) {
            System.out.println("다마고치 재설정에 들어갑니다.");
         }
         System.out.println("");
         System.out.println("다마고치의 이름을 입력해 주십시오.");
         name = input.next();
         System.out.println("다마고치의 성별을 입력해 주십시오.");
         System.out.println("1.남자 2.여자");
         gender_select = input.nextInt();
         if (gender_select == 1) {
            gender = "남자";
         } else if (gender_select == 2) {
            gender = "여자";
         }

         System.out.println("다마고치의 나이를 입력해 주십시오.");
         age = input.nextInt();
         System.out.println("입력하신 정보는 아래와 같습니까? (1.Yes)(2.No)");
         System.out.println("이름 : " + name);
         System.out.println("성별 : " + gender);
         System.out.println("나이 : " + age + "살");
         info_select = input.nextInt();
         if (info_select == 1) {
            System.out.println("다마고치의 기본 설정이 완료 되었습니다.");
            System.out.println("이름 : " + name);
            System.out.println("성별 : " + gender);
            System.out.println("나이 : " + age + "살");
            break;
         }
      } while (info_select == 2);
   }
}
