/**
 * 
 */
package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.Assignment;
import main.Course;
import main.Level;
import main.Reminder;
import main.ReminderVisitor;

/**
 * @author smit
 *
 */
class TestCourse {
	
	static Course course;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		course  = new Course("SER 515", Level.HighLevel);
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
	 * Test method for {@link main.Course#Course(java.lang.String, int)}.
	 */
	@Test
	void testCourse() {
		Course course = new Course("algo", Level.HighLevel);
		assertEquals("algo", course.courseName);
		assertEquals(0, course.courseLevel);
	}

	/**
	 * Test method for {@link main.Course#addAssignment(main.Assignment)}.
	 */
	@Test
	void testAddAssignment() {
		Assignment assignment = new Assignment();
		assignment.setAssName("No 1");
		course.addAssignment(assignment);
		assertEquals("No 1",course.assignmentList.get(0).getAssName());
	}

	/**
	 * Test method for {@link main.Course#toString()}.
	 */
	@Test
	void testToString() {
		assertEquals("SER 515", course.courseName);
	}

	/**
	 * Test method for {@link main.Course#accept(main.NodeVisitor)}.
	 */
	@Test
	void testAccept() {
		course.accept(new ReminderVisitor(new Reminder()));
		assertEquals(null, null);
	}

}
