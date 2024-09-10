
async function obtenerImagenes(evento){
    evento.preventDefault();
    let numImagenes = document.querySelector('#numImagenes').value;
    let url = "https://dog.ceo/api/breeds/image/random/" + numImagenes;
    let config = {
        method: 'GET'
    };

    let respuesta = await fetch(url, config);
    let datos = await respuesta.json();
  
    let resultados = document.querySelector('.resultados');
    resultados.innerHTML = "";
    
    for(let i = 0; i < datos.message.length; i ++){
        resultados.innerHTML += `<img class="imagenPerrito" src="${datos.message[i]}" alt="Imagen de perrito">`;
    }

}