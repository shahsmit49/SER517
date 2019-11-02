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

import main.Assignment;
import main.Facade;
import main.Instructor;
import main.Person;
import main.Solution;
import main.USER_TYPE;
import main.UserInfoItem;

/**
 * @author smit
 *
 */
class TestFacade {
	
	static Facade facade;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		facade = new Facade();
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
	 * Test method for {@link main.Facade#reportSolutions(main.Assignment)}.
	 */
	@Test
	void testReportSolutions() {
		Solution one = new Solution();
		Solution two = new Solution();
		one.theAuthor = "Ram";
		two.theAuthor = "Shyam";
		Assignment assignment = new Assignment();
		assignment.addSolution(one);
		assignment.addSolution(two);
		facade.reportSolutions(assignment);
		assertEquals(true, one.reported);
		assertEquals(true, two.reported);
	}

	/**
	 * Test method for {@link main.Facade#submitSolution(main.Assignment, main.Solution)}.
	 */
	@Test
	void testSubmitSolution() {
		Solution one = new Solution();
		one.theAuthor = "Ram";
		Assignment assignment = new Assignment();
		facade.submitSolution(assignment, one);
		assertEquals(1, assignment.getSolutionList().size());
	}

	/**
	 * Test method for {@link main.Facade#createUser(main.UserInfoItem)}.
	 */
	@Test
	void testCreateUser() {
		UserInfoItem infoItem = new UserInfoItem();
		infoItem.strUserName = "Smit";
		infoItem.UserType = USER_TYPE.Student;
		facade.createUser(infoItem);
		assertEquals("Smit", facade.thePerson.UserName);
	}

	/**
	 * Test method for {@link main.Facade#createCourseList()}.
	 */
	@Test
	void testCreateCourseList() {
		facade.createCourseList();
		assertEquals("CSE870", facade.theCourseList.get(0).toString());
	}

	/**
	 * Test method for {@link main.Facade#attachCourseToUser()}.
	 */
	@Test
	void testAttachCourseToUser() {
		Person person = new Instructor();
		person.UserName = "Inst1";
		facade.thePerson = person;
		facade.attachCourseToUser();
		assertEquals("CSE870", person.GetCourseList().get(0).toString());
	}

}
