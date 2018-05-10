
/**
 * 프로그램명 : 다마고치 메인 몸체(여러 객체들을 모은 것)
 * 개발자 : 신현빈,류정은,이정훈,정해원
 * 9월 21일 : 하나의 클래스 파일들로 여러 객체들을 생성
 * 10월 5일 :입력 클래스 파일과 동작 클래스파일 다마고치의 몸체를 임폴트로 제각각 구분하고 클래스 파일로 각각 생성
 */

package Damagochi_Mainframe;

import Damagochi_Input.Damagochi_Input;
import Gesture.Switch;

public class Damagochi_Mainframe {
	public static void main(String[] args) {
		Damagochi_Input Damagochi_Input = new Damagochi_Input();
		Switch Dama_Switch = new Switch();
		System.out.println("┌───────────────────────────────────┐ ");
		System.out.println("│ 안녕하세요 다마고치 월드에 오신것을 환영합니다  │");
		System.out.println("└───────────────────────────────────┘");
		Damagochi_Input.Damagochi_input();
		Dama_Switch.Switch();
	}
}