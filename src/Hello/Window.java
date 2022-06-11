package Hello;

import javax.swing.JFrame;

class Test{
	public static void main(String[] args) {
		new TestWindow("テストウィンドウ",400,300);
	}
}
 
class TestWindow extends JFrame{
	public TestWindow(String title, int width, int height) {
		super(title);
		setDefaultCloseOperation(EXIT_ON_CLOSE);//閉じるボタンの処理
		setSize(width,height);//ウィンドウサイズ
		setLocationRelativeTo(null);//画面中央に配置
		setResizable(false);//リサイズ禁止
		setVisible(true);//ウィンドウ表示
	}
}