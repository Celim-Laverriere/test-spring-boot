package org.webservice;

import org.hibernate.service.spi.InjectService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.webservice.model.Livre;
import org.webservice.serviceweb.LivreWebService;

import java.util.List;


@Configuration
@EnableAutoConfiguration
@ComponentScan("org.webservice")
public class BibliothequeApplication {

    public static void main(String[] args){
        ApplicationContext context = SpringApplication.run(BibliothequeApplication.class);

//        LivreRepository livreRepository = context.getBean(LivreRepository.class);
//
//        List<Livre> livreList = livreRepository.findAll();
//
//        for (Livre livre : livreList) {
//            System.out.println(livre.getId());
//            System.out.println(livre.getRef_bibliotheque());
//            System.out.println(livre.getOuvrage_id());
//        }
        LivreWebService livreWebService = context.getBean(LivreWebService.class);
        List<Livre> livreList2 = livreWebService.livreList();

        for (Livre livre : livreList2) {
            System.out.println(livre.getId());
            System.out.println(livre.getRef_bibliotheque());
            System.out.println(livre.getOuvrage_id());
        }

    }
}
