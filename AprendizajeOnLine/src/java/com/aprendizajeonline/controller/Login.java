package com.aprendizajeonline.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.aprendizajeonline.objetos.Estudiante;
import com.aprendizajeonline.model.LoginModel;
import com.aprendizajeonline.objetos.Docente;

@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charse=UTF-8");
        PrintWriter out = response.getWriter();
        String correo = request.getParameter("correo");
        String ci = request.getParameter("ci");
        LoginModel loginModel = new LoginModel();
        Estudiante estudiante = loginModel.autenticacion(correo, ci);
        if (estudiante != null) {
            HttpSession session = request.getSession(true);
            session.setAttribute("estudiante", estudiante.getNombre());
            session.setAttribute("id_estudiante", estudiante.getId()+"");
            response.sendRedirect("temas.jsp");
        } else {
            Docente docente = loginModel.autenticacionDocente(correo, ci);
            if (docente != null) {
                HttpSession session = request.getSession(true);
                session.setAttribute("docente", docente.getNombre());
                session.setAttribute("id_docente", docente.getId()+"");
                response.sendRedirect("temas.jsp");
            } else {
                response.sendRedirect("index.jsp");
            }
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
