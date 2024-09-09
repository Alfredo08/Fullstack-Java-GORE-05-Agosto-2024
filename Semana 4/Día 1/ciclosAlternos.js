let nombres = ["Alejandro Miller", "Martha Gómez", "Julieta Vargas", "Alan Morales", "Martha García"];

for(let nombre of nombres){
    console.log(nombre);
}

console.log("---------");

let estudiante = {
    nombre: "Roger",
    apellido: "Infante",
    edad: 23,
    curso: "Fundamentos de la Web",
    id: 12345
};

for(let propiedad in estudiante){
    console.log(propiedad, estudiante[propiedad]);
} 