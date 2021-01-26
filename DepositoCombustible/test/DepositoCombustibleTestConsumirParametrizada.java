import static org.junit.Assert.*;
import java.util.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class DepositoCombustibleTestConsumirParametrizada {

	private double nivel;
	private double consumo;
	private double resultado;
	
	public DepositoCombustibleTestConsumirParametrizada(double n, double c, double r) {
		this.nivel = n;
		this.consumo = c;
		this.resultado = r;
	}
	
	@Parameters 
	public static Collection<Object[]> consumos() {
		return Arrays.asList(new Object[][] {
			{30.0,10.0,20.0},{40.0,40.0,0.0},{5.0,-5.0,0.0},{10.0,40.0,0.0}
		});
	}	
	
	@Test
	public void testConsumir() {
		DepositoCombustible tank = new DepositoCombustible (60.0,nivel);
		tank.consumir(consumo);
		double res = tank.getDepositoNivel();
		assertEquals(resultado,res,0.0);
	}

}
