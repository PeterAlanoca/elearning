package com.aprendizajeonline.controller;

import com.aprendizajeonline.model.DocenteModel;
import com.aprendizajeonline.model.TemaModel;
import com.aprendizajeonline.objetos.Docente;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.FilenameUtils;
@WebServlet(name = "Temas", urlPatterns = {"/Temas"})
public class Temas extends HttpServlet {
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, Exception {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        Map<String, String> map = getElement(request);
        TemaModel temaModel = new TemaModel();
        HttpSession session = request.getSession();
        String materia = "";
        int idDocente = 0;
        if(session.getAttribute("docente") != null){
            idDocente = Integer.parseInt((String) session.getAttribute("id_docente"));
            DocenteModel docenteModel = new DocenteModel();
            Docente docente = docenteModel.getId(idDocente);
            materia = docente.getMateria();
        }
        temaModel.add(idDocente, materia, map.get("titulo"), map.get("descripcion"), map.get("contenido"), map.get("archivo"), getFecha());
        response.sendRedirect("temas.jsp");
    }
    
    private String getFecha(){
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Calendar calendar = Calendar.getInstance();
	String fecha = dateFormat.format(calendar.getTime());
        return fecha;
    }
    
    private Map<String, String> getElement(HttpServletRequest request) throws Exception{
        Map<String, String> map = new HashMap<String, String>();
        try {
            List<FileItem> items = new ServletFileUpload(new DiskFileItemFactory()).parseRequest(request);
            for (FileItem item : items) {
                if (item.isFormField()) {
                    String fieldName = item.getFieldName();
                    String fieldValue = item.getString();
                    map.put(fieldName, fieldValue);
                } else {
                    String archivourl = "C:\\xampp\\htdocs\\AprendizajeOnLine\\web\\files";
                    DiskFileItemFactory factory = new DiskFileItemFactory();
                    factory.setSizeThreshold(5000*1024);
                    factory.setRepository(new File(archivourl));
                    String fieldName = item.getFieldName();
                    String fileName = FilenameUtils.getName(item.getName());
                    String name = new File(item.getName()).getName();
                    item.write(new File(archivourl + File.separator + name));
                    map.put(fieldName, fileName);
                }
            }
        } catch (FileUploadException e) {
            throw new ServletException("Cannot parse multipart request.", e);
        }
        
        return map;
    }
    
    
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(Temas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(Temas.class.getName()).log(Level.SEVERE, null, ex);
        }
        PrintWriter out = response.getWriter();
        
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
