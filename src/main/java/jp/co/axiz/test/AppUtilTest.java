package jp.co.axiz.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import jp.co.axiz.app.CardGameApp;
import jp.co.axiz.app.ClockApp;
import jp.co.axiz.app.DartsGameApp;
import jp.co.axiz.util.AppUtil;

class AppUtilTest {

	CardGameApp c = new CardGameApp() ;
	DartsGameApp d = new DartsGameApp() ;
	ClockApp t = new ClockApp() ;
	
	@Test
	public void ゲームテストC() {
		assertEquals( true,AppUtil.isGameApp(c)) ;
	}
	
	@Test
	public void ゲームテストD() {
		assertEquals( true,AppUtil.isGameApp(d)) ;
	}
	
	@Test
	public void ゲームテストT() {
		assertEquals( false,AppUtil.isGameApp(t)) ;
	}
	
	@Test
	public void カードテストC() {
		assertEquals( true,AppUtil.isCardGameApp(c)) ;
	}
	
	@Test
	public void カードテストD() {
		assertEquals( false,AppUtil.isCardGameApp(d)) ;
	}
	
	@Test
	public void カードテストT() {
		assertEquals( false,AppUtil.isCardGameApp(t)) ;
	}
	
	@Test
	public void ダーツテストC() {
		assertEquals( false,AppUtil.isDartsGameApp(c)) ;
	}
	
	@Test
	public void ダーツテストD() {
		assertEquals( true,AppUtil.isDartsGameApp(d)) ;
	}
	
	@Test
	public void ダーツテストT() {
		assertEquals( false,AppUtil.isDartsGameApp(t)) ;
	}
	
	@Test
	public void タイムテストC() {
		assertEquals( false,AppUtil.isClockApp(c)) ;
	}
	
	@Test
	public void タイムテストD() {
		assertEquals( false,AppUtil.isClockApp(d)) ;
	}
	
	@Test
	public void タイムテストT() {
		assertEquals( true,AppUtil.isClockApp(t)) ;
	}
	
	@Test
	public void 名前テストC() {
		assertEquals( "ゲーム：カード",AppUtil.getAppName(c)) ;
	}
	
	@Test
	public void 名前テストD() {
		assertEquals( "ゲーム：ダーツ",AppUtil.getAppName(d)) ;
	}
	
	@Test
	public void 名前テストT() {
		assertEquals( "時計",AppUtil.getAppName(t)) ;
	}



}


