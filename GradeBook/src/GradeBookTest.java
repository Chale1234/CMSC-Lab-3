import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {
	
	// private attribute for GradeBook
	 GradeBook g1, g2;


	@BeforeEach
	void setUp() throws Exception {
		
		// create two grade book instance
		g1 = new GradeBook(5);
		g2 = new GradeBook(5);
		
		// add scores
		g1.addScore(100);
		g1.addScore(96);
		g1.addScore(80);
		g2.addScore(82);
		g2.addScore(90);
	}

	@AfterEach
	void tearDown() throws Exception {
		g1 = null;
		g2 = null;
	}

	@Test
	void testGradeBook() {}

	@Test
	void TestAddScore() {}
	
	@Test
	void testSum() {
		
		// testing sum
		assertEquals(276, g1.sum(), .0001);
		assertEquals(172, g2.sum(),.0001);
	}

	@Test
	void testMinimum() {
		
		// testing minimum
		assertEquals(80, g1.minimum(),.001);
		assertEquals(82, g2.minimum(),.001);
	}

	@Test
	void testFinalScore() {
		
		// testing Final score
		assertEquals(196,g1.finalScore(),.001);
		assertEquals(90, g2.finalScore(),.001);
	}

	@Test
	void testGetScoresSize() {
		
		// testing score size
		assertEquals(3,g1.getScoreSize());
		assertEquals(2,g2.getScoreSize());
	}
	
	}
	



