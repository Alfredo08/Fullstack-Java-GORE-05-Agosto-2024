
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