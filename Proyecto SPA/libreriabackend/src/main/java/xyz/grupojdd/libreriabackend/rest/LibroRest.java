package xyz.grupojdd.libreriabackend.rest;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import xyz.grupojdd.libreriabackend.model.Libro;
import xyz.grupojdd.libreriabackend.service.LibroService;

@RestController
@RequestMapping ("/libro/")
public class LibroRest {

    @Autowired
    private LibroService libroService;

    @GetMapping
    private ResponseEntity<List<Libro>> getAllLibros (){
        return ResponseEntity.ok(libroService.findAll());
    }

    @PostMapping
    private ResponseEntity<Libro> saveLibro (@RequestBody Libro libro){

        try {

            Libro libroSaved = libroService.save(libro);
            return ResponseEntity.created(new URI("/libro/"+libroSaved.getId())).body(libroSaved);

        } catch (Exception e) {

            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
            
        }
    }
    
}
