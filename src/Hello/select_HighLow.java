package Hello;
import java.util.Scanner;

public class select_HighLow {
/*
	public static void main(String[] args) {
		select_HighLow Select = new select_HighLow();
		int fn = Select.select_message(5);
		Select.result_message(10,0);
	}
*/	
	public int select_message(int fs) {
		
		System.out.println("現在のカードは"+ fs +"です。");
		System.out.println("High  or  Low?(1/0) >");
		
		Scanner sc = new Scanner(System.in);
		String select = sc.nextLine();
		sc.close();
		
		if(select.equals("1")){
			System.out.println("→Highを選択しました。");
		}else{
			System.out.println("→Lowを選択しました。");
		}
		int num = Integer.parseInt(select);
		return num;
	}
	
	public void result_message(int lm,int ln) {
		
		System.out.println("あなたの引いたカードは"+ lm +"です。");
		
		if(ln == 2){
			System.out.println(" →You Win!!");
		}else if(ln == 1){
			System.out.println(" →Draw!!");
		}else{
			System.out.println(" →YOU LOSE!!!! （ﾌﾞｳｳｳｳｳｳ!!!!）たかがゲーム、そう思ってないですか？\n"
								+ " それやったら次も俺が勝ちますよ。\n"
								+ " ほな、いただきます。");
		}
	}

}
