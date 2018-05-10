package Gesture;

import java.util.Scanner;
import java.util.Random;

public class Dama_Gesture_Main {
   Random rd = new Random();
   Scanner sc = new Scanner(System.in);
   int charm = 20;          // �ŷ�
   int friendly = 20;        // ģ�е�
   int power = 20;         // ��
   int inter = 20;        // ����
   int full = 20;         // ������
   
   int exercise;           // � ���� ����ġ ����
   
   int numselect;          // ���� ���߱� ���� ����ġ ����
   boolean play = true;    // ��,���� ����
   int user;              // ���������� ���� ����� ��ȣ ���úκ�
   int com;              // ���������� ���� 1~3�� �� �������� (�ٸ���ġ)
   int guess;              // ���ڰ��� �����Է� �κ�
   int tries = 0;           // �õ�Ƚ��
   int number = rd.nextInt(19) + 1;  // 0~20���� ���� ��
   
   
   int question;           // ���й��� ����ġ ���� ����
   int answer;           // ������ ���� �� ����;
   int study;             //���� ����ġ ����
   
   int wash;              // �ı� ����ġ ����

   public void PrintData() {
      System.out.println("��ü : " + (charm + friendly + power + inter + full));
      System.out.println("�� : " + power + " ,  �ŷ� : " + charm + " ,  ���� : " + inter + " ,  ������ : " + full
            + " ,  ģ�е� : " + friendly);
   }

   /**
    * ���α׷��� : �ٸ���ġ �ൿ ��ü(�Ա�)
    * ������ : ������,������,������,���ؿ�
    * 9�� 19�� : �ٸ���ġ ��ü�� �ൿ �� �Ա⸦ ����
    * 10�� 9�� : ���� ������ ����Ͽ� ���� ������ ���ĵ��� �������� �Դ� ��� �߰�
    */
   public void Dama_eat() {
      System.out.println();
      System.out.println("   ������");
      System.out.println(" ��       ��");
      System.out.println("��  ��   ��  ��");
      System.out.println(" ��   O   ��");
      System.out.println("   ������");
      System.out.println();
      System.out.println("��Ա⸦ �����߳׿�! �޴��� �����Դϴ�.");
      int food = rd.nextInt(3) + 1;
      if (food == 1) {
         System.out.println("ġŲ�� �Խ��ϴ�!");
         System.out.println("    ��������");
         System.out.println("   ��       ��");
         System.out.println("   ��       ��");
         System.out.println("    ��     ��");
         System.out.println("     ��   ��");
         System.out.println("      ����");
         System.out.println("      ���");
         System.out.println("      ���");
         System.out.println("");
         power += 20;
         friendly += 10;
         full += 20;
         System.out.println("���� 20, ģ�е� 10, ������20 �����մϴ�.");
         System.out.println("");
         PrintData();
         System.out.println("");
      } else if (food == 2) {
         System.out.println("�������� �Խ��ϴ�!");
         System.out.println("���*#**%**#**#**���");
         System.out.println("  ��������������");
         System.out.println("     ��������");
         System.out.println("");
         power += 10;
         friendly += 5;
         full += 20;
         System.out.println("");
         System.out.println("���� 10, ģ�е� 5, ������20 �����մϴ�.");
         System.out.println("");
         PrintData();
         System.out.println("");
      } else if (food == 3) {
         System.out.println("���ڸ� �Խ��ϴ�!");
         System.out.println("         ��");
         System.out.println("       ��  ��");
         System.out.println("     �� #  ��");
         System.out.println("   �� #   #��");
         System.out.println(" �����������");
         System.out.println("");
         power += 5;
         friendly += 5;
         full += 20;
         System.out.println("");
         System.out.println("���� 5, ģ�е� 5, ������20 �����մϴ�.");
         System.out.println("");
         PrintData();
         System.out.println("");
      } else if (food == 4) {
         System.out.println("���� �Խ��ϴ�!");
         System.out.println("   ����  ����");
         System.out.println("  ��   ���   ��");
         System.out.println("  ��        ��");
         System.out.println("  ��        ��");
         System.out.println("  �����������");
         System.out.println("");
         power += 5;
         friendly += 5;
         full += 5;
         System.out.println("");
         System.out.println("���� 5, ģ�е� 5, ������5 �����մϴ�.");
         System.out.println("");
         PrintData();
         System.out.println("");
      }

   }

