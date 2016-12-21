package com.aprendizajeonline.model;

import com.aprendizajeonline.database.Conexion;
import com.aprendizajeonline.objetos.Docente;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;

public class DocenteModel extends Conexion {
    
    public Docente getId(int id){
        Docente docente = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
            String query = "select * from docente where id = ? limit 1";
            statement = (PreparedStatement) getConnection().prepareStatement(query);
            statement.setInt(1, id);
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
                docente = new Docente(
                        resultSet.getInt("id"), 
                        resultSet.getString("ci"),
                        resultSet.getString("nombre"),
                        resultSet.getString("paterno"),
                        resultSet.getString("materno"),
                        resultSet.getString("correo"),
                        resultSet.getString("sexo"),
                        resultSet.getString("materia")
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
        return docente;
    }
    
    public Docente getMateria(String materia){
        Docente docente = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
            String query = "select * from docente where materia = ? limit 1";
            statement = (PreparedStatement) getConnection().prepareStatement(query);
            statement.setString(1, materia);
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
                docente = new Docente(
                        resultSet.getInt("id"), 
                        resultSet.getString("ci"),
                        resultSet.getString("nombre"),
                        resultSet.getString("paterno"),
                        resultSet.getString("materno"),
                        resultSet.getString("correo"),
                        resultSet.getString("sexo"),
                        resultSet.getString("materia")
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
        return docente;
    }

}
