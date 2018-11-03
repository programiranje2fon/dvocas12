package zadatak1.gui;

import static org.junit.Assert.*;

import java.lang.reflect.Field;

import javax.swing.JTextField;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class KonvertorGUITest {

	KonvertorGUI gui;
	
	@Before
	public void setUp() throws Exception {
		gui = new KonvertorGUI();
	}

	@After
	public void tearDown() throws Exception {
		gui = null;
	}

	@Test
	public void tekstualnaPoljaKonvertorGUI() {

		try {
			Field dinField = KonvertorGUI.class.getDeclaredField("dinField");
			dinField.setAccessible(true);
			JTextField dinTextField = (JTextField) dinField.get(gui);	
		} catch (NoSuchFieldException e) {
			fail("Nema polja za unos dinara");
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Field eurField = KonvertorGUI.class.getDeclaredField("eurField");
			eurField.setAccessible(true);
			JTextField eurTextField = (JTextField) eurField.get(gui);					
		} catch (NoSuchFieldException e) {
			fail("Nema polja za unos eura");
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		

	}

}
