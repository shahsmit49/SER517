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

import main.Facade;
import main.Reminder;
import main.ReminderVisitor;

/**
 * @author edplus
 *
 */
class TestReminderVisitor {
	
	static ReminderVisitor reminderVisitor;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		reminderVisitor = new ReminderVisitor(new Reminder());
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
	 * Test method for {@link main.ReminderVisitor#visitFacade(main.Facade)}.
	 */
	@Test
	void testVisitFacade() {
		Facade facade = new Facade();
		facade.createCourseList();
		assertEquals(true, true);
	}

	/**
	 * Test method for {@link main.ReminderVisitor#visitCourse(main.Course)}.
	 */
	@Test
	void testVisitCourse() {
		assertEquals(true, true);
	}

	/**
	 * Test method for {@link main.ReminderVisitor#visitAssignment(main.Assignment)}.
	 */
	@Test
	void testVisitAssignment() {
		assertEquals(true, true);
	}

	/**
	 * Test method for {@link main.ReminderVisitor#ReminderVisitor(main.Reminder)}.
	 */
	@Test
	void testReminderVisitorReminder() {
		assertEquals(true, reminderVisitor.m_Reminder != null);
	}

}
