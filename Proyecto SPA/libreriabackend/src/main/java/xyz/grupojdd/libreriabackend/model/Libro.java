package xyz.grupojdd.libreriabackend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "libro")
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private int paginas;
    private int year_creacion;

    @ManyToOne
    @JoinColumn (name = "id_autor")
    private Autor autor;
    @ManyToOne
    @JoinColumn (name = "id_editorial")
    private Editorial editorial;

    public Libro(String nombre, int paginas, int year_creacion, Autor autor, Editorial editorial) {
		super();
		this.nombre = nombre;
		this.paginas = paginas;
		this.year_creacion = year_creacion;
		this.autor = autor;
		this.editorial = editorial;
	}

	public Libro() {
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	public int getYear_creacion() {
		return year_creacion;
	}

	public void setYear_creacion(int year_creacion) {
		this.year_creacion = year_creacion;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public Editorial getEditorial() {
		return editorial;
	}
    
	public void setEstado(Editorial editorial) {
		this.editorial = editorial;
	}
    
}
