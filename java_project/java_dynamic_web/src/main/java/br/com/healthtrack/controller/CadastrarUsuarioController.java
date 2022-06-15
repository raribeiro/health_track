package br.com.healthtrack.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class CadastrarUsuarioController
 */
@WebServlet("/CadastrarUsuarioController")
public class CadastrarUsuarioController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CadastrarUsuarioController() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println(1111);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		
		UsuarioController usuario = new UsuarioController();
		
		usuario.setPrim_nm_usuario(request.getParameter("nm"));
		usuario.setSeg_nm_usuario(request.getParameter("snm"));
		usuario.setEmail_usuario(request.getParameter("email"));
		usuario.setSenha_usuario(request.getParameter("pass"));
		usuario.setMeta_peso_usuario(00.0);
		
		try {
			usuario.cadastraUsuario();
			
			String mensagem = "Usuário cadastrado com sucesso!";
			request.setAttribute("mensagem", mensagem);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("conectaUsuario.jsp");
			dispatcher.forward(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
