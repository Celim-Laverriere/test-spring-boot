package org.webservice.model;
import lombok.*;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter @Setter
@NoArgsConstructor
public class Livre implements Serializable {

    /* ====== Attributs ====== */
    @Id @GeneratedValue
    private Integer id;
    private String ref_bibliotheque;
    private Integer ouvrage_id;


    /* ====== Constructeur ====== */


    /* ====== Getter & Setter ====== */


}