   /**
    * ���α׷��� : �ٸ���ġ �ൿ ��ü(�)
    * ������ : ������,������,������,���ؿ�
    * 9�� 19�� : �ٸ���ġ ��ü�� �ൿ �� ��� ����
    * 9�� 29�� : �ٸ���ġ�� � �κ��� ����� ��� ����� ����� ����.
    */
   
   public void Dama_health() {
      System.out.println("   ������");
      System.out.println(" ��       ��");
      System.out.println("��  ��   ��  ��  _");
      System.out.println(" ��   -   ��\\/");
      System.out.println("   ������");
      System.out.println();
      System.out.println("���� ��Ű�ڽ��ϱ�?");
      System.out.println("����������������������������������������������������������");
      System.out.println("�� 1.����� �    �� 2.����� �    ��");
      System.out.println("����������������������������������������������������������");

      exercise = sc.nextInt();

      switch (exercise) {

      case 1:
         power += 10;
         friendly -= 5;
         full -= 10;
         System.out.println("");
         System.out.println("���� 10�����ϰ�, ģ�а��� 5, �������� 10�����մϴ�.");
         System.out.println("");
         PrintData();
         System.out.println("");
         break;

      case 2:
         power += 5;
         friendly -= 5;
         full -= 10;
         System.out.println("");
         System.out.println("���� 5�����ϰ�, ģ�а��� 5, �������� 10�����մϴ�.");
         System.out.println("");
         PrintData();
         System.out.println("");
         break;
      }

   }

   /**
    * ���α׷��� : �ٸ���ġ �ൿ ��ü(����)
    * ������ : ������,������,������,���ؿ�
    * 9�� 19�� : �ٸ���ġ ��ü�� �ൿ �� ���̸� ����
    * 10�� 21�� : �ٸ���ġ�� ���� �κп� ���������� ����Ͽ� ī����̿�  ���ڰ��� �߰�.  
    */
   
