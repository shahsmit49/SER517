/**
 * 
 */
package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.Solution;

/**
 * @author edplus
 *
 */
class TestSolution {
	
	static Solution solution;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		solution = new Solution();
		solution.theAuthor = "Smit";
		solution.solutionFileName = "data.txt";
		solution.theGrade = 1;
		solution.reported = true;
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link main.Solution#toString()}.
	 */
	@Test
	void testToString() {
		assertEquals("Smit  data.txt Grade=1  reported", solution.toString());
	}

	/**
	 * Test method for {@link main.Solution#getGradeString()}.
	 */
	@Test
	void testGetGradeString() {
		assertEquals("1", solution.getGradeString());
	}

	/**
	 * Test method for {@link main.Solution#getGradeInt()}.
	 */
	@Test
	void testGetGradeInt() {
		assertEquals(1, solution.getGradeInt());
	}

	/**
	 * Test method for {@link main.Solution#setReported(boolean)}.
	 */
	@Test
	void testSetReported() {
		assertEquals(true, solution.reported);
	}

	/**
	 * Test method for {@link main.Solution#isReported()}.
	 */
	@Test
	void testIsReported() {
		assertEquals(true, solution.isReported());
	}

}
