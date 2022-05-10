import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import app.CardGameApp;

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
		String ap ;
		String result = "" ;
		CardGameApp CardGameApp = new CardGameApp();
		if(game.equals("ge")) {
			ap = "ゲーム" ;
			CardGameApp.item = "何か" ;
			result = name + "さんと"+CardGameApp.item+"でゲームします。" ;
		}else {
			ap = "トランプ" ;
			CardGameApp.item = ap ;
			result = CardGameApp.start(name) ;
		}
		System.out.println(game);
		System.out.println(name) ;
		System.out.println(ap) ;
		System.out.println(result);
		
		request.setAttribute("result", result) ;
		
		request.getRequestDispatcher("/appStart.jsp").forward(request,response);
	}

}
