package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 * Title: HACS Description: Copyright: Copyright (c) 2002 Company: msu
 * 
 * @author Zhang ji Zhu Wei
 * @version 1.0
 * @author mjfindler
 * @version 2.0 update to Java 8
 */

public class ClassCourseList extends ArrayList<Course> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ClassCourseList() {
	}

	//// initialize the list by reading from the file.
	public void initializeFromFile() {
		try {
			BufferedReader file;
			String strCourseName = null;
			file = new BufferedReader(new FileReader("/hacs/src/main/CourseInfo.txt"));
			while ((strCourseName = file.readLine()) != null) {
				Course theCourse;
				theCourse = new Course(strCourseName, Level.LowLevel);
//      theCourse.CourseName= strCourseName;
				add(theCourse);
			}
			file.close();
		} catch (Exception ee) {
		}
	}

	public Course findCourseByCourseName(String CourseName) {
		int nCourseCount = size();
		for (int i = 0; i < nCourseCount; i++) {
			Course theCourse;
			theCourse = (Course) get(i);
			if (theCourse.courseName.compareTo(CourseName) == 0)
				return theCourse;
		}
		return null;
	}

}