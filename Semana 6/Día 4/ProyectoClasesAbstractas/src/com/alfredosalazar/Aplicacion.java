package com.alfredosalazar;

import com.alfredosalazar.clases.Debito;

public class Aplicacion {
	
	public static void main(String args[]) {
		Debito tarjetaAlex = new Debito("Alex Miller", 1000.0, "1234-1234-1234-1234");
		
		tarjetaAlex.imprimeInformacion();
		
		tarjetaAlex.despositar(1500.0);
		
		tarjetaAlex.imprimeInformacion();
		
		tarjetaAlex.retirar(1200.0);
		
		tarjetaAlex.imprimeInformacion();
		
		tarjetaAlex.retirar(4200.0);
		
		tarjetaAlex.imprimeInformacion();
	}
}
