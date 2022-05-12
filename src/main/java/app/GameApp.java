package app;

public abstract class GameApp implements App {
	public String item ;
	
	public GameApp() {
	}
	
	public GameApp(String item) {
		this.item = item ;
	}
	
	public abstract String play ();
	
	public String start(String name) {
		String a = name+"さんと"+this.item +"でゲームを開始します";
		return a ;
	}
}