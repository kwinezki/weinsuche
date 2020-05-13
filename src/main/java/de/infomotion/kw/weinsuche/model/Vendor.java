package de.infomotion.kw.weinsuche.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import org.aspectj.weaver.patterns.DeclareParentsMixin;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;

@Entity
@Data
@Table(name = "Verkaeufer")
public class Vendor {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "verkaeufernummer", precision = 38, updatable = false, insertable = true, nullable = true)
	private BigInteger vendorNumber;

	@Column(name = "name", length = 20, nullable = true)
	private String vendorLastName;

	@Column(name = "vorname", length = 20, nullable = true)
	private String vendorFirstName;

	@Column(name = "provisionsfaktor", precision = 15, scale = 3, nullable = true)
	private BigDecimal commissionFactor;

/*
	@Column(name = "bereich", insertable = false, updatable = false, precision = 38, nullable = true)
	private BigInteger departmentNumber;
*/
	@Column(name = "staat_kurz", length = 2, nullable = true)
	private String countryShortCode;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "bereich")
	@Getter(AccessLevel.NONE)
	private Department department;


	public BigInteger getDepartmentNumber() {
		return department.getDepartmentNumber();
	}

	@JsonIgnore
	public String getDepartmentName() {
		return department.getDepartmentName();
	}
}
