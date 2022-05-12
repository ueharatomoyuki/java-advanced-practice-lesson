package jp.co.axiz.app;

public class CardGameApp extends GameApp{
	public CardGameApp() {
		
	}
	
	public CardGameApp(String a) {
		setPlayTime(5) ;
	}
	
	public String play() {
		String a = "ババ抜きを行います";
		return a ;
	}
}