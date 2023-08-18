package fr.eni.demodatarestfull.repository;

import fr.eni.demodatarestfull.bo.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")

public interface ProduitRepository extends JpaRepository<Produit, Integer> {

}
