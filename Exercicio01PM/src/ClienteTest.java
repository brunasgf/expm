import static org.junit.Assert.*;

import org.junit.Test;

public class ClienteTest {

	@Test
	public void ehVerdadeiro() {
		Cliente d = new Cliente ("Bruna", 19, "f", "rua das aboboras", "3133333333");
		assertEquals(true, d.ehVerdadeiro(d.getTelefone()));
	}

}
