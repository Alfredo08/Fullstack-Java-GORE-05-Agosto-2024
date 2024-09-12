let alex = {
    nombre: "Alejandro",
    apellido: "Miller",
    edad: 25,
    curso: "Fundamentos de la Web",
    imprimeInformacion(){
        console.log(alex.nombre, alex.apellido, alex.edad, alex.curso);
    }
}

// alex.imprimeInformacion();

class Estudiante{
    // El método constructor
    constructor(nom, ape, edad, cur){
        // Atributos
        this.nombre = nom;
        this.apellido = ape;
        this.edad = edad;
        this.curso = cur;
    }

    // Métodos de instancia
    imprimeInformacion(){
        console.log(this.nombre, this.apellido, this.edad, this.curso);
    }

    actualizarEdad(num){
        this.edad += num;
    }
}

// Objetos
let martha = new Estudiante("Martha", "Gómez", 22, "Fullstack Java");
let roger = new Estudiante("Roger", "Anderson", 23, "Python/Flask");
let julieta = new Estudiante("Julieta", "Vargas", 24, "Fundamentos de la Web");

martha.imprimeInformacion();
martha.actualizarEdad(3);
martha.imprimeInformacion();
roger.imprimeInformacion();
julieta.imprimeInformacion();