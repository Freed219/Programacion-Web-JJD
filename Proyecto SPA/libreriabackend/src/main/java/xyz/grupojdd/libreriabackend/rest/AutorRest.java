package xyz.grupojdd.libreriabackend.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import xyz.grupojdd.libreriabackend.model.Autor;
import xyz.grupojdd.libreriabackend.service.AutorService;

@RestController
@RequestMapping ("/autor/")
public class AutorRest {
    
    @Autowired
    private AutorService autorService;

    @GetMapping
    private ResponseEntity<List<Autor>> getAllAutores (){
        return ResponseEntity.ok(autorService.findAll());
    }

}
