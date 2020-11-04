package unq;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
	
	public class CounterTestCase {
	private Counter counter;
/**
* Crea un escenario de test básico, que consiste en un contador
* con 10 enteros
*
* @throws Exception
*/
	@Before
	public void setUp () throws Exception {

		
		//Se crea el contador
		counter = new Counter();
//Se agregan los numeros. Un solo par y nueve impares
		counter.addNumber(1);
		counter.addNumber(3);
		counter.addNumber(5);
		counter.addNumber(7);
		counter.addNumber(9);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(6);
		counter.addNumber(1);
		counter.addNumber(4);
}
/**
* Verifica la cantidad de pares
*/
	@Test
	public void testEvenNumbers () {
// Getting the even occurrences
		int amount = counter.getPares();
// I check the amount is the expected one
		assertEquals (amount, 2);
	}
	
	public void testOddNumbers () {
		// Getting the odd occurrences
				int amount = counter.getImpares();
		// I check the amount is the expected one
				assertEquals (amount, 9);
		}
	public void testMultipleNumbersOf (int x) {
		// Getting occurrences
				x = 3;
				int amount = counter.getMultiplosDe(x);
		// I check the amount is the expected one
				assertEquals (amount, 5);
	}
	

}