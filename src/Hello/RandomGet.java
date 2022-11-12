package Hello;

import java.util.Map;
import java.util.Random;

public class RandomGet{
	
	
	//test
/*	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("Hello World!! world");
		random hello = new random();
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(0, "s1");
		map.put(1, "s2");
		map.put(2, "s3");
		map.put(3, "s4");
		map.put(4, "s5");
		map.put(5, "s6");
		map.put(6, "s7");
		map.put(7, "s8");
		map.put(8, "s9");
		map.put(9, "s10");
		map.put(10, "s11");
		map.put(11, "s12");
		map.put(12, "s13");
		
		
		
		//int mar = getCardRandom(map);
		
		
		
		
		//System.out.println("引いたカード:"+map.get(mar));
		//return mar;
		//リターンで返す
		
		
		//帰ってきた値を出力する
		

	}*/

	public int getCardRandom(Map<Integer,PlayingCard> map){//mapを取れる内容に変更する
		// 
		Random random = new Random();
		int mar = random.nextInt(map.size());//mapの数を取得して返す(deckを使う)
		return mar;
				//mapを受け取ってランダムで返す
				
	}
		
		
		
	
	
}
