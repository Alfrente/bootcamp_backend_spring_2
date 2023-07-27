package com.arroyo.tarea_programada.tarea;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TareaProgramada {

    @Scheduled(cron = "*/3 * * * * *")
    public void tareaProgramada(){
        System.out.println("Tarea programada ejecutada con éxito");
    }
}
