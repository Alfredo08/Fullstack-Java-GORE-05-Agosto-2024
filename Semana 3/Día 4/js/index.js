alert("Cargando Reporte del Clima");

let botonCookie = document.querySelector('.cookieAcepto');

botonCookie.addEventListener('click', function(evento){
    evento.target.closest('footer').remove();
});

let informacionClima = {
    'Buenos Aires': [
        {
            imagen: './imagenes/nublado.png',
            pronostico: 'Nublado',
            temperaturas: '22ºC 15ºC'
        },
        {
            imagen: './imagenes/lluvioso.png',
            pronostico: 'Lluvioso',
            temperaturas: '20ºC 13ºC'
        },
        {
            imagen: './imagenes/tormenta.png',
            pronostico: 'Tormentas',
            temperaturas: '18ºC 11ºC'
        },
        {
            imagen: './imagenes/nublado.png',
            pronostico: 'Parcialmente nublado',
            temperaturas: '21ºC 14ºC'
        },
        {
            imagen: './imagenes/soleado.png',
            pronostico: 'Soleado',
            temperaturas: '24ºC 17ºC'
        }
    ],
    'Ciudad de México': [
        {
            imagen: './imagenes/soleado.png',
            pronostico: 'Soleado',
            temperaturas: '28ºC 19ºC'
        },
        {
            imagen: './imagenes/nublado.png',
            pronostico: 'Nublado',
            temperaturas: '26ºC 18ºC'
        },
        {
            imagen: './imagenes/lluvioso.png',
            pronostico: 'Lluvioso',
            temperaturas: '24ºC 17ºC'
        },
        {
            imagen: './imagenes/tormenta.png',
            pronostico: 'Tormentas',
            temperaturas: '22ºC 16ºC'
        },
        {
            imagen: './imagenes/nublado.png',
            pronostico: 'Parcialmente nublado',
            temperaturas: '25ºC 18ºC'
        }
    ]
}

function cargarInformacion(elemento, ciudad){
    document.querySelector('main').classList.remove('ocultar');
    
    let nombreDeLaCiudad = document.querySelector('#nombre_ciudad');
    nombreDeLaCiudad.innerText = ciudad;

    let imagenDiasDeLaSemana = document.querySelectorAll('.dia_semana');
    let pronosticosDeLaSemana = document.querySelectorAll('.dia_pronostico');
    let temperaturasDeLaSemana = document.querySelectorAll('.dia_temperaturas');

    for(let i = 0; i < imagenDiasDeLaSemana.length; i ++){
        imagenDiasDeLaSemana[i].src = informacionClima[ciudad][i].imagen;
        pronosticosDeLaSemana[i].innerText = informacionClima[ciudad][i].pronostico;
        temperaturasDeLaSemana[i].innerText = informacionClima[ciudad][i].temperaturas;
    } 
}