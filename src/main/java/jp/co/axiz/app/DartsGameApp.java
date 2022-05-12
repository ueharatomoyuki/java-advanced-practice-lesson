package jp.co.axiz.app;

public class DartsGameApp extends GameApp{
	public DartsGameApp(){
		
	}
	
	public DartsGameApp(String a) {
		setPlayTime(5) ;
	}
	
	protected String play() {
		String a = "10回投げて合計点を競います。";
		return a ;
	}
}
