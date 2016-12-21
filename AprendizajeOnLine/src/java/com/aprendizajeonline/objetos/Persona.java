package com.aprendizajeonline.objetos;

public class Persona {
        
    private int id;
    private String ci, nombre, paterno, materno, correo, sexo;

    public Persona() {
        this.id = 0;
        this.ci = "";
        this.nombre = "";
        this.paterno = "";
        this.materno = "";
        this.correo = "";
        this.sexo = "";
    }

    public Persona(int id, String ci, String nombre, String paterno, String materno, String correo, String sexo) {
        this.id = id;
        this.ci = ci;
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.correo = correo;
        this.sexo = sexo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    
    
    

}
