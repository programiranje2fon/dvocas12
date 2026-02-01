package zadatak1.poslovna_logika;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class KonvertorTest {

	private Konvertor konvertor;
	
	@Before
	public void setUp() throws Exception {
		konvertor = new Konvertor();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void metoda_konvertujDinareUEvre() {
		double actual = konvertor.konvertujDinareUEvre(240);
		assertEquals("Konvertovanje dinara u evre se ne izracunava dobro", 2, actual, 0.01);
	}

	@Test
	public void metoda_konvertujEvreUDinare() {
		double actual = konvertor.konvertujEvreUDinare(10);
		assertEquals("Konvertovanje evra u dinare se ne izracunava dobro", 1200, actual, 0.01);
	}

}
