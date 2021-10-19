package xyz.grupojdd.libreriabackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.grupojdd.libreriabackend.model.Editorial;

public interface EditorialRepository extends JpaRepository<Editorial, Long>{
    
}
