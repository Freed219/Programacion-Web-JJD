package xyz.grupojdd.libreriabackend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "libro")
public class Libro {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nombre;
    private String paginas;
    private String year_creacion;
    private boolean vivo;

    private Autor autor;
    private Editorial editorial;
    
}
