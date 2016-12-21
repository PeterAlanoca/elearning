package com.aprendizajeonline.model;

import com.aprendizajeonline.objetos.Estudiante;
import com.mysql.jdbc.PreparedStatement;
import com.aprendizajeonline.database.Conexion;
import com.aprendizajeonline.objetos.Docente;
import java.sql.ResultSet;

public class LoginModel extends Conexion{
    
    public Estudiante autenticacion(String correo, String ci){
        Estudiante estudiante = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
            String query = "select * from estudiante where correo = ? and ci = ? limit 1";
            statement = (PreparedStatement) getConnection().prepareStatement(query);
            statement.setString(1, correo);
            statement.setString(2, ci);
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
                estudiante = new Estudiante(
                        resultSet.getInt("id"), 
                        resultSet.getString("ci"),
                        resultSet.getString("nombre"),
                        resultSet.getString("paterno"),
                        resultSet.getString("materno"),
                        resultSet.getString("correo"),
                        resultSet.getString("celular"),
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
        return estudiante;
    }
    
    public Docente autenticacionDocente(String correo, String ci){
        Docente docente = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
            String query = "select * from docente where correo = ? and ci = ? limit 1";
            statement = (PreparedStatement) getConnection().prepareStatement(query);
            statement.setString(1, correo);
            statement.setString(2, ci);
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
