package jp.co.axiz.app;

public abstract class GameApp implements App {
	private String item ;
	private int playTime ;
	
	public String getItem() {
		return this.item ;
	}
	
	public void setItem(String item) {
		this.item = item ;
	}
	
	public int getPlayTime() {
		return this.playTime;
	}
	
	public void setPlayTime(int playTime) {
		this.playTime = playTime ;
	}
	
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