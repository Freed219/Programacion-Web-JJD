package xyz.grupojdd.libreriabackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.grupojdd.libreriabackend.model.Autor;

public interface AutorRepository extends JpaRepository<Autor, Long>{
    
}
