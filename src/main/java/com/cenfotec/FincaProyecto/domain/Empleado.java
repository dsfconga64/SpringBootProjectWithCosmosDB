package com.cenfotec.FincaProyecto.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
	
	@Entity 
	@Table(name = "templeado") 
	public class Empleado {

		@Id  
		@GeneratedValue(strategy = GenerationType.IDENTITY)  
		public Long id;    
		
		@Column(name="nombre")  
		private String nombre;    
		
		@Column(name="apellido")  
		private String apellido;    
		
		@Column(name="tipo")  
		private String tipo;    
		
		@Column(name = "id_finca")
		private Long idFinca;
		
		
		 public Empleado(String nombre, String apellido, String tipo, Long idFinca){
			 this.nombre = nombre;      
			 this.apellido = apellido;      
			 this.tipo = tipo;  
			 this.idFinca = idFinca;   
		} 
		 
		public Empleado() { 
			
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
		
		public String getApellido() {
			return apellido;
		}

		public void setApellido(String apellido) {
			this.apellido = apellido;
		}
		
		public String getTipo() {
			return tipo;
		}

		public void setTipo(String tipo) {
			this.tipo = tipo;
		}
		
		public Long getIdFinca() {
			return idFinca;
		}

		public void setIdFinca(Long idFinca) {
			this.idFinca = idFinca;
		}
		
	}

