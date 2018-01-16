package findYourLove;

import java.io.FileWriter;
import java.io.IOException;

public class people {
  int num1,num2,num3;
  int i,j;
  int temp;
  
  int preferSex;
  int[] hobby;
  int salary;
  int age;
  int sexType;
  int bloodType;
  int sign;
  int job;
  int chineseSign;
  int home;
  int matchscore = 0;

  public people(int age, int salary,int preferSex, int sexType, int bloodType, int sign, int job, int chineseSign, int home,
    int[] hobby) {
    this.age = age;
    this.salary = salary;
    this.sexType = sexType;
    this.bloodType = bloodType;
    this.sign = sign;
    this.job = job;
    this.chineseSign = chineseSign;
    this.home = home;
    this.hobby = hobby;
  }

  public int match(int me, int client) {
    if (me == client) {
      matchscore += 1;
      return 1;
    }
    return 0;
  }

  public int checkScore(people aPeople) {
    for (i = 0; i < 4; i++) {
      for (j = 0; j < 4; j++) {
        this.match(this.hobby[i], aPeople.hobby[j]);
      }
    }
    this.match(this.age, aPeople.age);
    this.match(this.salary, aPeople.salary);
    this.match(this.bloodType, aPeople.bloodType);
    this.match(this.sign, aPeople.sign);
    this.match(this.job, aPeople.job);
    this.match(this.chineseSign, aPeople.chineseSign);
    this.match(this.home, aPeople.home);
    //System.out.println(matchscore);
    temp = matchscore;
    matchscore = 0;
    return temp;
  }

  public int bigOrSmall(int a, int b) {
    if (a >= b) {
      return a;
    } else {
      return b;
    }
  }

  public int findYourLove(int a, int b, int c, int d) {
    num1 = this.bigOrSmall(a, b);
    num2 = this.bigOrSmall(c, d);
    num3 = this.bigOrSmall(num1, num2);
    System.out.println(num3);
    if (a == num3) {
      System.out.println("match with hung");
      return 0;
    } 
    if (b == num3) {
      System.out.println("match with ling");
      return 1;
    } 
     if (c == num3) {
      System.out.println("match with xiao");
      return 2;
    } 
     if (d == num3) {
      System.out.println("match with yu");
      return 3;
    }
    return -1;
  }

  public int findHobby(int[] client,int[] me) {
    for (i = 0; i < 4; i++) {
      for (j = 0; j < 4; j++) {
        if(client[i]==me[j]) {
          return client[i];
        }
      }
    }
    return -1;
  }
  
  public void writeToData(people client) throws IOException {
    FileWriter hohofw = new FileWriter("database.txt", true);
    for (i = 0; i < 4; i++) {
      hohofw.write(String.valueOf(client.hobby[i])+" ");
    }
    hohofw.write("\r\n");
    hohofw.write(String.valueOf(client.sexType)+" ");
    hohofw.write(String.valueOf(client.preferSex)+" ");
    hohofw.write(String.valueOf(client.salary)+" ");
    hohofw.write(String.valueOf(client.age)+" ");
    hohofw.write(String.valueOf(client.bloodType)+" ");
    hohofw.write(String.valueOf(client.sign)+" ");
    hohofw.write(String.valueOf(client.job)+" ");
    hohofw.write(String.valueOf(client.chineseSign)+" ");
    hohofw.write(String.valueOf(client.home)+" ");
    hohofw.write("\r\n");
    hohofw.flush();
    hohofw.close();
  }
  
  
}

