
let nombres = ["Alejandro Miller", "Martha Gómez", "Julieta Vargas", "Alan Morales", "Martha García"];
/*
nombres.forEach(function(nom, i){
    console.log(nom, i);
});
*/
let personas = nombres.map(function(nombre, indice){
    let nombreApellido = nombre.split(" ");
    let obj = {
        nombre: nombreApellido[0],
        apellido: nombreApellido[1],
        id: indice
    };
    return obj;
});

console.log(personas);
/*
[
  { nombre: 'Alejandro', apellido: 'Miller', id: 0 },
  { nombre: 'Martha', apellido: 'Gómez', id: 1 },
  { nombre: 'Julieta', apellido: 'Vargas', id: 2 },
  { nombre: 'Alan', apellido: 'Morales', id: 3 },
  { nombre: 'Martha', apellido: 'García', id: 4 }
]
*/
let encontrado = personas.find(function(obj){
    if(obj.nombre === "Martha"){
        return obj;
    }
});
// console.log(encontrado);

let informacionNombresMartha = personas.filter(function(obj){
    if(obj.nombre === "María"){
        return obj;
    }
});

console.log(informacionNombresMartha);