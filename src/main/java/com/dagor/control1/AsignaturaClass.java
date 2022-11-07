package com.dagor.control1;

public class AsignaturaClass implements Asignatura{
	
	private String nombreAsingatura;
	private double importe;
	
	public AsignaturaClass(String nombreAsignatura, double importe) {
		this.nombreAsingatura = nombreAsignatura;
		this.importe = importe;
	}

	@Override
	public double getImporte() {
		return importe;
	}

}
