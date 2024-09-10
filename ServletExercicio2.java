

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class ServletExercicio2
 */
public class ServletExercicio2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletExercicio2() {
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
		
		Double base = Double.parseDouble(request.getParameter("base"));
		Double altura  = Double.parseDouble(request.getParameter("altura"));
		
		Double area = (base * altura);
		
		PrintWriter saida = response.getWriter();
		saida.println("<html lang=\"pt-br\">"
				+ "<meta charset=\"UTF-8\">"
				+ "<head><title>Área do Retangulo</title></head>"
				+ "<body><h1>A area do Retangulo é: " + area + 
				"</h1></body></html>");
		
		
		
		doGet(request, response);
	}

}
