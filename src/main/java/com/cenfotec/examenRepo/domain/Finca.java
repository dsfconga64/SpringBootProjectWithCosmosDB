package com.cenfotec.examenRepo.domain;

import javax.persistence.Column;
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.GenerationType; 
import javax.persistence.Id; 
import javax.persistence.Table;


@Entity 
@Table(name = "tfinca") 
public class Finca {

	@Id  
	@GeneratedValue(strategy = GenerationType.IDENTITY)  
	public Long id;    
	
	@Column(name="nombre")  
	private String nombre;    
	
	@Column(name="direccion")  
	private String direccion;    
	
	@Column(name="telefonos")  
	private String telefonos; 
	
	@Column(name="espacioTotal")  
	private double espacioTotal; 
 
 
	 public Finca(String nombre, String direccion, String telefonos, double espacioTotal){
		 this.nombre = nombre;      
		 this.direccion = direccion;      
		 this.telefonos = telefonos;
		 this.espacioTotal = espacioTotal;
	} 
	 
	public Finca() { 
		
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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
