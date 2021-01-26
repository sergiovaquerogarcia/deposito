import static org.junit.Assert.*;

import org.junit.Test;

public class DepositoCombustibleTest {

	@Test
	public final void testGetDepositoNivel() {
		DepositoCombustible tank = new DepositoCombustible (40.0,5.0);
		double nivel=tank.getDepositoNivel();
		assertEquals(5.0,nivel,0.01);
	}

	@Test
	public final void testGetDepositoMax() {
		DepositoCombustible tank = new DepositoCombustible (40.0,5.0);
		double depMax=tank.getDepositoMax();
		assertEquals(40.0,depMax,0.01);
	}

	@Test
	public final void testEstaVacio() {
		DepositoCombustible tank = new DepositoCombustible (40.0,30.0);	
		tank.consumir(30);
		assertEquals(true,tank.estaVacio());
	}

	@Test
	public final void testEstaLleno() {
		DepositoCombustible tank = new DepositoCombustible (40.0,20.0);	
		tank.fill(10);
		assertEquals(false,tank.estaLleno());
	}

}
