package findYourLove;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Chat {
  static File chat = new File("chat.txt");
  static String tmp = "";

  public static void chat(int choose, BufferedReader habr) throws IOException {
    Scanner scanner = new Scanner(System.in);
    FileWriter fw = new FileWriter(chat, true);
    int count = 1;
    String readLine;
    if (choose > 3)
      System.out.println("選項不存在");
    while (true) {
      readLine = habr.readLine();
      if (count < choose) {
        count++;
        continue;
      }
      tmp = tmp + readLine + "\n";
      fw.write(readLine + "\r\n");
      fw.flush();
      if (count >= choose) {
        break;
      }
    }
    count = 1;
    fw.close();
  }

  public static void chat_by_yourself(String temp) throws IOException {
    FileWriter fw = new FileWriter(chat, true);
    System.out.println("(輸入聊天內容，或輸入exit離開)");
    if (!temp.equalsIgnoreCase("exit")) {
      tmp = tmp + temp + "\n";
      fw.write(temp + "\r\n");
      fw.flush();
    }
    fw.close();
  }

  public static String getTmp() {
    return tmp;
  }
}