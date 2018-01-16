package findYourLove;

import java.io.BufferedReader;
import java.io.IOException;


public class Showtopic {
	static String temp = "";
	
    public static void show(int habbit) throws IOException {
    	BufferedReader hab = new BufferedReader(habbits.Returnha(habbit));
        while (hab.ready()) {
          temp = temp + hab.readLine() + "\n";
        }
        System.out.print(temp);
    }
    
    public static void cleartemp() {
    	temp = "";
    }
    
    public static String getTemp() {
    	return temp;
    }
}
