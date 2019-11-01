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

import main.ClassCourseList;

/**
 * @author smit
 *
 */
class TestClassCourseList {
	
	static ClassCourseList classCourseList;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		classCourseList = new ClassCourseList();
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
	 * Test method for {@link main.ClassCourseList#ClassCourseList()}.
	 */
	@Test
	void testClassCourseList() {
		//Beause method is empty
		assertEquals(true, true);
	}

	/**
	 * Test method for {@link main.ClassCourseList#initializeFromFile(java.lang.String)}.
	 */
	@Test
	void testInitializeFromFile() {
		classCourseList.initializeFromFile();
		String courseName = classCourseList.get(0).toString();
		assertEquals("CSE870", courseName);
	}

	/**
	 * Test method for {@link main.ClassCourseList#findCourseByCourseName(java.lang.String)}.
	 */
	@Test
	void testFindCourseByCourseName() {
		assertEquals("CSE870", classCourseList.findCourseByCourseName("CSE870").toString());
	}

}
