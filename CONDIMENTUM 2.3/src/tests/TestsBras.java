package tests;

import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import modele.Bras;

class TestsBras {

	Bras b, b1, b2, b3, b4;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		b = new Bras(7, 0, 90, 1);
		b1 = new Bras(20, -2, 30, 2);
		b2 = new Bras(1, 0, 360, 0);
		b3 = new Bras(5, 90, 100, 1);
		b4 = new Bras(5, 45, 100, 2);

	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testBras() {
		assertTrue(b.getAngle_f() == 90);
		assertTrue(b.getAngle_i() == 0);
		assertTrue(b.getRps() == 0 || b.getRps() == 1 || b.getRps() == 2);
		assertTrue(b.getLongueur() == 7);

		assertTrue(b1.getAngle_f() == Bras.ANGLE_MIN);
		assertTrue(b1.getAngle_i() == Bras.ANGLE_MIN);
		assertTrue(b1.getLongueur() == Bras.LONGUEUR_MIN);
		assertTrue(b1.getRps() == 0);

	}

	@Test
	void testSetRps() {
		b1.setRps(1);
		assertTrue(b1.getRps() == 1);
		b1.setRps(0);
		assertTrue(b1.getRps() == 0);
		b1.setRps(2);
		assertTrue(b1.getRps() == 2);
		b1.setRps(-1);
		assertTrue(b1.getRps() == 2);
		b1.setRps(3);
		assertTrue(b1.getRps() == 2);

	}

	@Test
	void testTemps() {
		b2.setRps(1);

		assertTrue(b2.temps() == 1);

		b2.setRps(2);
		assertTrue(b2.temps() == 0.5);

		b2.setRps(0);
		assertTrue(b2.temps() == -1);
	}

	@Test
	void testHauteur() {
		assertTrue(b3.hauteur() == 5);

	}

}