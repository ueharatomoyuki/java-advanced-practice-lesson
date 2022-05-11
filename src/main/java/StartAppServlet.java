import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import app.App;
import app.CardGameApp;
import app.ClockApp;
import app.DartsGameApp;
import app.GameApp;

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
		
		if(game.equals("ge")) {
			GameApp p = new DartsGameApp() ;
			result = p.play();
		}else if(game.equals("to")) {
			GameApp l = new CardGameApp() ;
			result = l.play();
		}else if(game.equals("ti")) {
			App a = new ClockApp() ;
			result = a.start(name) ;
		}else {
			result = "アプリの実行に失敗しました。" ;
		}
		
		System.out.println(game);
		System.out.println(name) ;
		System.out.println(result);
		
		request.setAttribute("result", result) ;
		
		request.getRequestDispatcher("/appStart.jsp").forward(request,response);
	}

}