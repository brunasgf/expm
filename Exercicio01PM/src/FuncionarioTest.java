import static org.junit.Assert.*;

import org.junit.Test;

public class FuncionarioTest {

	@Test
	public void ehSalarioMinimo() {
		Funcionario f = new Funcionario ("Bruna", 19, "f", 0, 1000, "Recepcionista");
		assertEquals(true, f.ehSalarioMinimo(f.getSalario()));
		
	}

}
