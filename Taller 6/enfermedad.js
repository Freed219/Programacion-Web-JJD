var InputEnfermedad = document.getElementById("checkbox-contagiosa");
InputEnfermedad.addEventListener("change", enfermedad, false);
function enfermedad()
{
  var checked = InputEnfermedad.checked;
  if(checked){
    document.getElementById("aligned-enfermedad").style.display = "block";
  }
  else{
    document.getElementById("aligned-enfermedad").style.display = "none";
  }
}

var InputSelect = document.getElementById("box")
InputSelect.onclick = function() {
  if(InputSelect.value=="valor-si"){
    document.getElementById("message8").style.display = "block";
  }
  else{
    document.getElementById("message8").style.display = "none";
  }
}

