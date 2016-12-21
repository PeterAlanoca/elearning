package com.aprendizajeonline.model;

import com.aprendizajeonline.database.Conexion;
import com.aprendizajeonline.objetos.Tema;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TemaModel extends Conexion{
    
    public Tema getId(int id){
        Tema tema = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
            String query = "select * from tema where id = ? limit 1";
            statement = (PreparedStatement) getConnection().prepareStatement(query);
            statement.setInt(1, id);
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
                tema = new Tema(
                        resultSet.getInt("id"), 
                        resultSet.getInt("id_docente"),
                        resultSet.getString("materia"),
                        resultSet.getString("titulo"),
                        resultSet.getString("descripcion"),
                        resultSet.getString("contenido"),
                        resultSet.getString("archivo"),
                        resultSet.getString("fecha")
                );
            }
        } catch (Exception e) {
            System.out.print(e);
        } finally {
            try {
            } catch (Exception e) {
                System.out.print(e);
            }
        }
        return tema;
    }
    
    public void add(int id_docente, String materia, String titulo, String descripcion, String contenido, String archivo, String fecha){
        PreparedStatement statement = null;
        try {
            String query = "INSERT INTO tema (id_docente, materia, titulo, descripcion, contenido, archivo, fecha) VALUES (?, ?, ?, ?, ?, ?, ?)";
            statement = (PreparedStatement) getConnection().prepareStatement(query);
            statement.setInt(1, id_docente);
            statement.setString(2, materia);
            statement.setString(3, titulo);
            statement.setString(4, descripcion);
            statement.setString(5, contenido);
            statement.setString(6, archivo);
            statement.setString(7, fecha);
            statement.executeUpdate();            
        } catch (SQLException ex) {
            Logger.getLogger(PublicacionModel.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
    
     public List<Tema> getAllMateria(String materia){
        ArrayList<Tema> temas = new ArrayList<>();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
            String query = "SELECT * FROM tema WHERE materia = ?";
            statement = (PreparedStatement) getConnection().prepareStatement(query);
            statement.setString(1, materia);
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Tema tema = new Tema(
                        resultSet.getInt("id"), 
                        resultSet.getInt("id_docente"),
                        resultSet.getString("materia"),
                        resultSet.getString("titulo"),
                        resultSet.getString("descripcion"),
                        resultSet.getString("contenido"),
                        resultSet.getString("archivo"),
                        resultSet.getString("fecha")
                );
                temas.add(tema);
            }
        } catch (Exception e) {
            System.out.print(e);
        } finally {
            try {
                
            } catch (Exception e) {
                System.out.print(e);
            }
        }
        return temas;
    } 
    
}