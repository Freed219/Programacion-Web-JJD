package xyz.grupojdd.libreriabackend.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name = "libro")
public class Libro {

    private int id;
    private String nombre;
    private String paginas;
    private String year_creacion;
    private boolean vivo;

    private Autor autor;
    private Editorial editorial;
    
}
