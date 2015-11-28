package ajaxdemo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ActionServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private ArrayList<Persona> personas = new ArrayList<>();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		response.setContentType( "text/html; charset=iso-8859-1" );
		PrintWriter out = response.getWriter();
		
		// Obtengo los datos de la peticion
		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		String edad = request.getParameter("edad");
		
		if (!nombre.equals("") && !apellido.equals("") && !edad.equals("")) {
			// Creo el objeto persona y lo añado al arrayList
			Persona persona = new Persona(nombre, apellido, edad);
			personas.add(persona);
		}
		
		out.println("<table style= cellspacing=\"1\" bgcolor=\"#0099cc\">");
		out.println("<tr>");
		out.println("<td style= rowspan=\"7\" align=\"center\" bgcolor=\"#f8f8f8\"> NOMBRE </td>");			
		out.println("<td style= rowspan=\"7\" align=\"center\" bgcolor=\"#f8f8f8\">APELLIDO</td>");
		out.println("<td style= rowspan=\"7\" align=\"center\" bgcolor=\"#f8f8f8\">EDAD</td>");
		out.println("</tr>");
		for(int i=0; i<personas.size(); i++){
			Persona persona = personas.get(i);
			out.println("<tr>");
			out.println("<td style= rowspan=\"7\" align=\"center\" bgcolor=\"#f8f8f8\">"+persona.getNombre()+"</td>");			
			out.println("<td style= rowspan=\"7\" align=\"center\" bgcolor=\"#f8f8f8\">"+persona.getApellido()+"</td>");
			out.println("<td style= rowspan=\"7\" align=\"center\" bgcolor=\"#f8f8f8\">"+persona.getEdad()+"</td>");
			out.println("</tr>");
		}
		out.println("</table>");
		
		
	}

}