   public void Dama_play() {
      System.out.println("   ������ ");
      System.out.println(" ��       ��");
      System.out.println("�ᡡ" + "��      ^  ��");
      System.out.println(" ��   O   ��");
      System.out.println("   ������");
      System.out.println();
      System.out.println("� ���̸� �Ͻðڽ��ϱ�?");
      System.out.println("����������������������������������������������������������");
      System.out.println("�� 1.����������     �� 2.���ڸ��߱�     ��");
      System.out.println("����������������������������������������������������������");

      numselect = sc.nextInt();

      switch (numselect) {

      case 1:
         System.out.println("���� ���� �� �����Դϴ�.");

         while (play) {
            System.out.println("1.�ָ� 2.���� 3.��");
            System.out.println("�Է� :");
            user = sc.nextInt();
            System.out.println();
            com = rd.nextInt(3);
            com += 1;

            if (user == 1) {
               if (com == 1) {
                  friendly += 5;
                  System.out.println("�����ϴ�!");
                  System.out.println("���� : �ָ�");
                  System.out.println("");
                  System.out.println("ģ�ٰ��� 5 ����մϴ�.");
                  System.out.println("");
                  PrintData();
                  System.out.println("");
                  break;
               } else if (com == 2) {
                  friendly += 10;
                  System.out.println("�̰���ϴ�!");
                  System.out.println("���� : ����");
                  System.out.println("");
                  System.out.println("ģ�ٰ��� 10 ����մϴ�.");
                  System.out.println("");
                  PrintData();
                  System.out.println("");
                  break;
               } else if (com == 3) {
                  friendly -= 3;
                  System.out.println("�����ϴ� �̤�!");
                  System.out.println("���� : ��");
                  System.out.println("");
                  System.out.println("ģ�ٰ��� 3 �϶��մϴ�.");
                  System.out.println("");
                  PrintData();
                  System.out.println("");
                  break;
               }
            } else if (user == 2) {
               if (com == 1) {
                  friendly -= 3;
                  System.out.println("�����ϴ٤̤�!");
                  System.out.println("���� : �ָ�");
                  System.out.println("");
                  System.out.println("ģ�ٰ��� 3 �϶��մϴ�.");
                  System.out.println("");
                  PrintData();
                  System.out.println("");
                  break;
               } else if (com == 2) {
                  friendly += 5;
                  System.out.println("�����ϴ�!");
                  System.out.println("���� : ����");
                  System.out.println("");
                  System.out.println("ģ�ٰ��� 5 ����մϴ�.");
                  System.out.println("");
                  PrintData();
                  System.out.println("");
                  break;
               } else if (com == 3) {
                  friendly += 10;
                  System.out.println("�̰���ϴ�!");
                  System.out.println("���� : ��");
                  System.out.println("");
                  System.out.println("ģ�ٰ��� 10 ����մϴ�.");
                  System.out.println("");
                  PrintData();
                  System.out.println("");
                  break;
               }
            } else if (user == 3) {
               if (com == 1) {
                  friendly += 10;
                  System.out.println("�̰���ϴ�!");
                  System.out.println("���� : �ָ�");
                  System.out.println("");
                  System.out.println("ģ�ٰ��� 10 ����մϴ�.");
                  System.out.println("");
                  PrintData();
                  System.out.println("");
                  break;
               } else if (com == 2) {
                  friendly -= 3;
                  System.out.println("�����ϴ� �̤�!");
                  System.out.println("���� : ����");
                  System.out.println("");
                  System.out.println("ģ�ٰ��� 3 �϶��մϴ�.");
                  System.out.println("");
                  PrintData();
                  System.out.println("");
                  break;
               } else if (com == 3) {
                  friendly += 5;
                  System.out.println("�����ϴ�!");
                  System.out.println("���� : ��");
                  System.out.println("");
                  System.out.println("ģ�ٰ��� 5 ����մϴ�.");
                  System.out.println("");
                  PrintData();
                  System.out.println("");
                  break;
               }
            } else
               System.out.println("�߸� �Է��߾��.");

         }
         break;
      case 2:
         do {
            System.out.print("0~20 �� ���ڸ� ���ߴ� �����Դϴ�.");
            System.out.print("������  �����Ͽ� ������ : ");
            System.out.println();
            guess = sc.nextInt();
            tries++;

            if (guess > number) {
               System.out.println("���亸�� ���� �� �Դϴ�!");
               System.out.println();
            }
            if (guess < number) {
               System.out.println("���亸�� ���� �� �Դϴ�!");
               System.out.println();
            }

         } while (guess != number);
         System.out.println("�����մϴ�! �����̿���! �õ�Ƚ����" + tries + "���̿���.");
         if (tries < 5) {
            charm += 5;
            friendly += 5;
            full -= 5;
            System.out.println(tries + "ȸ ���� ������ ���缭 , �ŷ��� 5, ģ�а���5 ����߰� �������� 5�϶��߾��!");
            PrintData();
         } else {
            charm -= 5;
            friendly -= 5;
            full -= 5;
            System.out.println("������ ���ߴµ�" + tries + "ȸ �̻� �õ��Ǿ�, �ŷ��� 5, ģ�а�5, �������� 5�϶��߾��̤�!");
            PrintData();
         }
      }
   }

   /**
    * ���α׷��� : �ٸ���ġ �ൿ ��ü(�����ϱ�)
    * ���� : �ٸ���ġ�� � ���θ� �ϴ����� ���� ��Ÿ�� ��
    * ������ : ������,������,������,���ؿ�
    * 9�� 19�� : �ٸ���ġ ��ü�� �ൿ �� ������ ����
    * 10�� 11�� : �ٸ���ġ�� ���� ����ȭ (���α׷��� ����,�Ϻ��� ����,���� ����)
    */
   
