var InputPassword = document.getElementById("aligned-password");
var InputConfirmarPassword = document.getElementById("aligned-confirmarpassword");
var letter = document.getElementById("letter");
var capital = document.getElementById("capital");
var number = document.getElementById("number");
var length = document.getElementById("length");
var igual = document.getElementById("igual");
var InputEmail = document.getElementById("aligned-email");
var email = document.getElementById("email")

// When the user clicks on the password field, show the message box
InputPassword.onfocus = function() {
  document.getElementById("message").style.display = "block";
}

// When the user clicks outside of the password field, hide the message box
InputPassword.onblur = function() {
  document.getElementById("message").style.display = "none";
}

InputPassword.onkeyup = function() {
    // Validate lowercase letters
    var lowerCaseLetters = /[a-z]/g;
    if(InputPassword.value.match(lowerCaseLetters)) {
      letter.classList.remove("invalid");
      letter.classList.add("valid");
    } else {
      letter.classList.remove("valid");
      letter.classList.add("invalid");
  }
  
    // Validate capital letters
    var upperCaseLetters = /[A-Z]/g;
    if(InputPassword.value.match(upperCaseLetters)) {
      capital.classList.remove("invalid");
      capital.classList.add("valid");
    } else {
      capital.classList.remove("valid");
      capital.classList.add("invalid");
    }
  
    // Validate numbers
    var numbers = /[0-9]/g;
    if(InputPassword.value.match(numbers)) {
      number.classList.remove("invalid");
      number.classList.add("valid");
    } else {
      number.classList.remove("valid");
      number.classList.add("invalid");
    }
  
    // Validate length
    if(InputPassword.value.length >= 15 && InputPassword.value.length <=20) {
      length.classList.remove("invalid");
      length.classList.add("valid");
    }
    else {
      length.classList.remove("valid");
      length.classList.add("invalid");
    }
  }

InputConfirmarPassword.onfocus = function() {
  document.getElementById("message2").style.display = "block";
}

// When the user clicks outside of the password field, hide the message box
InputConfirmarPassword.onblur = function() {
  document.getElementById("message2").style.display = "none";
}

InputConfirmarPassword.onkeyup = function() {
  var pw1 = document.getElementById("aligned-password");
  var pw2 = document.getElementById("aligned-confirmarpassword");
  if(pw2 = pw1) {
      igual.classList.remove("invalid");
      igual.classList.add("valid");
    } else {
      igual.classList.remove("valid");
      igual.classList.add("invalid");
  }
}

InputEmail.onfocus = function() {
  document.getElementById("message3").style.display = "block";
}

// When the user clicks outside of the password field, hide the message box
InputEmail.onblur = function() {
  document.getElementById("message3").style.display = "none";
}

InputEmail.onkeyup = function() {
  if(InputEmail.value.length <= 120) {
    email.classList.remove("invalid");
    email.classList.add("valid");
  }
  else {
    email.classList.remove("valid");
    email.classList.add("invalid");
  }
}