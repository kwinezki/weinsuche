package de.infomotion.kw.weinsuche.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "Bundesland")
public class State {

	@Id
	@Column(name = "bundesland_kurz", length = 2, insertable = true, updatable = false, nullable = true)
	private String stateShortCode;

	@Column(name = "staat_kurz", length = 50, nullable = true)
	private String countryShortCode;

	@Column(name = "bundesland", length = 50, nullable = true)
	private String state;
}
