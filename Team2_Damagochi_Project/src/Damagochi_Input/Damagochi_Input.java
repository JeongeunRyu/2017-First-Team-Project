/**
 * ���α׷��� : �ٸ���ġ �Է� ���� ����
 * ������ : ������,������,������,���ؿ�
 * 9�� 20�� : ��ø if-else���� �̿��Ͽ� �߸� ������ ��� ó������ ���ư����� ��.
 * 9�� 25�� if����  String������ ����Ͽ� ������ Ű����� '����' '����'�� ���� �Է� �޴� ���� ���ڷ� �Է��Ͽ� ����������� ����.
 * 10�� 11�� : if���� else������ ���� ���⼺�� do-while���� Ȱ���Ͽ� ��ɹ��� ����ȭ
 * 10�� 15�� : ����ڰ� �缳���� �Ѵٴ� ���� �˷��ֱ� ���ؼ� if���� ����Ͽ� �˸� �޽��� �߰�.
 * ����ڰ� �缳���� �䱸�ϸ� if������ �缳�� �޽����� �����.
 */

package Damagochi_Input;

import java.util.Scanner;

public class Damagochi_Input {
   String name;             // �ٸ���ġ�� �̸� ����
   int age;                // �ٸ���ġ ���� ����
   int info_select;          // �ٸ���ġ ���� �缳�� ����
   int gender_select;          // �ٸ���ġ ���� ����
   String gender;             // �ٸ���ġ ���� ���ڷ� �Է¹޾� ���ڷ� ���
   Scanner input = new Scanner(System.in); // �ٸ���ġ ���� �Է� ���(�̸�,����,����)

   public void Damagochi_input() {
      do {
         if (info_select == 2) {
            System.out.println("�ٸ���ġ �缳���� ���ϴ�.");
         }
         System.out.println("");
         System.out.println("�ٸ���ġ�� �̸��� �Է��� �ֽʽÿ�.");
         name = input.next();
         System.out.println("�ٸ���ġ�� ������ �Է��� �ֽʽÿ�.");
         System.out.println("1.���� 2.����");
         gender_select = input.nextInt();
         if (gender_select == 1) {
            gender = "����";
         } else if (gender_select == 2) {
            gender = "����";
         }

         System.out.println("�ٸ���ġ�� ���̸� �Է��� �ֽʽÿ�.");
         age = input.nextInt();
         System.out.println("�Է��Ͻ� ������ �Ʒ��� �����ϱ�? (1.Yes)(2.No)");
         System.out.println("�̸� : " + name);
         System.out.println("���� : " + gender);
         System.out.println("���� : " + age + "��");
         info_select = input.nextInt();
         if (info_select == 1) {
            System.out.println("�ٸ���ġ�� �⺻ ������ �Ϸ� �Ǿ����ϴ�.");
            System.out.println("�̸� : " + name);
            System.out.println("���� : " + gender);
            System.out.println("���� : " + age + "��");
            break;
         }
      } while (info_select == 2);
   }
}
