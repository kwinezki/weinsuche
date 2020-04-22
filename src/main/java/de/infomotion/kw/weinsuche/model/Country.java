package de.infomotion.kw.weinsuche.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

@Entity
@Data
@Table(name = "Staat")
public class Country {

	@Id
	@Column(name = "staat_kurz", length = 2, insertable = true, updatable = false, nullable = true)
	private String countryShortCode;

	@Column(name = "staat", length = 50, nullable = true)
	private String country;



}
