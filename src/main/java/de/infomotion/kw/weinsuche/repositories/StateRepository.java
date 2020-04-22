package de.infomotion.kw.weinsuche.repositories;

import de.infomotion.kw.weinsuche.model.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, String> {
}
