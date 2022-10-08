package Hello;

public class Result_HighLow {
//	public static void main(String[] args) {
//		// TODO 自動生成されたメソッド・スタブ
//		System.out.println("Hello World!! world");
//	}

	public int Result(int player, int com, boolean guess) {
		int Win = 2;
		int Lose = 0;
		int Draw = 1;

		//値の比較　testAAAA
		//プレイヤーが[High]と予想
		//神山ですyoyo
		if(guess) {
			if(player > com) {
				return Win;		//プレイヤーが勝ち
			} else if(player < com) {
				return Lose;	//プレイヤーが負け
			} else {
				return Draw;	//引き分け
			}
		}
		//プレイヤーが[Low]と予想
		else {
			if(player < com) {
				return Win;		//プレイヤーが勝ち
			} else if(player > com) {
				return Lose;	//プレイヤーが負け
			} else {
				return Draw;	//引き分け
			}
		}
	}
}
