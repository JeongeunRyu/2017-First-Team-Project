
/**
 * ���α׷��� : �ٸ���ġ ���� ��ü(���� ��ü���� ���� ��)
 * ������ : ������,������,������,���ؿ�
 * 9�� 21�� : �ϳ��� Ŭ���� ���ϵ�� ���� ��ü���� ����
 * 10�� 5�� :�Է� Ŭ���� ���ϰ� ���� Ŭ�������� �ٸ���ġ�� ��ü�� ����Ʈ�� ������ �����ϰ� Ŭ���� ���Ϸ� ���� ����
 */

package Damagochi_Mainframe;

import Damagochi_Input.Damagochi_Input;
import Gesture.Switch;

public class Damagochi_Mainframe {
	public static void main(String[] args) {
		Damagochi_Input Damagochi_Input = new Damagochi_Input();
		Switch Dama_Switch = new Switch();
		System.out.println("�������������������������������������������������������������������������� ");
		System.out.println("�� �ȳ��ϼ��� �ٸ���ġ ���忡 ���Ű��� ȯ���մϴ�  ��");
		System.out.println("��������������������������������������������������������������������������");
		Damagochi_Input.Damagochi_input();
		Dama_Switch.Switch();
	}
}