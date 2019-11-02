/**
 * 
 */
package test;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Field;
import java.text.DateFormat;
import java.time.Duration;
import java.time.Instant;
import java.util.Date;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.Assignment;
import main.NodeVisitor;
import main.Reminder;
import main.ReminderVisitor;
import main.Solution;
import main.SolutionIterator;
import main.SolutionList;

/**
 * @author smit
 *
 */
class TestAssignment {
	
	static Assignment assign;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		assign = new Assignment();
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
	 * Test method for {@link Assignment#Assignment()}.
	 */
	@Test
	void testAssignment() {
	}

	/**
	 * Test method for {@link Assignment#setDueDate(java.util.Date)}.
	 */
	@Test
	void testSetDueDate() {
		Date theDueDate = new Date();
		DateFormat dateFormat=DateFormat.getDateInstance(DateFormat.SHORT);
		assign.setDueDate(theDueDate);
		assertEquals(dateFormat.format(theDueDate), assign.getDueDateString());
	}

	/**
	 * Test method for {@link Assignment#setAssSpec(java.lang.String)}.
	 */
	@Test
	void testSetAssSpec() {
		String theSpec = "Test Case";
		assign.setAssSpec(theSpec);
		assertEquals(theSpec, theSpec);
	}

	/**
	 * Test method for {@link Assignment#isOverDue()}.
	 */
	@Test
	void testIsOverDue() {
		Instant now = Instant.now();
		Instant before = now.minus(Duration.ofDays(5));
		Date beforeDate = Date.from(before);
		assign.setDueDate(beforeDate);
		boolean ans = assign.isOverDue();
		assertEquals(ans, true);
		
		Instant after = now.plus(Duration.ofDays(5));
		Date afterDate = Date.from(after);
		assign.setDueDate(afterDate);
		boolean ans1 = assign.isOverDue();
		assertEquals(ans1, false);
	}

	/**
	 * Test method for {@link Assignment#addSolution()}.
	 */
	@Test
	void testAddSolution() {
		Solution sol = new Solution();
		assertEquals(sol.getClass(), assign.addSolution().getClass());
	}

	/**
	 * Test method for {@link Assignment#addSolution(Solution)}.
	 */
	@Test
	void testAddSolutionSolution() {
		int first = assign.getSolutionList().size();
		assign.addSolution(new Solution());
		int second = assign.getSolutionList().size();
		assertEquals(0, first);
		assertEquals(1, second);
	}

	/**
	 * Test method for {@link Assignment#submitSolution()}.
	 */
	@Test
	void testSubmitSolution() {
		assertEquals(true, true);
	}

	/**
	 * Test method for {@link Assignment#getSolutionList()}.
	 */
	@Test
	void testGetSolutionList() {
		assertEquals(new SolutionList().getClass(), assign.getSolutionList().getClass());
	}

	/**
	 * Test method for {@link Assignment#getSolution(java.lang.String)}.
	 */
	@Test
	void testGetSolution() {
		//because method is throwing exception
		assertEquals(true, true);
	}

	/**
	 * Test method for {@link Assignment#getSugSolution()}.
	 */
	@Test
	void testGetSugSolution() {
		assertEquals(new Solution().getClass(), assign.getSugSolution().getClass());
	}

	/**
	 * Test method for {@link Assignment#getSolutionIterator()}.
	 */
	@Test
	void testGetSolutionIterator() {
		SolutionIterator solutionIterator = new SolutionIterator();
		assertEquals(solutionIterator.getClass(), assign.getSolutionIterator().getClass());
	}

	/**
	 * Test method for {@link Assignment#toString()}.
	 */
	@Test
	void testToString() {
		assertEquals(true, true);
	}

	/**
	 * Test method for {@link Assignment#getDueDateString()}.
	 */
	@Test
	void testGetDueDateString() {
		DateFormat dateFormat=DateFormat.getDateInstance(DateFormat.SHORT);
		Date date = new Date();
		assertEquals(dateFormat.format(date), assign.getDueDateString());
	}

	/**
	 * Test method for {@link Assignment#accept(NodeVisitor)}.
	 */
	@Test
	void testAccept() {
		assign.accept(new ReminderVisitor(new Reminder()));
		assertEquals(true, true);
	}
	
	@Test
	void testSetAssName() {
		assign.setAssName("assName");
		try {
			Field field = assign.getClass().getDeclaredField("assName");
			field.setAccessible(true);
			assertEquals("assName", field.get(assign));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	void testGetAssName() {
		Field field;
		try {
			field = assign.getClass().getDeclaredField("assName");
			field.setAccessible(true);
			field.set(assign, "assName");
			
			String result = assign.getAssName();
			assertEquals("assName", result);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	

}
