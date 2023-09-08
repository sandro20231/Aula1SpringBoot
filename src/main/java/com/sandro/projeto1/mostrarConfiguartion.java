package com.sandro.projeto1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class mostrarConfiguartion {
   @Bean(name="a")
    public metodo oi(){
        return new metodo() {
            @Override
            public void executar() {
                System.out.println("Sou a mensagem um");
            }
        };
   }

   @Bean(name="b")
    public metodo oi2(){
       return new metodo() {
           @Override
           public void executar() {
               System.out.println("sou a mensagem dois");
           }
       };
   }
   @Bean(name="c")
   public metodo oi3(){
       return new metodo() {
           @Override
           public void executar() {
               System.out.println("sou a respota numero 3");
           }
       };
   }

   @Bean(name = "d")
    public metodo oi4(){
       return new metodo() {
           @Override
           public void executar() {
               System.out.println("Sou a resposta numero 4");
           }
       };
   }
}
