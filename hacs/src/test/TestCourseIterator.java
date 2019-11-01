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
import main.Course;
import main.CourseIterator;
import main.Level;

/**
 * @author smit
 *
 */
class TestCourseIterator {

	static CourseIterator courseIterator;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		ClassCourseList classCourseList = new ClassCourseList();
		classCourseList.initializeFromFile();
		courseIterator = new CourseIterator(classCourseList);
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
	 * Test method for {@link main.CourseIterator#CourseIterator()}.
	 */
	@Test
	void testCourseIterator() {
		assertEquals(true, true);
	}

	/**
	 * Test method for {@link main.CourseIterator#CourseIterator(main.ClassCourseList)}.
	 */
	@Test
	void testCourseIteratorClassCourseList() {
		ClassCourseList classCourseList = new ClassCourseList();
		classCourseList.initializeFromFile();
		CourseIterator courseIterator1 = new CourseIterator(classCourseList);
		assertEquals("CSE870", courseIterator1.theCourseList.get(0).toString());
	}

	/**
	 * Test method for {@link main.CourseIterator#hasNext()}.
	 */
	@Test
	void testHasNext() {
		assertEquals(true, courseIterator.hasNext());
	}

	/**
	 * Test method for {@link main.CourseIterator#next()}.
	 */
	@Test
	void testNext() {
		assertEquals("CSE870", courseIterator.next().courseName);
		courseIterator.currentCourseNumber = -1;
	}

	/**
	 * Test method for {@link main.CourseIterator#remove()}.
	 */
	@Test
	void testRemove() {
		courseIterator.currentCourseNumber = 0;
		courseIterator.remove();
		courseIterator.currentCourseNumber = -1;
		assertEquals("CSE880", courseIterator.next().courseName);
		
		//adding data again so that other test are not affected
		courseIterator.theCourseList.add(0,new Course("CSE870", Level.LowLevel));
	}

	/**
	 * Test method for {@link main.CourseIterator#next(java.lang.String)}.
	 */
	@Test
	void testNextString() {
		assertEquals("CSE890", courseIterator.next("CSE890").courseName);
		courseIterator.currentCourseNumber = -1;
	}

}
