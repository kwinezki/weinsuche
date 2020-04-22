package de.infomotion.kw.weinsuche.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "Sorte")
public class Variety {

	@Id
	@Column(name = "sortenkennzeichen", length = 3, updatable = false, insertable = true, nullable = true)
	private String varietyMark;

	@Column(name = "rebsorte", length = 50, nullable = true)
	private String grapeVariety;

	@Column(name = "bereichsbezeichnung", length = 50, nullable = true)
	private String departmentName;

	@Column(name = "bereichsnummer", length = 50, nullable = true)
	private String departmentNumber;
}
