package findYourLove;

import java.util.Scanner;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    int i;
    int habbit;
    int p1;
    int p2;
    String[] pla = { "������" ,"�x���Ӱ�" ,"�Ϯ��]" ,"�q�ʳ�" ,"���~DIY�u�t" ,"�t�۷|" ,"���N�]" ,"�g�@��" ,"�ȹC"};
    File chat = new File("chat.txt");
    FileReader fr = new FileReader(chat);
    FileWriter fw = new FileWriter(chat, true);
    BufferedReader br = new BufferedReader(fr);
    int choose;
    String temp;
    int[] a = { 1, 3, 4, 6 };
    int[] b = { 1, 3, 4, 6 };
    int[] c = { 1, 4, 6, 9 };
    int[] d = { 3, 4, 6, 8 };
    int[] hobby = { 0, 0, 0, 0 };

    people client = new people(0, 0, 0, 0, 0, 0, 0, 0, 0, hobby);
    people hung = new people(19, 1, 2, 1, 1, 4, 1, 3, 2, a);
    people ling = new people(20, 1, 2, 1, 3, 10, 1, 2, 2, b);
    people xiao = new people(20, 1, 2, 1, 3, 10, 1, 2, 3, c);
    people yu = new people(19, 1, 2, 1, 2, 10, 1, 2, 3, d);
    people[] database = { hung, ling, xiao, yu };

    System.out.println("�ʧO 1�k 2�k\n ");
    client.sexType = scanner.nextInt();
    System.out.println("���w���ʧO 1�k 2�k\n ");
    client.preferSex = scanner.nextInt();
    System.out.println("����:1 �B�� 2 �}�� 3 �\Ū 4 �q�� 5 �i�� 6 ���� 7 ø�e 8 �g�@ 9 �ȹC(�̦h��J4��)\n ");
    hobby[0] = scanner.nextInt();
    hobby[1] = scanner.nextInt();
    hobby[2] = scanner.nextInt();
    hobby[3] = scanner.nextInt();
    System.out.println("�~��\n ");
    client.salary = scanner.nextInt();
    System.out.println("�~�~ :1 0-22000 2 22000-50000 3 50000-100000 4 100000UP\n ");
    client.age = scanner.nextInt();
    System.out.println("�嫬 :1A 2B 3O 4AB \n ");
    client.bloodType = scanner.nextInt();
    System.out.println("�P�y:1�զϮy 2�����y 3���l�y 4���ɮy 5��l�y 6�B�k�y 7�ѯ��y 8���Ȯy 9�g��y 10�]�~�y 11���~�y 12�����y\n ");
    client.sign = scanner.nextInt();
    System.out.println("¾�~:1 �ǥ� 2 �x���� 3 �W�Z�� 4 �K�j 5 �a�x�D�� 6 �ۥѷ~ \n ");
    client.job = scanner.nextInt();
    System.out.println("�ͨv:1�� 2�� 3�� 4�� 5�s 6�D 7�� 8�� 9�U 10�� 11�� 12�� \n ");
    client.chineseSign = scanner.nextInt();
    System.out.println("�a�m:1�_  2��   3�n   4�F   5���q\n ");
    client.home = scanner.nextInt();

    i = client.findYourLove(client.checkScore(hung), client.checkScore(ling), client.checkScore(xiao),
        client.checkScore(yu));
    habbit = client.findHobby(client.hobby, database[i].hobby);
    client.writeToData(client);
//////-----------------------------------------------------------------------------
    while (true) {
      br = new BufferedReader(new FileReader(chat));
      while (br.ready()) {
        System.out.println(br.readLine());
      }
      br.close();
      System.out.println("��ܱ��ϥΪ����D:");
      Showtopic.show(habbit);
      Showtopic.cleartemp();
      System.out.println("(�ۦ��J�п�0,���}�п�9)");
      BufferedReader habr = new BufferedReader(habbits.Returnhar(habbit));
      choose = scanner.nextInt();
      if (choose > 0 && choose <= 3)
        Chat.chat(choose, habr);
      if (choose < 0.00001) {
        temp = scanner.next();
        Chat.chat_by_yourself(temp);
      }
      habr.close();
      if (choose == 9)
        break;
    }
    fw.write("");
    fw.close();
    fr.close();
    System.out.println("�������");
	System.out.println("���|�a�I:1.������ 2.�x���Ӱ� 3.�Ϯ��] 4.�q�ʳ� 5.���~DIY�u�t 6.�t�۷| 7.���N�] 8.�g�@�� 9.�ȹC");
	p1 = scanner.nextInt();
	place.chooseplace1(p1);
	p2 = scanner.nextInt();
	place.chooseplace2(p1, p2);
    scanner.close();
  }

}
