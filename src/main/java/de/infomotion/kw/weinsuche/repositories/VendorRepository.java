package de.infomotion.kw.weinsuche.repositories;

import de.infomotion.kw.weinsuche.dto.VendorDto;
import de.infomotion.kw.weinsuche.model.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.math.BigInteger;
import java.util.List;

public interface VendorRepository extends JpaRepository<Vendor, BigInteger> {

    @Query("select new de.infomotion.kw.weinsuche.dto.VendorDto(" +
            "v.vendorNumber, " +
            "v.vendorLastName, " +
            "v.vendorFirstName, " +
            "v.commissionFactor, " +
            "v.department.departmentNumber, " +
            "v.countryShortCode) " +
            "from Vendor v " +
            "left join v.department d " +
            "order by v.vendorLastName asc")

    List<VendorDto> retrieveVendorSortByLastName();
}
