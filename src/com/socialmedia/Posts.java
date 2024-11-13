package com.socialmedia;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Posts {
    private Date date;
    private List<Comments> comments;
    private String tipo;
    private String contenido;
    private String titulo;
    private int ancho;
    private int alto;
    private String calidad;
    private int duracion;

    public Posts(String tipo, String contenido, String titulo, int ancho, int alto, String calidad, int duracion) {
        this.date = new Date();
        this.comments = new ArrayList<>();
        this.tipo = tipo;
        this.contenido = contenido;
        this.titulo = titulo;
        this.ancho = ancho;
        this.alto = alto;
        this.calidad = calidad;
        this.duracion = duracion;
    }
}
