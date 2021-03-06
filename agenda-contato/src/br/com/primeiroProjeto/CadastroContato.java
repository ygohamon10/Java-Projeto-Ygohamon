package br.com.primeiroProjeto;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CadastroContato
 */
@WebServlet("/CadastroContato")
public class CadastroContato extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CadastroContato() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		String email = request.getParameter("email");
		System.out.println("Recebendo o nome" + nome);
		System.out.println("recebendo o email" + email);
		
		String html = "<html><head><title>Recebendo</title></head>"
				+ "<body><h3>"+nome+"</h3></br>"
				+ "<h3>"+email+"</h3></br>"
				+ "</body></html>";
		
		response.getWriter().append(html);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		String telefone = request.getParameter("telefone");
		String email = request.getParameter("email");
		String endereco = request.getParameter("endereco");
		
		System.out.println("Recebendo o nome: " + nome);
		System.out.println("recebendo o telefone: " + telefone);
		System.out.println("recebendo o email: " + email);
		System.out.println("recebendo o endere�o: " + endereco);
		
		String html = "<html><head><title>Recebendo</title></head>"
				+ "<body><h3>Nome: "+nome+"</h3></br>"
				+ "<h3>Email: "+email+"</h3></br>"
				+ "<h3>Telefone: "+telefone+"</h3></br>"
				+ "<h3>Endere�o: "+endereco+"</h3></br>"
				+ "</body></html>";
		
		response.getWriter().append(html);
	}

}
