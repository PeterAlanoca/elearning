package com.aprendizajeonline.objetos;

public class Tema {
    
    private int id, id_docente;
    private String materia, titulo, descripcion, contenido, archivo, fecha;

    public Tema() {
        this.id = 0;
        this.id_docente = 0;
        this.materia = "";
        this.titulo = "";
        this.descripcion = "";
        this.contenido = "";
        this.archivo = "";
        this.fecha = "";
    }

    public Tema(int id, int id_docente, String materia, String titulo, String descripcion, String contenido, String archivo, String fecha) {
        this.id = id;
        this.id_docente = id_docente;
        this.materia = materia;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.contenido = contenido;
        this.archivo = archivo;
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_docente() {
        return id_docente;
    }

    public void setId_docente(int id_docente) {
        this.id_docente = id_docente;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getArchivo() {
        return archivo;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

        
}
