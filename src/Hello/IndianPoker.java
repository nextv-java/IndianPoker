package Hello;

import java.util.HashMap;
import java.util.Map;

public class IndianPoker{

	PlayingCard s1;
	PlayingCard s2;
	PlayingCard s3;
	PlayingCard s4;
	PlayingCard s5;
	PlayingCard s6;
	PlayingCard s7;
	PlayingCard s8;
	PlayingCard s9;
	PlayingCard s10;
	PlayingCard s11;
	PlayingCard s12;
	PlayingCard s13;
	PlayingCard h1;
	PlayingCard h2;
	PlayingCard h3;
	PlayingCard h4;
	PlayingCard h5;
	PlayingCard h6;
	PlayingCard h7;
	PlayingCard h8;
	PlayingCard h9;
	PlayingCard h10;
	PlayingCard h11;
	PlayingCard h12;
	PlayingCard h13;
	PlayingCard d1;
	PlayingCard d2;
	PlayingCard d3;
	PlayingCard d4;
	PlayingCard d5;
	PlayingCard d6;
	PlayingCard d7;
	PlayingCard d8;
	PlayingCard d9;
	PlayingCard d10;
	PlayingCard d11;
	PlayingCard d12;
	PlayingCard d13;
	PlayingCard c1;
	PlayingCard c2;
	PlayingCard c3;
	PlayingCard c4;
	PlayingCard c5;
	PlayingCard c6;
	PlayingCard c7;
	PlayingCard c8;
	PlayingCard c9;
	PlayingCard c10;
	PlayingCard c11;
	PlayingCard c12;
	PlayingCard c13;

	Map<Integer,PlayingCard> deck = new HashMap<Integer,PlayingCard>();
	Map<Integer,PlayingCard> disCard = new HashMap<Integer,PlayingCard>();
	
	public static void main(String[] args) {
		IndianPoker ip = new IndianPoker();
		ip.start();
	}
	
	public void start() {
		
		//メッセージ表示クラス
		select_HighLow sh = new select_HighLow();
		//勝敗判定クラス
		Result_HighLow rh = new Result_HighLow();  
		
		//カード作成
		createCard();
		//山札設定
		setDeck();
		
		//ランダムな数値取得
		//int cardIdA = ちばさん(deck);
		//int cardIdB = ちばさん(deck);
		int cardIdA = 21;
		int cardIdB = 35;
		PlayingCard cardA = deck.get(cardIdA);  
		PlayingCard cardB = deck.get(cardIdB);  
		
		//メッセージ表示
		int iAnser = sh.select_message(cardA.number);
		//Highの場合trueに変換
		boolean bAnser = (iAnser == 1); 
		//結果判定
		int result = rh.Result(cardA.number, cardB.number, bAnser);
		
		//結果表示
		sh.result_message(cardB.number,result);

	}
		
	public void createCard(){
		s1 = new PlayingCard("S",1);
		s2 = new PlayingCard("S",2);
		s3 = new PlayingCard("S",3);
		s4 = new PlayingCard("S",4);
		s5 = new PlayingCard("S",5);
		s6 = new PlayingCard("S",6);
		s7 = new PlayingCard("S",7);
		s8 = new PlayingCard("S",8);
		s9 = new PlayingCard("S",9);
		s10 = new PlayingCard("S",10);
		s11 = new PlayingCard("S",11);
		s12 = new PlayingCard("S",12);
		s13 = new PlayingCard("S",13);
		h1 = new PlayingCard("H",1);
		h2 = new PlayingCard("H",2);
		h3 = new PlayingCard("H",3);
		h4 = new PlayingCard("H",4);
		h5 = new PlayingCard("H",5);
		h6 = new PlayingCard("H",6);
		h7 = new PlayingCard("H",7);
		h8 = new PlayingCard("H",8);
		h9 = new PlayingCard("H",9);
		h10 = new PlayingCard("H",10);
		h11 = new PlayingCard("H",11);
		h12 = new PlayingCard("H",12);
		h13 = new PlayingCard("H",13);
		d1 = new PlayingCard("D",1);
		d2 = new PlayingCard("D",2);
		d3 = new PlayingCard("D",3);
		d4 = new PlayingCard("D",4);
		d5 = new PlayingCard("D",5);
		d6 = new PlayingCard("D",6);
		d7 = new PlayingCard("D",7);
		d8 = new PlayingCard("D",8);
		d9 = new PlayingCard("D",9);
		d10 = new PlayingCard("D",10);
		d11 = new PlayingCard("D",11);
		d12 = new PlayingCard("D",12);
		d13 = new PlayingCard("D",13);
		c1 = new PlayingCard("C",1);
		c2 = new PlayingCard("C",2);
		c3 = new PlayingCard("C",3);
		c4 = new PlayingCard("C",4);
		c5 = new PlayingCard("C",5);
		c6 = new PlayingCard("C",6);
		c7 = new PlayingCard("C",7);
		c8 = new PlayingCard("C",8);
		c9 = new PlayingCard("C",9);
		c10 = new PlayingCard("C",10);
		c11 = new PlayingCard("C",11);
		c12 = new PlayingCard("C",12);
		c13 = new PlayingCard("C",13);
	}
	
	public void setDeck(){
		deck.put(0,s1);
		deck.put(1,s2);
		deck.put(2,s3);
		deck.put(3,s4);
		deck.put(4,s5);
		deck.put(5,s6);
		deck.put(6,s7);
		deck.put(7,s8);
		deck.put(8,s9);
		deck.put(9,s10);
		deck.put(10,s11);
		deck.put(11,s12);
		deck.put(12,s13);
		deck.put(13,h1);
		deck.put(14,h2);
		deck.put(15,h3);
		deck.put(16,h4);
		deck.put(17,h5);
		deck.put(18,h6);
		deck.put(19,h7);
		deck.put(20,h8);
		deck.put(21,h9);
		deck.put(22,h10);
		deck.put(23,h11);
		deck.put(24,h12);
		deck.put(25,h13);
		deck.put(26,d1);
		deck.put(27,d2);
		deck.put(28,d3);
		deck.put(29,d4);
		deck.put(30,d5);
		deck.put(31,d6);
		deck.put(32,d7);
		deck.put(33,d8);
		deck.put(34,d9);
		deck.put(35,d10);
		deck.put(36,d11);
		deck.put(37,d12);
		deck.put(38,d13);
		deck.put(39,c1);
		deck.put(40,c2);
		deck.put(41,c3);
		deck.put(42,c4);
		deck.put(43,c5);
		deck.put(44,c6);
		deck.put(45,c7);
		deck.put(46,c8);
		deck.put(47,c9);
		deck.put(48,c10);
		deck.put(49,c11);
		deck.put(50,c12);
		deck.put(51,c13);
	}

}
