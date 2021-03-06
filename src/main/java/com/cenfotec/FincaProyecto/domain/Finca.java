package com.cenfotec.FincaProyecto.domain;



import org.springframework.data.annotation.Id;

import com.microsoft.azure.spring.data.cosmosdb.core.mapping.Document;

@Document(collection = "tFinca")

public class Finca {

	@Id    
	public String id;    
	
	
	private String nombre;    
	
	  
	private String direccion;    
	
	  
	private String telefonos; 
	
	  
	private double espacioTotal; 
 
 
	 public Finca(String nombre, String direccion, String telefonos, double espacioTotal){
		 this.nombre = nombre;      
		 this.direccion = direccion;      
		 this.telefonos = telefonos;
		 this.espacioTotal = espacioTotal;
	} 
	 
	public Finca() { 
		
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public String getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(String telefonos) {
		this.telefonos = telefonos;
	}
	
	public double getEspacioTotal() {
		return espacioTotal;
	}

	public void setEspacioTotal(double espacioTotal) {
		this.espacioTotal = espacioTotal;
	}
 
}
