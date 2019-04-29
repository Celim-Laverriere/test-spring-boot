package org.webservice.serviceweb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.webservice.model.Livre;
import org.webservice.services.LivreService;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.ArrayList;

@WebService(serviceName = "Livre")
@Controller
public class LivreWebService {

    @Autowired
    LivreService livreService;

    @WebMethod(operationName = "LivreList")
    public ArrayList<Livre> livreList(){
        ArrayList<Livre> livres = livreService.livreList();
        for (Livre livre : livres) {
            System.out.println(livre.getId());
            System.out.println(livre.getRef_bibliotheque());
            System.out.println(livre.getOuvrage_id());
        }
        return livres;
    }

    @WebMethod(operationName = "Test")
    public String testWebService(){
        String livres = livreService.testWebService();
        System.out.println(livres);
        return livres;
    }
}