   public void Study() {
      System.out.println("   ������");
      System.out.println(" ��       ��");
      System.out.println("��  $   $  ��");
      System.out.println(" ��   -   ��");
      System.out.println("   ������");
      System.out.println();
      System.out.println("����θ� ��Ű�ڽ��ϱ�?");
      System.out.println("������������������������������������������������������������������");
      System.out.println("�� 1.���α׷���     �� 2.�Ϻ���   �� 3.����  ��");
      System.out.println("������������������������������������������������������������������");

      study = sc.nextInt();

      switch (study) {

      case 1:
         System.out.println("���α׷��� ���θ� �����ϰڽ��ϴ�.");
         int programing_quest = rd.nextInt(4) + 1;

         if (programing_quest == 1) {
            System.out.println("���� ���� �ִ� ���α׷��� ���� �����Դϱ�?");
            System.out.println("1.Java 2.C 3.C++ 4.Python");
            int pqu1 = sc.nextInt();
            if (pqu1 == 1) {
               inter += 10;
               friendly -= 5;
               full -= 5;
               System.out.println("�����Դϴ�!");
               System.out.println("������ 10�����ϰ�, ģ�а��� 5, �������� 5�����մϴ�.");
               System.out.println("");
               PrintData();
               System.out.println("");
            } else if (pqu1 == 1 || pqu1 == 3 || pqu1 == 4) {
               System.out.println("Ʋ�Ƚ��ϴ� �̤�!");
               System.out.println("");
               inter -= 5;
               friendly -= 5;
               full -= 5;
               System.out.println("������ 5, ģ�а��� 5, �������� 5�����մϴ�.");
               PrintData();
               System.out.println("");
            }
            break;
         }

         if (programing_quest == 2) {
            System.out.println("���� �� �ݺ����� �ش����� �ʴ°���?");
            System.out.println("1.for����2.while����3.do-while�� 4.switch��");
            int pqu2 = sc.nextInt();
            if (pqu2 == 4) {
               inter += 10;
               friendly -= 5;
               full -= 5;
               System.out.println("�����Դϴ�!");
               System.out.println("������ 10�����ϰ�, ģ�а��� 5, �������� 5�����մϴ�.");
               System.out.println("");
               PrintData();
               System.out.println("");
            } else if (pqu2 == 1 || pqu2 == 2 || pqu2 == 3) {
               System.out.println("Ʋ�Ƚ��ϴ� �̤�!");
               System.out.println("");
               inter -= 5;
               friendly -= 5;
               full -= 5;
               System.out.println("������ 5, ģ�а��� 5, �������� 5�����մϴ�.");
               PrintData();
               System.out.println("");
            }
            break;
         }
         if (programing_quest == 3) {
            System.out.println("���� ������ �� �켱������ ���� ���� ����?");
            System.out.println("1.&&��   2.||  3.%  4.!=");
            int pqu3 = sc.nextInt();
            if (pqu3 == 2) {
               inter += 10;
               friendly -= 5;
               full -= 5;
               System.out.println("�����Դϴ�!");
               System.out.println("������ 10�����ϰ�, ģ�а��� 5, �������� 5�����մϴ�.");
               System.out.println("");
               PrintData();
               System.out.println("");
            } else if (pqu3 == 1 || pqu3 == 3 || pqu3 == 4) {
               System.out.println("Ʋ�Ƚ��ϴ� �̤�!");
               System.out.println("");
               inter -= 5;
               friendly -= 5;
               full -= 5;
               System.out.println("������ 5, ģ�а��� 5, �������� 5�����մϴ�.");
               PrintData();
               System.out.println("");
            }
            break;

         }
         if (programing_quest == 4) {
            System.out.println("40�� �̻��� ������ ǥ���ϰ����� �� � �������� ����ϴ°�?");
            System.out.println("1.byte��   2.short  3.long  4.int");
            int pqu4 = sc.nextInt();
            if (pqu4 == 3) {
               inter += 10;
               friendly -= 5;
               full -= 5;
               System.out.println("�����Դϴ�!");
               System.out.println("������ 10�����ϰ�, ģ�а��� 5, �������� 5�����մϴ�.");
               System.out.println("");
               PrintData();
               System.out.println("");
            } else if (pqu4 == 1 || pqu4 == 2 || pqu4 == 4) {
               System.out.println("Ʋ�Ƚ��ϴ� �̤�!");
               System.out.println("");
               inter -= 5;
               friendly -= 5;
               full -= 5;
               System.out.println("������ 5, ģ�а��� 5, �������� 5�����մϴ�.");
               PrintData();
               System.out.println("");
            }
            break;

         }

      case 2:
         System.out.println("");
         System.out.println("�Ϻ��� ���θ� �ϰڽ��ϴ�!");
         System.out.println("");
         int quest = rd.nextInt(4) + 1;

         if (quest == 1) {
            System.out.println("������ͪ���磨�����Ǫ���");
            System.out.print("1. �ϡ�2.���Ρ�3.��");
            int q1 = sc.nextInt();
            if (q1 == 2) {
               inter += 10;
               friendly -= 5;
               full -= 5;
               System.out.println("�����Դϴ�!");
               System.out.println("������ 10�����ϰ�, ģ�а��� 5, �������� 5�����մϴ�.");
               System.out.println("");
               PrintData();
               System.out.println("");
            } else if (q1 == 3 || q1 == 1) {
               System.out.println("Ʋ�Ƚ��ϴ� �̤�!");
               System.out.println("");
               inter -= 5;
               friendly -= 5;
               full -= 5;
               System.out.println("������ 5, ģ�а��� 5, �������� 5�����մϴ�.");
               PrintData();
               System.out.println("");
            }
            break;
         }

         if (quest == 2) {
            System.out.println("������ �ϴ� �λ��� �����ΰ���??");
            System.out.print("1. ����˪��ϡ�2.������Ъ�ϡ�3.���Ϫ誦�������ު�");
            int q2 = sc.nextInt();
            if (q2 == 3) {
               inter += 10;
               friendly -= 5;
               full -= 5;
               System.out.println("������ 10�����ϰ�, ģ�а��� 5, �������� 5�����մϴ�.");
               System.out.println("");
               PrintData();
               System.out.println("");
            } else if (q2 == 1 || q2 == 2) {
               System.out.println("Ʋ�Ƚ��ϴ� �̤�!");
               System.out.println("");
               inter -= 5;
               friendly -= 5;
               full -= 5;
               System.out.println("������ 5, ģ�а��� 5, �������� 5�����մϴ�.");
               PrintData();
               System.out.println("");
            }
            break;
         }
         if (quest == 3) {
            System.out.println("���ڿ� �ĸ������� �˸°� ¦������ ���� �����ΰ���?");
            System.out.print("1. ��ӹ���Ȫ⪿������2.���������ɪ誦�ӣ���3.������Ǫ�");
            int q3 = sc.nextInt();
            if (q3 == 3) {
               inter += 10;
               friendly -= 5;
               full -= 5;
               System.out.println("������ 10�����ϰ�, ģ�а��� 5, �������� 5�����մϴ�.");
               System.out.println("");
               PrintData();
               System.out.println("");
            } else if (q3 == 1 || q3 == 2) {
               System.out.println("Ʋ�Ƚ��ϴ� �̤�!");
               System.out.println("");
               inter -= 5;
               friendly -= 5;
               full -= 5;
               System.out.println("������ 5, ģ�а��� 5, �������� 5�����մϴ�.");
               PrintData();
               System.out.println("");
            }
            break;

         }
      case 3:
         System.out.println("������ �������ּ���.");
         System.out.println("1.�������� 2.�������� 3.��������");
         question = sc.nextInt();

         switch (question) {

         case 1:
            int num1 = 1 + (int) (Math.random() * 100); // 1~100���� �߿��� �������� �� ����
            int num2 = 1 + (int) (Math.random() * 100);
            int sum = num1 + num2; // �������� ������ �� num1�� num2�� ���� �� sum
            System.out.println(+num1 + "+" + num2 + "�� ?"); // ����
            answer = sc.nextInt(); // �� �Է�
            if (answer == sum) {
               inter += 10;
               friendly -= 5;
               full -= 5;
               System.out.println("");
               System.out.println("������ 10�����ϰ�, ģ�а��� 5, �������� 5�����մϴ�.");
               System.out.println("");
               PrintData();
               System.out.println("");
               break;

            } else {
               System.out.println("�����Դϴ�.");
               friendly -= 5;
               full -= 5;
               System.out.println("");
               System.out.println("������ 0�����ϰ�, ģ�а��� 5, �������� 5�����մϴ�.");
               System.out.println("");
               PrintData();
               System.out.println("");
               break;
            }
         case 2:
            int num3 = 1 + (int) (Math.random() * 100); // 1~100���� �߿��� �������� �� ����
            int num4 = 1 + (int) (Math.random() * 100);
            int sub = num3 - num4;
            System.out.println(+num3 + "-" + num4 + "�� ?"); // ����
            answer = sc.nextInt(); // �� �Է�
            if (answer == sub) {
               inter += 10;
               friendly -= 5;
               full -= 5;
               System.out.println("");
               System.out.println("������ 10�����ϰ�, ģ�а��� 5, �������� 5�����մϴ�.");
               System.out.println("");
               PrintData();
               System.out.println("");
               break;

            } 
            else {
               System.out.println("�����Դϴ�.");
               friendly -= 5;
               full -= 5;
               System.out.println("");
               System.out.println("������ 0�����ϰ�, ģ�а��� 5, �������� 5�����մϴ�.");
               System.out.println("");
               PrintData();
               System.out.println("");
               break;
            }

         case 3:
            int num5 = 1 + (int) (Math.random() * 20); // 1~100���� �߿��� �������� �� ����
            int num6 = 1 + (int) (Math.random() * 20);
            int multi = num5 * num6;
            System.out.println(+num5 + "X" + num6 + "�� ?"); // ����
            answer = sc.nextInt(); // �� �Է�
            if (answer == multi) {
               inter += 15;
               friendly -= 5;
               full -= 5;
               System.out.println("");
               System.out.println("������ 15�����ϰ�, ģ�а��� 5, �������� 5�����մϴ�.");
               System.out.println("");
               PrintData();
               System.out.println("");
               break;

            } 
            else {
               System.out.println("�����Դϴ�.");
               friendly -= 5;
               full -= 5;
               System.out.println("");
               System.out.println("������ 0�����ϰ�, ģ�а��� 5, �������� 5�����մϴ�.");
               System.out.println("");
               PrintData();
               System.out.println("");
               break;

            }

         }
      }

   }
   
