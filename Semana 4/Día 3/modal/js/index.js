
function logout(elemento){
    console.log(elemento);
    alert("Estás cerrando sesión");
}

function cambiarFondo(elemento){
    elemento.classList.add('extra');
}

function devolverFondo(elemento){
    elemento.classList.remove('extra');
}

let botonesCerrar = document.querySelectorAll('.cerrar');

for(let i = 0; i < botonesCerrar.length; i ++){
    botonesCerrar[i].addEventListener('click', function(event){
        event.target.closest('.card-list-item').remove();
        let contadorConexiones = document.querySelector('#connectionRequestNumber');
        let numeroConexiones = Number(contadorConexiones.innerText);
        numeroConexiones --;
        contadorConexiones.innerText = numeroConexiones;
    });
}

function mostrarModal(elemento){
    let modal = document.querySelector('#modalEditarPerfil');
    modal.classList.remove('oculto');

    let contenidoPrincipal = document.querySelector('.main');
    contenidoPrincipal.classList.add('opacidadModal');

    let nombreUsuario = document.querySelector('#userName');
    let ciudad = document.querySelector('.city');
    let editarNombreUsuario = document.querySelector('#editarNombreUsuario');
    let editarCiudad = document.querySelector('#editarCiudad');
    
    editarNombreUsuario.value = nombreUsuario.innerText;
    editarCiudad.value = ciudad.innerText;
}

function actualizarInformacion(evento){
    evento.preventDefault();

    let modal = document.querySelector('#modalEditarPerfil');
    modal.classList.add('oculto');

    let contenidoPrincipal = document.querySelector('.main');
    contenidoPrincipal.classList.remove('opacidadModal');

    let nombreUsuario = document.querySelector('#userName');
    let ciudad = document.querySelector('.city');
    let editarNombreUsuario = document.querySelector('#editarNombreUsuario');
    let editarCiudad = document.querySelector('#editarCiudad');

    nombreUsuario.innerText = editarNombreUsuario.value;
    ciudad.innerText = editarCiudad.value;
}