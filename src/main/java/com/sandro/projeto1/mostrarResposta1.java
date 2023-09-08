package com.sandro.projeto1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

public class mostrarResposta1 {
    @Resposta4
    private metodo um;

    @Autowired
    @Qualifier("b")
    private metodo dois;


    @Bean
    public CommandLineRunner executar2(){
        return args ->{
            this.um.executar();
            this.dois.executar();
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(mostrarResposta1.class, args);
    }
}
