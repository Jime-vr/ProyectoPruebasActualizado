package ac.cr.cenfotec.logica.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;


import ac.cr.cenfotec.logica.AnnoBisiesto;

public class AnnoBisiestoTest {
	
	static AnnoBisiesto bi;
	
	@BeforeClass
	public static void init() {
		bi  = new AnnoBisiesto();
	}

	@Test
	public void testAnnoBisiesto() {
		assertFalse(bi.isBisiesto(1900));
	}
	
	@Test 
	public void multipo4() {
		assertTrue(bi.isBisiesto(1916));
		assertFalse(bi.isBisiesto(1917));
	}
	
	@Test 
	public void multiplo4y100() {
		assertFalse(bi.isBisiesto(1900));
		assertFalse(bi.isBisiesto(2100));
	}
	
	@Test 
	public void multiplo400() {
		assertTrue(bi.isBisiesto(1600));
		assertTrue(bi.isBisiesto(2000));
	}

}
