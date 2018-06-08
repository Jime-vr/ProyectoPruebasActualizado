package ac.cr.cenfotec.logica.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import ac.cr.cenfotec.logica.CalculadoraSalarial;
import ac.cr.cenfotec.logica.TipoEmpleado;

public class CalculadoraSalarialTest {

	static CalculadoraSalarial calc;
	
	@BeforeClass
	public static void init() {
		calc = new CalculadoraSalarial();
	}
	
	@Test
	public void test1() {
		assertEquals(1360.0f, calc.calculaSalarioBruto(TipoEmpleado.VENDEDOR, 2000, 8), 0.f);
	}
	
	@Test
	public void test2() {
		assertEquals(1260.0f, calc.calculaSalarioBruto(TipoEmpleado.VENDEDOR, 1500, 3), 0.f);
	}
	
	@Test
	public void test3() {
		assertEquals(1100.0f, calc.calculaSalarioBruto(TipoEmpleado.VENDEDOR, 1499.99f, 0), 0.f);
	}
	
	@Test
	public void test4() {
		assertEquals(1760.0f, calc.calculaSalarioBruto(TipoEmpleado.ENCARGADO, 1250.0f, 8), 0.f);
	}
	
	@Test
	public void test5() {
		assertEquals(1600.0f, calc.calculaSalarioBruto(TipoEmpleado.ENCARGADO, 1000.0f, 0), 0.f);
	}
	
	@Test
	public void test6() {
		assertEquals(1560.0f, calc.calculaSalarioBruto(TipoEmpleado.ENCARGADO, 999.99f, 3), 0.f);
	}
	
	@Test
	public void test7() {
		assertEquals(1500.0f, calc.calculaSalarioBruto(TipoEmpleado.ENCARGADO, 500.0f, 0), 0.f);
	}

	@Test
	public void test8() {
		assertEquals(1660.0f, calc.calculaSalarioBruto(TipoEmpleado.ENCARGADO, 0.0f, 8), 0.f);
	}

	@Test (expected = AssertionError.class)
	public void test9() {
		assertEquals(0.0f, calc.calculaSalarioBruto(TipoEmpleado.VENDEDOR, -1.0f, 8), 0.f);
	}
	
	@Test (expected = AssertionError.class)
	public void test10() {
		assertEquals(0.0f, calc.calculaSalarioBruto(TipoEmpleado.VENDEDOR, 1500.0f, -1), 0.f);
	}
	
	@Test (expected = Exception.class)
	public void test11() {
		assertEquals(0.0f, calc.calculaSalarioBruto(null, 1500.0f, 8), 0.f);
	}


}
