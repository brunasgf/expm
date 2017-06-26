import static org.junit.Assert.*;

import org.junit.Test;

public class ContaTest {

	@Test
	public void testehCpf() {
		Conta c = new Conta ("Bruna", 19, "f", "fisica", "12345678909");
		assertEquals(false, c.getCpf().equals(11));
	}

}
