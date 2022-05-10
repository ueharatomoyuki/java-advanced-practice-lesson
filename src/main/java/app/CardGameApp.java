package app;

public class CardGameApp extends GameApp{
	public CardGameApp() {
		
	}
	
	public CardGameApp(String a) {
		
	}
	
	public String start(String name) {
		String a = name+"さんと"+this.item+"でゲームを開始します。ババ抜きを行います";
		return a ;
	}
}