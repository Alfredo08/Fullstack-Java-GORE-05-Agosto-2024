alert("Cargando Reporte del Clima");

let botonCookie = document.querySelector('.cookieAcepto');

botonCookie.addEventListener('click', function(evento){
    evento.target.closest('footer').remove();
});

function cargarInformacion(elemento, ciudad){
    let elementoMain = document.querySelector('main');

    if(ciudad === "Buenos Aires"){
        elementoMain.innerHTML = `
            <h1> Buenos Aires </h1>
            <div class="semana">
                <div class="dia">
                    <img src='./../imagenes/nublado.png' alt='Nublado' >
                    <h2> Hoy </h2>
                    <p> Nublado </p>
                    <div class="temperatura">
                        22ºC 15ºC
                    </div>
                </div>
                <div class="dia">
                    <img src='./../imagenes/lluvioso.png' alt='Lluvioso' >
                    <h2> Mañana </h2>
                    <p> Lluvioso </p>
                    <div class="temperatura">
                        20ºC 13ºC
                    </div>
                </div>
                <div class="dia">
                    <img src='./../imagenes/tormenta.png' alt='Tormenta' >
                    <h2> Miércoles </h2>
                    <p> Tormentas </p>
                    <div class="temperatura">
                        18ºC 11ºC
                    </div>
                </div>
                <div class="dia">
                    <img src='./../imagenes/nublado.png' alt='Nublado' >
                    <h2> Jueves </h2>
                    <p> Parcialmente nublado </p>
                    <div class="temperatura">
                        21ºC 14ºC
                    </div>
                </div>
                <div class="dia">
                    <img src='./../imagenes/soleado.png' alt='Soleado' >
                    <h2> Viernes </h2>
                    <p> Soleado </p>
                    <div class="temperatura">
                        24ºC 17ºC
                    </div>
                </div>
            </div>
        `;
    }
    else if(ciudad === "Ciudad de Mexico"){
        elementoMain.innerHTML = `
        <h1> Ciudad de México </h1>
        <div class="semana">
            <div class="dia">
                <img src='./../imagenes/soleado.png' alt='Soleado' >
                <h2> Hoy </h2>
                <p> Soleado </p>
                <div class="temperatura">
                    28ºC 19ºC
                </div>
            </div>
            <div class="dia">
                <img src='./../imagenes/nublado.png' alt='Nublado' >
                <h2> Mañana </h2>
                <p> Nublado </p>
                <div class="temperatura">
                    26ºC 18ºC
                </div>
            </div>
            <div class="dia">
                <img src='./../imagenes/lluvioso.png' alt='Lluvioso' >
                <h2> Miércoles </h2>
                <p> Lluvioso </p>
                <div class="temperatura">
                    24ºC 17ºC
                </div>
            </div>
            <div class="dia">
                <img src='./../imagenes/tormenta.png' alt='Tormenta' >
                <h2> Jueves </h2>
                <p> Tormenta </p>
                <div class="temperatura">
                    22ºC 16ºC
                </div>
            </div>
            <div class="dia">
                <img src='./../imagenes/nublado.png' alt='Nublado' >
                <h2> Viernes </h2>
                <p> Parcialmente nublado </p>
                <div class="temperatura">
                    25ºC 18ºC
                </div>
            </div>
        </div>
    `;
    }
    else if(ciudad === "Santiago"){
        elementoMain.innerHTML = `
            <h1> Santiago </h1>
            <div class="semana">
                <div class="dia">
                    <img src='./../imagenes/nublado.png' alt='Nublado' >
                    <h2> Hoy </h2>
                    <p> Parcialmente nublado </p>
                    <div class="temperatura">
                        23ºC 16ºC
                    </div>
                </div>
                <div class="dia">
                    <img src='./../imagenes/soleado.png' alt='Soleado' >
                    <h2> Mañana </h2>
                    <p> Soleado </p>
                    <div class="temperatura">
                        26ºC 18ºC
                    </div>
                </div>
                <div class="dia">
                    <img src='./../imagenes/nublado.png' alt='Nublado' >
                    <h2> Miércoles </h2>
                    <p> Nublado </p>
                    <div class="temperatura">
                        24ºC 17ºC
                    </div>
                </div>
                <div class="dia">
                    <img src='./../imagenes/lluvioso.png' alt='Lluvioso' >
                    <h2> Jueves </h2>
                    <p> Lluvioso </p>
                    <div class="temperatura">
                        22ºC 15ºC
                    </div>
                </div>
                <div class="dia">
                    <img src='./../imagenes/tormenta.png' alt='Tormenta' >
                    <h2> Viernes </h2>
                    <p> Tormenta </p>
                    <div class="temperatura">
                        20ºC 13ºC
                    </div>
                </div>
            </div>
        `;
    }
    else if(ciudad === "Sao Paulo"){
        elementoMain.innerHTML = `
        <h1> Sao Paulo </h1>
        <div class="semana">
            <div class="dia">
                <img src='./../imagenes/tormenta.png' alt='Tormenta' >
                <h2> Hoy </h2>
                <p> Tormenta </p>
                <div class="temperatura">
                    17ºC 10ºC
                </div>
            </div>
            <div class="dia">
                <img src='./../imagenes/nublado.png' alt='Nublado' >
                <h2> Mañana </h2>
                <p> Parcialmente nublado </p>
                <div class="temperatura">
                    19ºC 14ºC
                </div>
            </div>
            <div class="dia">
                <img src='./../imagenes/soleado.png' alt='Soleado' >
                <h2> Miércoles </h2>
                <p> Soleado </p>
                <div class="temperatura">
                    22ºC 15ºC
                </div>
            </div>
            <div class="dia">
                <img src='./../imagenes/nublado.png' alt='Nublado' >
                <h2> Jueves </h2>
                <p> Nublado </p>
                <div class="temperatura">
                    20ºC 13ºC
                </div>
            </div>
            <div class="dia">
                <img src='./../imagenes/lluvioso.png' alt='Lluvioso' >
                <h2> Viernes </h2>
                <p> Lluvioso </p>
                <div class="temperatura">
                    18ºC 12ºC
                </div>
            </div>
        </div>
    `;
    }
    else {
        elementoMain.innerHTML = `
        <h1> Quito </h1>
        <div class="semana">
            <div class="dia">
                <img src='./../imagenes/lluvioso.png' alt='Lluvioso' >
                <h2> Hoy </h2>
                <p> Lluvioso </p>
                <div class="temperatura">
                    26ºC 19ºC
                </div>
            </div>
            <div class="dia">
                <img src='./../imagenes/tormenta.png' alt='Tormenta' >
                <h2> Mañana </h2>
                <p> Tormenta </p>
                <div class="temperatura">
                    25ºC 18ºC
                </div>
            </div>
            <div class="dia">
                <img src='./../imagenes/nublado.png' alt='Nublado' >
                <h2> Miércoles </h2>
                <p> Parcialmente nublado </p>
                <div class="temperatura">
                    27ºC 20ºC
                </div>
            </div>
            <div class="dia">
                <img src='./../imagenes/soleado.png' alt='Soleado' >
                <h2> Jueves </h2>
                <p> Soleado </p>
                <div class="temperatura">
                    30ºC 22ºC
                </div>
            </div>
            <div class="dia">
                <img src='./../imagenes/nublado.png' alt='Nublado' >
                <h2> Viernes </h2>
                <p> Nublado </p>
                <div class="temperatura">
                    28ºC 21ºC
                </div>
            </div>
        </div>`;
    }
}