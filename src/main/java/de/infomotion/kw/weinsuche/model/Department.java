package de.infomotion.kw.weinsuche.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigInteger;

@Entity
@Data
@Table(name = "Bereiche")
public class Department {

	@Id
	@Column(name = "bereichsnummer", precision = 38,  insertable = true, updatable = false, nullable = true)
	private BigInteger departmentNumber;

	@Column(name = "bereichsbezeichnung", length = 20, nullable = true)
	private String departmentName;

	@Column(name = "kostenstelle", precision = 38, nullable = true)
	private BigInteger costCenter;
}
