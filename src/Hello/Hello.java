package Hello;

public class Hello {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
		// System.out.println("Hello World!! world");
		int playNum = 10;	//自分の番号
		int comNum = 100;	//相手の番号
		boolean myGuess = true;	//自分の予想
		int WinLose = 0;	//結果
		
		//関数呼び出し
		Result_HighLow result = new Result_HighLow();
		WinLose = result.Result(playNum, comNum, myGuess);
//		result.Result(num1, num2, WinLose);
		
		//結果出力（仮）
		if(WinLose == 2) {
			System.out.println("Your WIN!!");
		} else if(WinLose == 0) {
			System.out.println("Your Lose");
		} else {
			System.out.println("Draw");
		}
	}	
}
