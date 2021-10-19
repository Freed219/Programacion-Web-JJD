package xyz.grupojdd.libreriabackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.grupojdd.libreriabackend.model.Libro;

public interface LibroRepository extends JpaRepository<Libro, Long>{
    
}
