package org.webservice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.webservice.model.Livre;
import org.webservice.repository.LivreRepository;

import java.util.ArrayList;

@Service
public class LivreService {

    @Autowired
    LivreRepository livreRepository;

    public ArrayList<Livre> livreList(){
        ArrayList<Livre> livres = (ArrayList<Livre>) livreRepository.findAll();
        return livres;
    }

    public String testWebService(){
        String msg = "Un message !";
        return msg;
    }
}
