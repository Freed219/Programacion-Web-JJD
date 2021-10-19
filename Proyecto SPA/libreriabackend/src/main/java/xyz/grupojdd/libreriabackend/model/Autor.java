package xyz.grupojdd.libreriabackend.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name = "autor")
public class Autor {

    private int id;
    private String nombre;
    private String fecha_nacimiento;
    private boolean vivo;

}
