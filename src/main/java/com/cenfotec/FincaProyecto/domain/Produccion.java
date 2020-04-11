package com.cenfotec.FincaProyecto.domain;



import org.springframework.data.annotation.Id;

import com.microsoft.azure.spring.data.cosmosdb.core.mapping.Document;

@Document(collection = "tProduccion")

public class Produccion {

		@Id  
		public String id;    
		
  
		private double cantidadHuevos;     
		

		private Long idFinca;
		
		
		public Produccion(double cantidadHuevos, long idFinca){
			 this.cantidadHuevos = cantidadHuevos;      
			 this.idFinca = idFinca;   
		}
		
		public Produccion() { 
			
		}
		
		public String getId() {
			return id;
		}

		public void setId(String id) {
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


