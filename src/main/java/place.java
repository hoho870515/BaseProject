package findYourLove;

public class place {

	public static String chooseplace1(int place) {
		String[] pla = { "健身房" ,"台中商圈" ,"圖書館" ,"電動場" ,"食品DIY工廠" ,"演唱會" ,"美術館" ,"寫作類" ,"旅遊"};
		System.out.println(pla[place-1]);
		switch(place) {
		case 1:
			System.out.println("1.World Gym 2.健身工廠");
			break;
		case 2:
			System.out.println("1.逢甲夜市 2.一中圈");
			break;
		case 3:
			System.out.println("1.國立公共資訊圖書館 2.台中市立圖書館");
			break;
		case 4:
			System.out.println("1.湯姆熊 2.大魯閣親子遊樂場");
			break;
		case 5:
			System.out.println("1.烘培DIY 2.圖圖果霜淇淋");
			break;
		case 6:
			System.out.println("1.五月天 2.周杰倫");
			break;
		case 7:
			System.out.println("1.國立台灣美術館 2.鶴軒藝術");
			break;
		case 8:
			System.out.println("1.三毛故居 2.國立台灣美術館");
			break;
		case 9:
			System.out.println("1.日月潭 2.麗寶樂園");
			break;
		}
		return pla[place-1];
	}
	
	public static String chooseplace2(int place, int place2) {
		
		String temp = null;
		
		switch(place) {
		case 1:
			if(place2 == 1) temp = "World Gym";
			else if(place2 == 2)temp = "健身工廠";
			else temp = "選項不存在";
			break;
		case 2:
			if(place2 == 1)temp = "逢甲夜市";
			else if(place2 == 2)temp = "一中圈";
			else temp = "選項不存在";
			break;
		case 3:
			if(place2 == 1)temp = "國立公共資訊圖書館";
			else if(place2 == 2)temp = "台中市立圖書館";
			else temp = "選項不存在";
			break;
		case 4:
			if(place2 == 1)temp = "湯姆熊";
			else if(place2 == 2)temp = "大魯閣親子遊樂場";
			else temp = "選項不存在";
			break;
		case 5:
			if(place2 == 1)temp = "烘培DIY";
			else if(place2 == 2)temp = "圖圖果霜淇淋";
			else temp = "選項不存在";
			break;
		case 6:
			if(place2 == 1)temp = "五月天";
			else if(place2 == 2)temp = "周杰倫";
			else temp = "選項不存在";
			break;
		case 7:
			if(place2 == 1)temp = "國立台灣美術館";
			else if(place2 == 2)temp = "鶴軒藝術";
			else temp = "選項不存在";
			break;
		case 8:
			if(place2 == 1)temp = "三毛故居";
			else if(place2 == 2)temp = "國立台灣美術館";
			else temp = "選項不存在";
			break;
		case 9:
			if(place2 == 1)temp = "日月潭";
			else if(place2 == 2)temp = "麗寶樂園";
			else temp = "選項不存在";
			break;
		}
		System.out.println(temp);
		return temp;
	}

}