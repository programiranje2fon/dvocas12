package zadatak2.poslovna_logika;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BMIKalkulatorTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void metoda_izracunajBMI() {
		double actual = BMIKalkulator.izracunajBMI(4, 4);
		assertEquals("BMI nije dobro izracunat", 0.25, actual, 0.0001);
	}

}
