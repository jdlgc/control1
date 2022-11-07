package com.dagor.control1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.Mockito.*;

import java.util.Vector;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest{
	static Matricula matricula;
	static Vector<Asignatura> vectorAsignaturas;
	static Asignatura maths;
	static Asignatura physics;
	
	@BeforeEach
	public void setup() {
		vectorAsignaturas = new Vector<Asignatura>();
		maths = new AsignaturaClass("maths", 100.0);
		physics = new AsignaturaClass("physics", 200.0);
	}
	
	@Test
	public void testNullVector() {
		matricula = new Matricula(null);
		assertThrows(Exception.class, () -> matricula.getImporte());
	}
	
	@Test
	public void testCalculateImport() {
		Asignatura maths2 = mock(Asignatura.class);
		Asignatura physics2 = mock(Asignatura.class);
		when(maths2.getImporte()).thenReturn(100.0);
		when(physics2.getImporte()).thenReturn(200.0);

		vectorAsignaturas.add(maths2);
		vectorAsignaturas.add(physics2);
		matricula = new Matricula(vectorAsignaturas);
		try {
			assertEquals(300.0, matricula.getImporte());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testPriceMatricula() {
		vectorAsignaturas.add(maths);
		vectorAsignaturas.add(physics);
		matricula = new Matricula(vectorAsignaturas);
		try {
			assertEquals(300.0, matricula.getImporte());
		} catch (Exception e) {
			fail();
			e.printStackTrace();
		}
	}
	
}
