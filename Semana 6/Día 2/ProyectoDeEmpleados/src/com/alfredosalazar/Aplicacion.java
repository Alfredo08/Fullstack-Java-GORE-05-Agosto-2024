package com.alfredosalazar;

import com.alfredosalazar.clases.Empleado;

public class Aplicacion {

	public static void main(String[] args) {
		System.out.println("Número de empleados: " + Empleado.getNumDeEmpleados());
		
		Empleado roger = new Empleado("Roger", "Infante", "Maestro", 30000.0, 12345);
		Empleado martha = new Empleado("Martha", "Gómez", "Desarrolladora Web", 45000.0, 23234);
		Empleado alan = new Empleado();
		
		System.out.println("Número de empleados: " + Empleado.getNumDeEmpleados());

		roger.imprimeInformacion();
		martha.imprimeInformacion();
		alan.imprimeInformacion();
		
		roger.aumentoDeSueldo(5);
		martha.aumentoDeSueldo(5, 5000.0);
		
		roger.imprimeInformacion();
		martha.imprimeInformacion();
	
	}
}
