package Gesture;

/**
 * ���α׷��� : �ٸ���ġ ����ġ �κ�
 * ���� : �ٸ���ġ�� �ൿ ��ü���� �ϳ��� �̾� ����ġ���� Ȱ���Ͽ� �������� ���̱� ���� ���
 * ������ : ������,������,������,���ؿ�
 * 9�� 21�� : �ٸ���ġ�� �ൿ 30ȸ �������� �ൿ���� 30�� for���� �� �ൿ���� �ҷ����� switch���� ���.
 * 9�� 29�� : �ٸ���ġ�� �ൿ 30ȸ ���� > ���� ���� �ð� ���� ����
 * 10�� 11�� : ���� �� Ŭ���� ������ �ۼ��� �͵����Է� �κа� �ൿ �κ� ���� �κ� �� ������ ��Ű���� Ŭ�������Ϸ� ���� ���� 
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

      System.out.println("   ������");
      System.out.println(" ��       ��");
      System.out.println("��  ��   ��  ��");
      System.out.println(" ��   -   ��");
      System.out.println("   ������");
      System.out.println();
      System.out.println("���ݺ��� �ٸ���ġ Ű��⸦ �����մϴ�.");
      for (day = 1; day <= 30; day++) {
         System.out.println("");
         System.out.println(day + "���� ���� ��ҽ��ϴ� !!");
         System.out.println("");
         System.out.println("�ٸ���ġ���� ���ϴ� ����� �Է��� �ּ���.");
         for (gesture_number = 1; gesture_number < 3; gesture_number++) {
            System.out.println("�ൿ�� �Է��� �ּ���.");
            if (gesture_number == 1) {
               System.out.println("�����Դϴ�. �ٸ���ġ���� � �ൿ�� ��� �Ͻðڽ��ϱ�?");
               System.out.println("������������������������������������������������������������������������������������������");
               System.out.println("�� 1.�   �� 2.����   �� 3.����   �� 4.�ı�   �� 5.����̱�      ��");
               System.out.println("������������������������������������������������������������������������������������������");
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
               System.out.println("�����Դϴ�. �ٸ���ġ���� � �ൿ�� ��� �Ͻðڽ��ϱ�?");
               System.out.println("������������������������������������������������������������������������������������������");
               System.out.println("�� 1.�   �� 2.����   �� 3.����   �� 4.�ı�   �� 5.����̱�      ��");
               System.out.println("������������������������������������������������������������������������������������������");
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
         System.out.println("���� �Ǿ����ϴ�.");
         System.out.println("�ٸ���ġ�� ���� ��ϴ�.");
         System.out.println("   ������    Z");
         System.out.println(" ��       �� z");
         System.out.println("��  -   -  ��");
         System.out.println(" ��   -   ��");
         System.out.println("   ������");
         System.out.println();
      }
      Gesture.last();
   }
   
}