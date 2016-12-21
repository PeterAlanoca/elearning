package com.aprendizajeonline.objetos;

public class Estudiante extends Persona{

    private String celular, materia;
    
    public Estudiante() {
        this.celular = "";
        this.materia = "";
    }

    public Estudiante(int id, String ci, String nombre, String paterno, String materno, String correo, String celular, String sexo, String materia) {
        super(id, ci, nombre, paterno, materno, correo, sexo);
        this.celular = celular;
        this.materia = materia;
    }
    
    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
    
    
    
    
    
}
