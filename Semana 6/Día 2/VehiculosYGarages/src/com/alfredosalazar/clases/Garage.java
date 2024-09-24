package com.alfredosalazar.clases;

import java.util.ArrayList;

public class Garage {
	private ArrayList<Vehiculo> vehiculos;
	private int capacidad;
	
	public Garage(int capacidad) {
		this.vehiculos = new ArrayList<Vehiculo>();
		this.capacidad = capacidad;
	}
	
	public void agregarVehiculo(Vehiculo vehiculoNuevo) {
		if(this.capacidad > 0) {
			vehiculos.add(vehiculoNuevo);
			this.capacidad --;
		}
		else {
			System.out.println("¡Ya no hay espacio en este Garage!");
		}
	}
	
	public void mostrarVehiculos() {
		for(int i = 0; i < this.vehiculos.size(); i ++) {
			this.vehiculos.get(i).despliegaInformacion();
		}
	}
	
	public void mostrarVehiculos2() {
		for(Vehiculo carro : this.vehiculos) {
			carro.despliegaInformacion();
		}
	}

	public ArrayList<Vehiculo> getVehiculos() {
		return vehiculos;
	}

	public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
		this.vehiculos = vehiculos;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	
	
}
