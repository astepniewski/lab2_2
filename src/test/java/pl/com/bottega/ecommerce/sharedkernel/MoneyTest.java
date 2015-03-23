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

	@Test
	public void test_equals_notEqualsObjects_shouldBeFalse() {
		Money m1 = new Money(10.00, "USD");
		Money m2 = new Money(2.00, "USD");

		assertThat(m1, is(not(equalTo(m2))));
	}

	@Test
	public void test_add_100USDand10USD_sholudReturn110USD() {
		Money m1 = new Money(100.00, "USD");
		Money m2 = new Money(10.00, "USD");
		Money expected = new Money(110, "USD");

		assertThat(m1.add(m2), is(equalTo(expected)));
	}

	@Test(expected = IllegalArgumentException.class)
	public void test_add_twoDifferentCurrencies_shouldThrowException() {
		Money m1 = new Money(100.00, "USD");
		Money m2 = new Money(10.00, "EUR");

		m1.add(m2);
	}

	@Test
	public void test_multiplyBy_2PLNBy5_sholudReturn10PLN() {
		Money m1 = new Money(2.00, "PLN");
		Money expected = new Money(10.00, "PLN");

		assertThat(m1.multiplyBy(5), is(equalTo(expected)));
	}

}
