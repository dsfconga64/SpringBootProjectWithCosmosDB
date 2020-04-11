package com.cenfotec.FincaProyecto.domain;



import org.springframework.data.annotation.Id;

import com.microsoft.azure.spring.data.cosmosdb.core.mapping.Document;

	@Document(collection = "tEmpleado")
	public class Empleado {

		@Id  
		public String id;    
		
		 
		private String nombre;    
		
		  
		private String apellido;    
		
		  
		private String tipo;    
		
		
		private Long idFinca;
		
		
		 public Empleado(String nombre, String apellido, String tipo, Long idFinca){
			 this.nombre = nombre;      
			 this.apellido = apellido;      
			 this.tipo = tipo;  
			 this.idFinca = idFinca;   
		} 
		 
		public Empleado() { 
			
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

