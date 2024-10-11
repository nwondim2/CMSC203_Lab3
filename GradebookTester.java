import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradebookTester {

	private GradeBook student1;
    private GradeBook student2;
	
	@BeforeEach
	void setUp() throws Exception {
		student1 = new GradeBook(5);
		student1.addScore(38.95);
		student1.addScore(15.4);
		student2 = new GradeBook(5);
		student2.addScore(56.9);
		student2.addScore(98.1);
	}

	@AfterEach
	void tearDown() throws Exception {
		student1 = null;
		student2 = null;
	}

	@Test
	void testGetScoreSize() {
		assertEquals(2, student1.getScoreSize());
		assertEquals(2, student2.getScoreSize());
	}

	@Test
	void testAddScore() {
		assertTrue("38.95 15.4 ".equals(student1.toString()));
		assertTrue("56.9 98.1 ".equals(student2.toString()));
		
		// fail("Not yet implemented");
	}

	@Test
	void testSum() {
		assertEquals(54.35, student1.sum());
		assertEquals(155.0, student2.sum());
	}

	@Test
	void testMinimum() {
		assertEquals(15.4, student1.minimum());
		assertEquals(56.9, student2.minimum());
	}

	@Test
	void testFinalScore() {
		assertEquals(38.95, student1.finalScore());
		assertEquals(98.1, student2.finalScore());
	}
	
	
	
	
	
	/*		Not asked for by directions.
	@Test
	void testToString() {
		fail("Not yet implemented");
	}
	*/

}
