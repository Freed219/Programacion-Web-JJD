const password = document.getElementById('aligned-password')
const form = document.getElementById('form')
const errorElement = document.getElementById('error')

form.addEventListener('submit', (e)=>{
    let messages = []

    if(password.value.length <= 15) {
        messages.push('La contrasena debe contener minimo 15 caracteres')
    }

    if(password.value.length >= 20) {
        messages.push('La contrasena no puede contener mas de 20 caracteres')
    }

    if (messages.length >0) {
    e.preventDefault()  
    errorElement.innerText = messages.join(', ')
    }
})