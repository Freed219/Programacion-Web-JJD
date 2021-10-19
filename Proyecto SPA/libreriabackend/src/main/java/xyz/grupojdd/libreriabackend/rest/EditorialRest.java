package xyz.grupojdd.libreriabackend.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import xyz.grupojdd.libreriabackend.model.Editorial;
import xyz.grupojdd.libreriabackend.service.EditorialService;

@RestController
@RequestMapping ("/editorial/")
public class EditorialRest {
    
    @Autowired
    private EditorialService editorialService;

    @GetMapping
    private ResponseEntity<List<Editorial>> getAllEditoriales (){
        return ResponseEntity.ok(editorialService.findAll());
    }

}
