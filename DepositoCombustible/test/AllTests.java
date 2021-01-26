import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ DepositoCombustibleTest.class, DepositoCombustibleTestConsumirParametrizada.class,
		DepositoCombustibleTestFillParametrizada.class })
public class AllTests {

}
