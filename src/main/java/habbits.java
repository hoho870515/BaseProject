package findYourLove;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class habbits {
  private static FileReader ha;
  private static FileReader har;
  
  public static FileReader Returnha(int habbit) throws FileNotFoundException {
    switch(habbit)
    {
      case 1:
        ha = new FileReader("habbit-1(sport).txt");
        break;
      case 2:
        ha = new FileReader("habbit-2(shopping).txt");
        break;
      case 3:
        ha = new FileReader("habbit-3(read).txt");
        break;
      case 4:
        ha = new FileReader("habbit-4(video game).txt");
        break;
      case 5:
        ha = new FileReader("habbit-5(cook).txt");
        break;
      case 6:
        ha = new FileReader("habbit-6(music).txt");
        break;
      case 7:
        ha = new FileReader("habbit-7(paint).txt");
        break;
      case 8:
        ha = new FileReader("habbit-8(write).txt");
        break;
      default:
        ha = new FileReader("habbit-9(tourism).txt");
      }
    return ha;
  }
  
  public static FileReader Returnhar(int habbit) throws FileNotFoundException{
    switch(habbit)
    {
      case 1:
        har = new FileReader("habbit-1r(sport).txt");
        break;
      case 2:
        har = new FileReader("habbit-2r(shopping).txt");
        break;
      case 3:
        har = new FileReader("habbit-3r(read).txt");
        break;
      case 4:
        har = new FileReader("habbit-4r(video game).txt");
        break;
      case 5:
        har = new FileReader("habbit-5r(cook).txt");
        break;
      case 6:
        har = new FileReader("habbit-6r(music).txt");
        break;
      case 7:
        har = new FileReader("habbit-7r(paint).txt");
        break;
      case 8:
        har = new FileReader("habbit-8r(write).txt");
        break;
      default:
        har = new FileReader("habbit-9r(tourism).txt");
      }
    return har;
  }
}
