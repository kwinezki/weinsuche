package de.infomotion.kw.weinsuche;

import de.infomotion.kw.weinsuche.repositories.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class CustomerTest {

	@Autowired
	private CustomerRepository customerRepository;

	@Test
	public void testCustomer() throws Exception {
		assertThat(customerRepository.count()).isEqualTo(67);
	}



}
