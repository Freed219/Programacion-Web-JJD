var InputUsername = document.getElementById("aligned-user");
var letter = document.getElementById("letter");
var capital = document.getElementById("capital");
var number = document.getElementById("number");
var length = document.getElementById("length");
var igual = document.getElementById("igual");
var InputEmail = document.getElementById("aligned-email");
var email = document.getElementById("email")

InputUsername.onkeyup = function() {
    // Validate length
    if(InputUsername.value.length >= 15 && InputUsername.value.length <=20) {
      length.classList.remove("invalid");
      length.classList.add("valid");
    }
    else {
      length.classList.remove("valid");
      length.classList.add("invalid");
    }
  }
