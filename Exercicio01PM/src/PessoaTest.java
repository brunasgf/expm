import static org.junit.Assert.*;

import org.junit.Test;

public class PessoaTest {

	@Test
	public void testehMaior() { 
		Pessoa p =  new Pessoa("Bruna", 19, "f");
		assertEquals(true, p.getIdade()>= 18);
	}

}
