package com.aprendizajeonline.objetos;

public class Docente extends Persona{

    private String materia;
    
    public Docente() {
        this.materia = "";
    }

    public Docente(int id, String ci, String nombre, String paterno, String materno, String correo, String sexo, String materia) {
        super(id, ci, nombre, paterno, materno, correo, sexo);
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
    
}
