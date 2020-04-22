package de.infomotion.kw.weinsuche.repositories;

import de.infomotion.kw.weinsuche.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;


public interface CustomerRepository extends JpaRepository<Customer, BigInteger> {

}
