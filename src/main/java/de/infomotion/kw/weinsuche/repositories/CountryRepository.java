package de.infomotion.kw.weinsuche.repositories;

import de.infomotion.kw.weinsuche.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, String> {
}