   /**
    * ���α׷��� : �ٸ���ġ �ൿ ��ü(�ı�)
    * ������ : ������,������,������,���ؿ�
    * 9�� 19�� : �ٸ���ġ ��ü�� �ൿ �� �ı⸦ ����
    * 10�� 21�� : �ٸ���ġ�� �ı� �ൿ �κ��� �����ϱ�� �����ϱ�� ����ȭ �۾�
    */
   
   public void wash() {
      System.out.print("   ���� ");
      System.out.println("�͢�");
      System.out.println(" ��       ��");
      System.out.println("��  ^   ^  ��");
      System.out.println(" ��   O   ��");
      System.out.println("   ������");
      System.out.println();
      System.out.println("����������������������������������������������������������");
      System.out.println("�� 1. �����ϱ�      �� 2. �����ϱ�      ��");
      System.out.println("����������������������������������������������������������");
      System.out.println("�Է� :");

      wash = sc.nextInt();

      switch (wash) {

      case 1:
         charm += 5;
         friendly -= 5;
         full -= 5;
         System.out.println("");
         System.out.println("�ŷ���5 �����ϰ� ģ�ٰ��� 5, �������� 5 �϶��մϴ�.");
         System.out.println("");
         System.out.println("������ �߽��ϴ�. ������ �������׿�.");
         System.out.println("");
         PrintData();
         break;

      case 2:
         charm += 10;
         friendly -= 10;
         full -= 10;
         System.out.println("");
         System.out.println("�ŷ��� 10 �����ϰ�, ģ�ٰ��� 10, �������� 10 �϶��մϴ�.");
         System.out.println("");
         System.out.println("������ �ؼ� ����������ϴ�.");
         System.out.println("");
         PrintData();
         break;

      }
   }

