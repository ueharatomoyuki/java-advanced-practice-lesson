package app ;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StartAppServlet
 */
@WebServlet("/inputServlet")
public class InputServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public InputServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    	// ここに必要な処理を記述してください。
    	String birthPlace =request.getParameter("birthPlace") ;
    	String name =request.getParameter("name") ;
    	String lanugage =request.getParameter("lanugage") ;
    	String info ="" ;  
    	if(birthPlace.equals("")) {
    		info = "名前：名無し、言語：不明、出身地：不明";
    	}else if(birthPlace.equals("japan")) {
    		info = "名前：名無し、言語：日本語、出身地：日本。日本の公用語は「日本語」です。";
    	}else {
    		info = "名前：名無し、言語：英語、出身地：アメリカ。アメリカの公用語は「英語」です。";
    	}

        // 結果画面へ
    	request.setAttribute("info",info) ;
        request.getRequestDispatcher("result.jsp").forward(request, response);
    }
}
