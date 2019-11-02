/**
 * 
 */
package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.ListIterator;

/**
 * @author edplus
 *
 */
class TestListIterator {
	
	static ListIterator listIterator;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		listIterator = new ListIterator(new ArrayList<Object>());
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
	 * Test method for {@link main.ListIterator#ListIterator(java.util.ArrayList)}.
	 */
	@Test
	void testListIteratorArrayListOfObject() {
		assertEquals(-1, listIterator.currentNumber);
	}

	/**
	 * Test method for {@link main.ListIterator#hasNext()}.
	 */
	@Test
	void testHasNext() {
		assertEquals(false, listIterator.hasNext());
		listIterator.theList.add(1);
		assertEquals(true, listIterator.hasNext());
		listIterator.theList.remove(0);
		listIterator.currentNumber = -1;
	}

	/**
	 * Test method for {@link main.ListIterator#next()}.
	 */
	@Test
	void testNext() {
		listIterator.theList.add(1);
		assertEquals(1, listIterator.next());
		listIterator.theList.remove(0);
		listIterator.currentNumber = -1;
	}

	/**
	 * Test method for {@link main.ListIterator#remove()}.
	 */
	@Test
	void testRemove() {
		listIterator.theList.add(1);
		listIterator.theList.remove(0);
		assertEquals(0,listIterator.theList.size());
	}

}
