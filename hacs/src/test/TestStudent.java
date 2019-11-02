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

import main.Course;
import main.CourseMenu;
import main.HighLevelCourseMenu;
import main.Level;
import main.Student;

/**
 * @author smit
 *
 */
class TestStudent {

	static Student student;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		student = new Student();
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
	 * Test method for {@link main.Student#createCourseMenu(main.Course, main.Level)}.
	 */
	@Test
	void testCreateCourseMenu() {
		CourseMenu courseMenu = student.createCourseMenu(new Course("SER 515", Level.HighLevel), Level.HighLevel);
		assertEquals(true, courseMenu instanceof HighLevelCourseMenu);
	}

}
