package de.infomotion.kw.weinsuche.repositories;

import de.infomotion.kw.weinsuche.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface OrderRepository extends JpaRepository<Order, BigInteger> {
}
