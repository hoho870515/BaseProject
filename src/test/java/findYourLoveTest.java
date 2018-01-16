package findYourLove;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.Test;

public class findYourLoveTest {

  int[] amy = { 1, 2, 3, 4 };
  int[] jojo = { 1, 3, 4, 6 };
  people hoho = new people(1, 1, 1, 1, 1, 1, 1, 1, 1, amy);
  people jj = new people(19, 1, 2, 1, 1, 4, 1, 3, 2, jojo);

  // @BeforeClass
  // public static void setUpBeforeClass() throws Exception {
  //
  // }

  @AfterClass
  public static void tearDownAfterClass() throws Exception {
    FileWriter fw = new FileWriter("chat.txt");
    fw.write("");
    fw.flush();
    fw.close();
  }
  //
  // @Before
  // public void setUp() throws Exception {
  //
  // }
  //
  // @After
  // public void tearDown() throws Exception {
  //
  // }

  @org.junit.Test
  public void test() {
    hoho.matchscore = 0;

    assertEquals(1, hoho.match(1, 1));

    assertEquals(7, hoho.checkScore(jj));

    assertEquals(1, hoho.findHobby(amy, jojo));

    assertEquals(0, hoho.findYourLove(9, 4, 8, 7));
    assertEquals(1, hoho.findYourLove(9, 14, 8, 7));
    assertEquals(2, hoho.findYourLove(9, 4, 118, 7));
    assertEquals(3, hoho.findYourLove(9, 14, 8, 117));

    assertEquals(2, hoho.bigOrSmall(2, 1));
    assertEquals(2, hoho.bigOrSmall(1, 2));

  }

  @Test
  public void Showtopic_test() throws IOException {
    String temp = "";
    for (int i = 1; i < 10; i++) {
      BufferedReader hab = new BufferedReader(habbits.Returnha(i));
      while (hab.ready()) {
        temp = temp + hab.readLine() + "\n";
      }
      Showtopic.show(i);
      assertEquals(temp, Showtopic.getTemp());
    }
  }

  @Test
  public void Chat_topic_test() throws IOException {
    String temp = "";
    FileReader chat = new FileReader("chat.txt");
    for (int i = 1; i < 10; i++) {
      BufferedReader habr = new BufferedReader(habbits.Returnhar(i));
      for (int j = 1; j < 4; j++) {
        Chat.chat(i, habr);
        BufferedReader hab = new BufferedReader(chat);
        while (hab.ready()) {
          temp = temp + hab.readLine() + "\n";
        }
        assertEquals(temp, Chat.getTmp());
      }
    }
  }

  @Test
  public void Chat_yourself_test() throws IOException {
    FileReader chat = new FileReader("chat.txt");
    char[] letter = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
        't', 'u', 'v', 'w', 'x', 'y', 'z' };
    char[] temp = { 'a', 'a', 'a', 'a' };
    String word = "";
    String tmp = "";
    String temp_of_word = "";
    int i, j, k;
    for (i = 0; i < 4; i++) {
      for (j = 0; j < 26; j++) {
        temp[i] = letter[j];
        for (k = 0; k < 4; k++)
          word = word + temp[k];
        Chat.chat_by_yourself(word);
        BufferedReader read = new BufferedReader(chat);
        while (read.ready()) {
          tmp = tmp + read.readLine() + "\n";
        }
        temp_of_word = temp_of_word + word + "\n";
        assertEquals(temp_of_word, tmp);
        word = "";
      }
    }
  }
  
	@Test
	public void place_test() {
		String[] pla = { "������" ,"�x���Ӱ�" ,"�Ϯ��]" ,"�q�ʳ�" ,"���~DIY�u�t" ,"�t�۷|" ,"���N�]" ,"�g�@��" ,"�ȹC"};
	    for(int i=1;i<10;i++) {
	    	assertEquals(pla[i-1],place.chooseplace1(i));
		}
	}
	
	@Test
	public void place2_test() {
		String[][] pla;
		pla = new String[9][2];
		pla[0][0] = "World Gym";
		pla[0][1] = "�����u�t";
		pla[1][0] = "�{�ҩ]��";
		pla[1][1] = "�@����";
		pla[2][0] = "��ߤ��@��T�Ϯ��]";
		pla[2][1] =	"�x�����߹Ϯ��]";
		pla[3][0] = "���i��";
	    pla[3][1] = "�j�|�տˤl�C�ֳ�";
	    pla[4][0] = "�M��DIY";
	    pla[4][1] = "�ϹϪG���N�O";
	    pla[5][0] = "�����";
	    pla[5][1] = "�P�N��";
	    pla[6][0] = "��ߥx�W���N�]";
	    pla[6][1] = "�b�a���N";
	    pla[7][0] = "�T��G�~";
	    pla[7][1] = "��ߥx�W���N�]";
	    pla[8][0] = "����";
	    pla[8][1] = "�R�_�ֶ�";
	    for(int i=1;i<10;i++) {
	    	for(int j=1;j<=3;j++) {
	    		if(j>2) {
	    			assertEquals("�ﶵ���s�b",place.chooseplace2(i,j));
	    			break;
	    		}
	    		assertEquals(pla[i-1][j-1],place.chooseplace2(i,j));
	    	}
		}
	}
}