   public void last() {
      /* power charm in */
      if (power > charm && power > inter) {
         System.out.println("���� �� �ٸ���ġ�� � ������ �Ǿ����ϴ�.");
         System.out.println("   ������");
         System.out.println(" ��       ��");
         System.out.println("��  *   *  ��\\  /");
         System.out.println(" ��   O   �� \\/");
         System.out.println("   ������");
         System.out.println();
         System.out.println("������ ����Ǿ����ϴ�.");
      }
      if (inter > charm && inter > power) {

         System.out.println("�ȶ��� �ٸ���ġ�� ���α׷��Ӱ� �Ǿ����ϴ�.");
         System.out.println("   ������");
         System.out.println(" ��       ��");
         System.out.println("��  $   $  ��");
         System.out.println(" ��   O   ��");
         System.out.println("   ������");
         System.out.println();
         System.out.println("������ ����Ǿ����ϴ�.");
      }
      if (charm > power && charm > inter) {

         System.out.println("�ŷ��� ���� �ٸ���ġ�� �������� �Ǿ����ϴ�!");

         System.out.println("    �ڡڡ�");
         System.out.println("   ������");
         System.out.println(" ��       ��");
         System.out.println("��  ��   ��  ��");
         System.out.println(" ��   O   ��");
         System.out.println("   ������");
         System.out.println();

         System.out.println("������ ����Ǿ����ϴ�.");

      }
   }
}