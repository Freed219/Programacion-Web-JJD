import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { AutorService } from './services/Autor/autor.service';
import { EditorialService } from './services/Editorial/editorial.service';
import { LibroService } from './services/Libro/libro.service';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  
  autorForm: FormGroup;


constructor(
  public fb: FormBuilder,
  public autorService: AutorService,
  public editorialService: EditorialService,
  public libroService: LibroService
){

}
ngOnInit(): void {
  this.autorForm = this.fb.group({
  nombre : ['', Validators.required],
  id : ['',Validators.required],
 

})
}
guardar(): void{
  
}
}
