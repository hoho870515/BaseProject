package findYourLove;

public class place {

	public static String chooseplace1(int place) {
		String[] pla = { "������" ,"�x���Ӱ�" ,"�Ϯ��]" ,"�q�ʳ�" ,"���~DIY�u�t" ,"�t�۷|" ,"���N�]" ,"�g�@��" ,"�ȹC"};
		System.out.println(pla[place-1]);
		switch(place) {
		case 1:
			System.out.println("1.World Gym 2.�����u�t");
			break;
		case 2:
			System.out.println("1.�{�ҩ]�� 2.�@����");
			break;
		case 3:
			System.out.println("1.��ߤ��@��T�Ϯ��] 2.�x�����߹Ϯ��]");
			break;
		case 4:
			System.out.println("1.���i�� 2.�j�|�տˤl�C�ֳ�");
			break;
		case 5:
			System.out.println("1.�M��DIY 2.�ϹϪG���N�O");
			break;
		case 6:
			System.out.println("1.����� 2.�P�N��");
			break;
		case 7:
			System.out.println("1.��ߥx�W���N�] 2.�b�a���N");
			break;
		case 8:
			System.out.println("1.�T��G�~ 2.��ߥx�W���N�]");
			break;
		case 9:
			System.out.println("1.���� 2.�R�_�ֶ�");
			break;
		}
		return pla[place-1];
	}
	
	public static String chooseplace2(int place, int place2) {
		
		String temp = null;
		
		switch(place) {
		case 1:
			if(place2 == 1) temp = "World Gym";
			else if(place2 == 2)temp = "�����u�t";
			else temp = "�ﶵ���s�b";
			break;
		case 2:
			if(place2 == 1)temp = "�{�ҩ]��";
			else if(place2 == 2)temp = "�@����";
			else temp = "�ﶵ���s�b";
			break;
		case 3:
			if(place2 == 1)temp = "��ߤ��@��T�Ϯ��]";
			else if(place2 == 2)temp = "�x�����߹Ϯ��]";
			else temp = "�ﶵ���s�b";
			break;
		case 4:
			if(place2 == 1)temp = "���i��";
			else if(place2 == 2)temp = "�j�|�տˤl�C�ֳ�";
			else temp = "�ﶵ���s�b";
			break;
		case 5:
			if(place2 == 1)temp = "�M��DIY";
			else if(place2 == 2)temp = "�ϹϪG���N�O";
			else temp = "�ﶵ���s�b";
			break;
		case 6:
			if(place2 == 1)temp = "�����";
			else if(place2 == 2)temp = "�P�N��";
			else temp = "�ﶵ���s�b";
			break;
		case 7:
			if(place2 == 1)temp = "��ߥx�W���N�]";
			else if(place2 == 2)temp = "�b�a���N";
			else temp = "�ﶵ���s�b";
			break;
		case 8:
			if(place2 == 1)temp = "�T��G�~";
			else if(place2 == 2)temp = "��ߥx�W���N�]";
			else temp = "�ﶵ���s�b";
			break;
		case 9:
			if(place2 == 1)temp = "����";
			else if(place2 == 2)temp = "�R�_�ֶ�";
			else temp = "�ﶵ���s�b";
			break;
		}
		System.out.println(temp);
		return temp;
	}

}