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
export class AppComponent implements OnInit {
  title(title: any) {
    throw new Error('Method not implemented.');
  }

  LibroForm: FormGroup;
  editorial: any;
  autor: any;
  libros: any;

  constructor(
    public fb: FormBuilder,
    public autorService: AutorService,
    public editorialService: EditorialService,
    public libroService: LibroService
  ) {

  }
  ngOnInit(): void {
    this.LibroForm = this.fb.group({
      id: [''],
      nombre: ['', Validators.required],
      paginas: ['', Validators.required],
      year_creacion: ['', Validators.required],
      autor: ['', Validators.required],
      editorial: ['', Validators.required],
    });;

    this.editorialService.getAllEditoriales().subscribe(resp => {
      this.editorial = resp;
    },
      error => { console.error(error) }
    );

    this.autorService.getAllAutores().subscribe(resp => {
      this.autor = resp;
    },
      error => { console.error(error) }
    );

    this.libroService.getAllLibros().subscribe(resp => {
      this.libros = resp;
    },
      error => { console.error(error) }
    );

  }

  guardar(): void {
    this.libroService.saveLibro(this.LibroForm.value).subscribe(resp => {
      this.LibroForm.reset();
      this.libros=this.libros.filter(libro=> resp.id!==libro.id);
      this.libros.push(resp);
    },
      error => { console.error(error) }
    )
  }

  eliminar(libro){
    this.libroService.deleteLibro(libro.id).subscribe(resp=>{
      if(resp===true){
        this.libros.pop(libro)
      }
    })
  }

  editar(libro){
    this.LibroForm.setValue(
      {
        id: libro.id,
        nombre: libro.nombre,
        paginas: libro.paginas,
        year_creacion: libro.year_creacion,
        autor: libro.autor,
        editorial: libro.editorial,
      }
    )
  }

}

