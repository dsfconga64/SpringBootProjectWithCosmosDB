package com.cenfotec.examenRepo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name = "tproduccion") 
public class Produccion {

		@Id  
		@GeneratedValue(strategy = GenerationType.IDENTITY)  
		public Long id;    
		
		@Column(name="cantidad_huevos")  
		private double cantidadHuevos;     
		
		@Column(name = "id_finca")
		private Long idFinca;
		
		
		public Produccion(double cantidadHuevos, long idFinca){
			 this.cantidadHuevos = cantidadHuevos;      
			 this.idFinca = idFinca;   
		}
		
		public Produccion() { 
			
		}
		
		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}
		

		public double getCantidadHuevos() {
			return cantidadHuevos;
		}

		public void setCantidadHuevos(double cantidadHuevos) {
			this.cantidadHuevos = cantidadHuevos;
		}
		
		public Long getIdFinca() {
			return idFinca;
		}

		public void setIdFinca(Long idFinca) {
			this.idFinca = idFinca;
		}
		
		
}


