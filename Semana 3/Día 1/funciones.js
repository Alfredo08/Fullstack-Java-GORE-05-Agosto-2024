
function sumarDosNumeros(num1, num2){
    let total = num1 + num2;
    return total;
}

let resultado = sumarDosNumeros(20, 50);
console.log(resultado);
let resultado2 = sumarDosNumeros(resultado, 30);
console.log(resultado2);

let persona = {
    nombre: "Alex",
    apellido: "Miller",
    edad: 25,
    ocupacion: "Maestro",
    clases: ['Fundamentos de la Web', "Python", "Java", "MERN"],
    experienciaAcademica: {
        universidad: "Tecnológico de Monterrey",
        semestres: 9,
        titulo: "Ingeniero en Sistemas"
    },
    imprimeNombreCompleto(){
        console.log(persona.nombre, persona.apellido);
    }
}

persona.imprimeNombreCompleto();