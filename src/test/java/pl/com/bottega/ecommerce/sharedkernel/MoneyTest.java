package pl.com.bottega.ecommerce.sharedkernel;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class MoneyTest {

	@Test
	public void test_equals_equalsObjects_sholdBeTrue() {
		Money m1 = new Money(10.00, "USD");
		Money m2 = new Money(10.00, "USD");

		assertThat(m1, is(equalTo(m2)));
	}

}
