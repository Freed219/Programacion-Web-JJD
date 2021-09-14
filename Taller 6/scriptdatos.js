var InputNombre = document.getElementById("aligned-name");
var InputApellido = document.getElementById("aligned-surname");
var InputDireccion = document.getElementById("aligned-direccion");


InputNombre.onfocus = function() {
  document.getElementById("message4").style.display = "block";
}

InputNombre.onblur = function() {
  document.getElementById("message4").style.display = "none";
}

InputNombre.onkeyup = function() {
  if(InputNombre.value.length <= 25) {
   nombre.classList.remove("invalid");
   nombre.classList.add("valid");
  }
  else {
   nombre.classList.remove("valid");
   nombre.classList.add("invalid");
  }
}

InputApellido.onfocus = function() {
  document.getElementById("message5").style.display = "block";
}

InputApellido.onblur = function() {
  document.getElementById("message5").style.display = "none";
}

InputApellido.onkeyup = function() {
  if(InputApellido.value.length <= 25) {
   apellido.classList.remove("invalid");
   apellido.classList.add("valid");
  }
  else {
   apellido.classList.remove("valid");
   apellido.classList.add("invalid");
  }
}

InputDireccion.onfocus = function() {
  document.getElementById("message6").style.display = "block";
}

InputDireccion.onblur = function() {
  document.getElementById("message6").style.display = "none";
}

InputDireccion.onkeyup = function() {
  var carreteras = /^(cll|cra|av|anv|trans)/gi;
  if(InputDireccion.value.match(carreteras)) {
   direccion.classList.remove("invalid");
   direccion.classList.add("valid");
  }
  else {
   direccion.classList.remove("valid");
   direccion.classList.add("invalid");
  }
}