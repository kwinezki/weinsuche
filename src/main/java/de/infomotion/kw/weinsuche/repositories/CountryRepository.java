package de.infomotion.kw.weinsuche.repositories;

import de.infomotion.kw.weinsuche.model.Country;
import de.infomotion.kw.weinsuche.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CountryRepository extends JpaRepository<Country, String> {

    Optional<Country> findByCountry (String country);
}
