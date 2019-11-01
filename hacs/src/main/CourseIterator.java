package main;

import java.util.Iterator;

/**
 * Title: HACS Description: Copyright: Copyright (c) 2002 Company: msu
 * 
 * @author Zhang ji Zhu Wei
 * @version 1.0
 */

public class CourseIterator implements Iterator<Course> {
	public ClassCourseList theCourseList;
	public int currentCourseNumber;

	public CourseIterator() {
		currentCourseNumber--;
	}

	public CourseIterator(ClassCourseList courseList) {
		currentCourseNumber--;
		theCourseList = courseList;
	}

	public boolean hasNext() {
		if (currentCourseNumber >= theCourseList.size() - 1)
			return false;
		else
			return true;
	}

	public Course next() {
		if (hasNext() == true) {
			currentCourseNumber++;
			return theCourseList.get(currentCourseNumber);
		} else {
			return null;
		}
	}

	public void remove() {
		theCourseList.remove(currentCourseNumber);
	}

// the next Course that fits the given CourseName
	public Course next(String CourseName) {
		Course theCourse;
		theCourse = (Course) next();
		while (theCourse != null) {
			if (CourseName.compareTo(theCourse.toString()) == 0) {
				return theCourse;
			}
			theCourse = (Course) next();
		}
		return null;
	}

}