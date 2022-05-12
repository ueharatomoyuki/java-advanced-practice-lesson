package jp.co.axiz.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.axiz.app.App;
import jp.co.axiz.app.CardGameApp;
import jp.co.axiz.app.ClockApp;
import jp.co.axiz.app.DartsGameApp;
import jp.co.axiz.app.GameApp;

/**
 * Servlet implementation class StartAppServlet
 */
@WebServlet("/StartAppServlet")
public class StartAppServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StartAppServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		String name = request.getParameter("name") ;
		String game   = request.getParameter("game") ;
		String result = "" ;
		int t = 0 ;
		App app = null ;
		
		if(game.equals("ge")) {
			GameApp p = new DartsGameApp("a") ;
			result = p.play();
			app = p ;
		}else if(game.equals("to")) {
			GameApp l = new CardGameApp("a") ;
			result = l.play();
			app = l ;
		}else if(game.equals("ti")) {
			App a = new ClockApp() ;
			result = a.start(name) ;
			app = a ;
		}else {
			result = "アプリの実行に失敗しました。" ;
		}
		System.out.println(game);
		System.out.println(name) ;
		System.out.println(result);
		
		if(app instanceof GameApp) {
			GameApp gameApp = (GameApp)app ;
			if(game.equals("ge")) {
				GameApp p = new DartsGameApp("a") ;
			  t = p.getPlayTime() ;
			}else {
				GameApp p = new DartsGameApp("a");
				t = p.getPlayTime() ; 
			}
		}
		
//		GameApp p = new DartsGameApp("a") ;
//		App app = null ;
//		String a = "" ;
//		if(app instanceof GamaApp) {
//			app = (GameApp)p.getPlayTime() ;
//		}
		request.setAttribute("result", result) ;
		request.setAttribute("t",t) ;
		
		request.getRequestDispatcher("/appStart.jsp").forward(request,response);
	}

}