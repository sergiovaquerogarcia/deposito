import static org.junit.Assert.*;
import java.util.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class DepositoCombustibleTestFillParametrizada {

		private double nivel;
		private double cantidad;
		private double resultado;
		
		public DepositoCombustibleTestFillParametrizada(double n, double c, double r) {
			this.nivel = n;
			this.cantidad = c;
			this.resultado = r;
		}
		
		@Parameters 
		public static Collection<Object[]> consumos() {
			return Arrays.asList(new Object[][] {
				{30.0,10.0,40.0},{40.0,20.0,60.0},{10.0,-10.0,10.0},{50.0,40.0,60.0},{5.0,45.0,50.0}
			});
		}	
		
		@Test
		public void testConsumir() {
			DepositoCombustible tank = new DepositoCombustible (60.0,nivel);
			tank.fill(cantidad);
			double res = tank.getDepositoNivel();
			assertEquals(resultado,res,0.0);
		}

}
