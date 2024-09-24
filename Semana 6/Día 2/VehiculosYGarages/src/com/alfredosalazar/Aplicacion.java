package com.alfredosalazar;

import com.alfredosalazar.clases.Garage;
import com.alfredosalazar.clases.Vehiculo;

public class Aplicacion {

	public static void main(String[] args) {
		Vehiculo corolla = new Vehiculo("Toyota", "Corolla", 2020);
		Vehiculo territory = new Vehiculo("Ford", "Territory", 2024);
		Vehiculo camry = new Vehiculo("Toyota", "Camry", 2021);
		
		Garage cocheraDeCasa = new Garage(2);
		
		System.out.println("Capacidad disponible del garage: " + cocheraDeCasa.getCapacidad());
		
		cocheraDeCasa.agregarVehiculo(corolla);
		cocheraDeCasa.agregarVehiculo(territory);
		
		cocheraDeCasa.mostrarVehiculos();
		
		System.out.println("Capacidad disponible del garage: " + cocheraDeCasa.getCapacidad());
		
		cocheraDeCasa.agregarVehiculo(camry);
	}
}
