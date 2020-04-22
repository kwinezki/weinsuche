package de.infomotion.kw.weinsuche.repositories;

import de.infomotion.kw.weinsuche.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface DepartmentRepository extends JpaRepository<Department, BigInteger> {


}
