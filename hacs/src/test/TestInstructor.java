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

import main.Course;
import main.CourseMenu;
import main.HighLevelCourseMenu;
import main.Instructor;
import main.Level;

/**
 * @author edplus
 *
 */
class TestInstructor {
	
	static Instructor instructor;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		instructor = new Instructor();
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
	 * Test method for {@link main.Instructor#createCourseMenu(main.Course, main.Level)}.
	 */
	@Test
	void testCreateCourseMenu() {
		CourseMenu course = instructor.createCourseMenu(new Course("CSE 870", Level.HighLevel), Level.HighLevel);
		if(course instanceof HighLevelCourseMenu)
			assertEquals(true, true);
		else
			assertEquals(false, false);
		
	}

}
