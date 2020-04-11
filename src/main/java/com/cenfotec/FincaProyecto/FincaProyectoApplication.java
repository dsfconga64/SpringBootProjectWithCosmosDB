package com.cenfotec.FincaProyecto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootApplication
@ComponentScan({ "com.cenfotec.FincaProyecto.service" })
public class FincaProyectoApplication {

	public static void main(String[] args) {
		SpringApplication.run(FincaProyectoApplication.class, args);
	}

}
