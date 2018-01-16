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
    String[] pla = { "健身房" ,"台中商圈" ,"圖書館" ,"電動場" ,"食品DIY工廠" ,"演唱會" ,"美術館" ,"寫作類" ,"旅遊"};
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

    System.out.println("性別 1男 2女\n ");
    client.sexType = scanner.nextInt();
    System.out.println("喜歡的性別 1男 2女\n ");
    client.preferSex = scanner.nextInt();
    System.out.println("興趣:1 運動 2 逛街 3 閱讀 4 電玩 5 烹飪 6 音樂 7 繪畫 8 寫作 9 旅遊(最多輸入4個)\n ");
    hobby[0] = scanner.nextInt();
    hobby[1] = scanner.nextInt();
    hobby[2] = scanner.nextInt();
    hobby[3] = scanner.nextInt();
    System.out.println("年齡\n ");
    client.salary = scanner.nextInt();
    System.out.println("年薪 :1 0-22000 2 22000-50000 3 50000-100000 4 100000UP\n ");
    client.age = scanner.nextInt();
    System.out.println("血型 :1A 2B 3O 4AB \n ");
    client.bloodType = scanner.nextInt();
    System.out.println("星座:1白羊座 2金牛座 3雙子座 4巨蟹座 5獅子座 6處女座 7天秤座 8天蠍座 9射手座 10魔羯座 11水瓶座 12雙魚座\n ");
    client.sign = scanner.nextInt();
    System.out.println("職業:1 學生 2 軍公教 3 上班族 4 八大 5 家庭主婦 6 自由業 \n ");
    client.job = scanner.nextInt();
    System.out.println("生肖:1鼠 2牛 3虎 4兔 5龍 6蛇 7馬 8羊 9猴 10雞 11狗 12豬 \n ");
    client.chineseSign = scanner.nextInt();
    System.out.println("家鄉:1北  2中   3南   4東   5離島\n ");
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
      System.out.println("選擇欲使用的話題:");
      Showtopic.show(habbit);
      Showtopic.cleartemp();
      System.out.println("(自行輸入請選0,離開請選9)");
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
    System.out.println("結束聊天");
	System.out.println("約會地點:1.健身房 2.台中商圈 3.圖書館 4.電動場 5.食品DIY工廠 6.演唱會 7.美術館 8.寫作類 9.旅遊");
	p1 = scanner.nextInt();
	place.chooseplace1(p1);
	p2 = scanner.nextInt();
	place.chooseplace2(p1, p2);
    scanner.close();
  }

}
