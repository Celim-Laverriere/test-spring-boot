package org.webservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.webservice.model.Livre;

@Repository
public interface LivreRepository extends JpaRepository<Livre, Integer> {

}
