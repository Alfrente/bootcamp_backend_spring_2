package com.arroyo.tarea_programada;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class TareaProgramadaApplication {

	public static void main(String[] args) {
		SpringApplication.run(TareaProgramadaApplication.class, args);
	}

}
