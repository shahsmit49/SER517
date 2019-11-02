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
import main.SolutionIterator;
import main.SolutionList;

/**
 * @author smit
 *
 */
class TestSolutionIterator {
	
	static SolutionIterator solutionIterator;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		SolutionList solutionList = new SolutionList();
		solutionIterator = new SolutionIterator(solutionList);
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
	 * Test method for {@link main.SolutionIterator#SolutionIterator(main.SolutionList)}.
	 */
	@Test
	void testSolutionIteratorSolutionList() {
		assertEquals(true, solutionIterator.solutionlist != null);
		assertEquals(-1, solutionIterator.currentSolutionNumber);
	}

	/**
	 * Test method for {@link main.SolutionIterator#moveToHead()}.
	 */
	@Test
	void testMoveToHead() {
		solutionIterator.moveToHead();
		assertEquals(-1, solutionIterator.currentSolutionNumber);
	}

	/**
	 * Test method for {@link main.SolutionIterator#hasNext()}.
	 */
	@Test
	void testHasNext() {
		solutionIterator.solutionlist.add(new Solution());
		assertEquals(true, solutionIterator.hasNext());
		solutionIterator.solutionlist.remove(0);
		solutionIterator.currentSolutionNumber = -1;
	}

	/**
	 * Test method for {@link main.SolutionIterator#next()}.
	 */
	@Test
	void testNext() {
		Solution solution = new Solution();
		solution.theAuthor = "Smit";
		solutionIterator.solutionlist.add(solution);
		assertEquals("Smit", solutionIterator.next().theAuthor);
		solutionIterator.solutionlist.remove(0);
		solutionIterator.currentSolutionNumber = -1;
	}

	/**
	 * Test method for {@link main.SolutionIterator#next(java.lang.String)}.
	 */
	@Test
	void testNextString() {
		Solution solution = new Solution();
		solution.theAuthor = "Smit";
		solutionIterator.solutionlist.add(solution);
		assertEquals(true, solutionIterator.next("Smit") != null);
		solutionIterator.solutionlist.remove(0);
		solutionIterator.currentSolutionNumber = -1;
	}

	/**
	 * Test method for {@link main.SolutionIterator#remove()}.
	 */
	@Test
	void testRemove() {
		Solution solution = new Solution();
		solution.theAuthor = "Smit";
		solutionIterator.solutionlist.add(solution);
		solutionIterator.remove(0);
		assertEquals(true, solutionIterator.solutionlist.size() == 0);
		solutionIterator.currentSolutionNumber = -1;
	}

}
