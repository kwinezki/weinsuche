package de.infomotion.kw.weinsuche.model;

import de.infomotion.kw.weinsuche.dto.MostEarningWine;
import de.infomotion.kw.weinsuche.dto.TopWineDto;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

@SqlResultSetMapping(
		name = "MostEarningWine",
		classes = @ConstructorResult(
				targetClass = MostEarningWine.class,
				columns = {
						@ColumnResult(name = "year"),
						@ColumnResult(name = "productName"),
						@ColumnResult(name = "earnings")
				}
		)
)

@Entity
@NamedNativeQuery(	name = "Order.retrieveTopWinePerYear",
					query = "with umsatz_pro_jahr as (" +
							" select trunc(a.datum,'YEAR') as jahr, p.produktbezeichnung, sum(a.gesamtverkaufspreis) as umsatz " +
							"from auftrag a" +
							"    left join produkt p" +
							"    on a.produktnummer = p.produktnummer" +
							"    group by trunc(a.datum,'YEAR'), p.produktbezeichnung" +
							")" +
							"    select u.jahr as year, " +
							"			u.produktbezeichnung as productName, " +
							"			u.umsatz as earnings" +
							"      from umsatz_pro_jahr u " +
							"inner join ( select jahr, max(umsatz) as umsatz from umsatz_pro_jahr group by jahr) m" +
							"    	 on u.jahr = m.jahr and u.umsatz = m.umsatz" +
							"    order by u.jahr",
					resultSetMapping = "MostEarningWine")

@Data
@Table(name = "Auftrag")
public class Order {

	@Id
	@Column(name = "auftragsnummer", precision = 38, scale = 0, insertable = true, updatable = false)
	private BigInteger orderNumber;

	@Temporal(TemporalType.DATE)
	@Column(name = "datum", precision = 38, scale = 0, nullable = true)
	private Date date;

	@Column(name = "kundennummer", insertable = false, updatable = false, precision = 38, scale = 0, nullable = true)
	private BigInteger customerNumber;

	@Column(name = "produktnummer", insertable = false, updatable = false,precision = 38, scale = 0, nullable = true)
	private BigInteger productNumber;

	@Column(name = "verkaeufernummer", insertable = false, updatable = false, precision = 38, scale = 0, nullable = true)
	private BigInteger vendorNumber;

	@Column(name = "stueckzahl", precision = 38, scale = 0, nullable = true)
	private BigInteger quantity;

	@Column(name = "gesamtverkaufspreis", precision = 15, scale = 2, nullable = true)
	private BigDecimal wholeSalePrice;

	@Column(name = "gesamteinkaufspreis", precision = 15, scale = 2, nullable = true)
	private BigDecimal wholeBuyPrice;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "kundennummer")
	private Customer customer;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "verkaeufernummer")
	private Vendor vendor;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "produktnummer")
	private Product product;

}
