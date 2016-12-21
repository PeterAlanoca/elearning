package com.aprendizajeonline.model;

import com.aprendizajeonline.objetos.Estudiante;
import com.mysql.jdbc.PreparedStatement;
import com.aprendizajeonline.database.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EstudianteModel extends Conexion {
    
    public Estudiante getId(int id){
        Estudiante estudiante = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
            String query = "select * from estudiante where id = ? limit 1";
            statement = (PreparedStatement) getConnection().prepareStatement(query);
            statement.setInt(1, id);
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
    
    public List<Estudiante> getMateria(String materia){
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
            String query = "SELECT * FROM estudiante WHERE materia = ?";
            statement = (PreparedStatement) getConnection().prepareStatement(query);
            statement.setString(1, materia);
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Estudiante estudiante = new Estudiante(
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
                estudiantes.add(estudiante);
            }
        } catch (Exception e) {
            System.out.print(e);
        } finally {
            try {
                
            } catch (Exception e) {
                System.out.print(e);
            }
        }
        return estudiantes;
    } 
        
    public List<Usuario> getAll(){
        ArrayList<Usuario> listUsuarios = new ArrayList<>();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
            String query = "select * from usuario";
            statement = (PreparedStatement) getConnection().prepareStatement(query);
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Usuario usuario = new Usuario(
                        resultSet.getInt("id"), 
                        resultSet.getString("username"),
                        resultSet.getString("password"),
                        resultSet.getString("nombre"),
                        resultSet.getString("apellido"),
                        resultSet.getString("correo"),
                        resultSet.getString("foto"),
                        resultSet.getString("siguiendo"),
                        resultSet.getString("seguidores")
                );
                listUsuarios.add(usuario);
            }
        } catch (Exception e) {
            System.out.print(e);
        } finally {
            try {
                
            } catch (Exception e) {
                System.out.print(e);
            }
        }
        return listUsuarios;
    }
    
    public void add(String ci, String nombre, String paterno, String materno, String correo, String celular, String sexo, String materia){
        PreparedStatement statement = null;
        try {
            String query = "INSERT INTO estudiante (ci, nombre, paterno, materno, correo, celular, sexo, materia) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            statement = (PreparedStatement) getConnection().prepareStatement(query);
            statement.setString(1, ci);
            statement.setString(2, nombre);
            statement.setString(3, paterno);
            statement.setString(4, materno);
            statement.setString(5, correo);
            statement.setString(6, celular);
            statement.setString(7, sexo);
            statement.setString(8, materia);
            statement.executeUpdate();            
        } catch (SQLException ex) {
            Logger.getLogger(PublicacionModel.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
    
}
