package xyz.grupojdd.libreriabackend.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name = "editorial")
public class Editorial {
    
    private int id;
    private String nombre;

}
