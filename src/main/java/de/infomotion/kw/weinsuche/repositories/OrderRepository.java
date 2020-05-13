package de.infomotion.kw.weinsuche.repositories;

import de.infomotion.kw.weinsuche.dto.MostEarningWine;
import de.infomotion.kw.weinsuche.model.Order;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.math.BigInteger;
import java.util.List;

public interface OrderRepository extends JpaRepository<Order, BigInteger> {

    @Query(nativeQuery = true)
    public List<MostEarningWine> retrieveTopWinePerYear();

    Page<Order> findAll(Pageable pageable);
}

