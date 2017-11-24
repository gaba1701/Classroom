import static org.junit.Assert.*;

import java.text.DecimalFormat;

import java.util.concurrent.ThreadLocalRandom;
import java.util.logging.Logger;

import org.junit.Test;
import java.util.*;

import otherclasses.Student;

public class StudentTest {
	private static final Logger LOG = Logger.getLogger(Student.class.getName());

	@Test
	public void testGetFirstName() {
		Student student = new Student("Anna", "Bar", 25, 'f');
		assertEquals(student.getFirstName().equals("Anna"), true);
	}

	@Test
	public void testGetFirstGrade() {
		Student student = new Student("Anna", "Bar", 25, 'f', 2.5, 5.0, 6.0);
		assertEquals(student.getFirstGrade(), 2.5, 0.2);
	}

	@Test
	public void testGetSecondtGrade() {
		Student student = new Student("Anna", "Bar", 25, 'f', 2.5, 5.0, 6.0);
		assertEquals(student.getSecondGrade(), 5, 0.1);
	}

	@Test
	public void testGetThirdtGrade() {
		Student student = new Student("Anna", "Bar", 25, 'f', 2.5, 5.0, 6.0);
		assertEquals(student.getThirdGrade(), 6, 0.1);
	}

	@Test
	public void testCalculateAvarage() {

		DecimalFormat df = new DecimalFormat("#.0");

		for (int i = 0; i < 100; i++) {
			double rn1 = ThreadLocalRandom.current().nextDouble(7);
			double firstGradeRm = Double.valueOf(df.format(rn1));

			double rn2 = ThreadLocalRandom.current().nextDouble(7);
			double secondGradeRm = Double.valueOf(df.format(rn2));
			double rn3 = ThreadLocalRandom.current().nextDouble(7);
			double thirdGradeRm = Double.valueOf(df.format(rn3));

			double averageGrade = (firstGradeRm + secondGradeRm + thirdGradeRm) / 3;

			Student student = new Student("Anna", "Bar", 25, 'f', firstGradeRm, secondGradeRm, thirdGradeRm);

			LOG.info("Testing the method CalculateAverage with firstGrade: " + firstGradeRm + ", " + secondGradeRm
					+ ", " + thirdGradeRm + " Avarage grade is " + averageGrade + "\n");
			assertEquals(student.calculateAverage(firstGradeRm), averageGrade, 0.1);
		}
	}

	@Test
	public void testCalculateAvarage2() {

		DecimalFormat df = new DecimalFormat("#.0");

		for (int i = 0; i < 100; i++) {
			double rn1 = ThreadLocalRandom.current().nextDouble(7);
			double firstGradeRm = Double.valueOf(df.format(rn1));
			double rn2 = ThreadLocalRandom.current().nextDouble(7);
			double secondGradeRm = Double.valueOf(df.format(rn2));
			double rn3 = ThreadLocalRandom.current().nextDouble(7);
			double thirdGradeRm = Double.valueOf(df.format(rn3));

			Student student = new Student("Anna", "Bar", 25, 'f', firstGradeRm, secondGradeRm, thirdGradeRm);
			double averageGrade = (firstGradeRm + secondGradeRm + thirdGradeRm) / 3;

			LOG.info("Testing the method CalculateAverage2 with no inputs: " + firstGradeRm + ", " + secondGradeRm
					+ ", " + thirdGradeRm + " Avarage grade is " + averageGrade + "\n");
			assertEquals(student.calculateAverage(), averageGrade, 0.1);
		}
	}

	@Test
	public void testCalculateAvarage3() { // double firstGrade, double secondGrade, double thirdGrade) {

		DecimalFormat df = new DecimalFormat("#.0");

		for (int i = 0; i < 100; i++) {
			double rn1 = ThreadLocalRandom.current().nextDouble(7);
			double firstGradeRm = Double.valueOf(df.format(rn1));

			double rn2 = ThreadLocalRandom.current().nextDouble(7);
			double secondGradeRm = Double.valueOf(df.format(rn2));

			double rn3 = ThreadLocalRandom.current().nextDouble(7);
			double thirdGradeRm = Double.valueOf(df.format(rn3));

			Student student = new Student("Anna", "Bar", 25, 'f', firstGradeRm, secondGradeRm, thirdGradeRm);
			double averageGrade = (firstGradeRm + secondGradeRm + thirdGradeRm) / 3;

			LOG.info("Testing the method CalculateAverage3 with firstGrade, secondGrade and thirdGrade: " + firstGradeRm
					+ ", " + secondGradeRm + ", " + thirdGradeRm + " Avarage grade is " + averageGrade);

			assertEquals(student.calculateAverage(firstGradeRm, secondGradeRm, thirdGradeRm), averageGrade, 0.1);
		}
	}

	@Test
	public void testHasClearedTheCourse() {
		DecimalFormat df = new DecimalFormat("#.0");
		boolean hasClearedCourse = false;

		for (int i = 0; i < 100; i++) {
			double rn1 = ThreadLocalRandom.current().nextDouble(11);
			double firstGradeRm = Double.valueOf(df.format(rn1));

			double rn2 = ThreadLocalRandom.current().nextDouble(11);
			double secondGradeRm = Double.valueOf(df.format(rn2));

			double rn3 = ThreadLocalRandom.current().nextDouble(11);
			double thirdGradeRm = Double.valueOf(df.format(rn3));

			Student student = new Student("Anna", "Bar", 25, 'f', firstGradeRm, secondGradeRm, thirdGradeRm);
			double averageGrade = (firstGradeRm + secondGradeRm + thirdGradeRm) / 3;
			
			student.setAverageGrade(averageGrade);
			
			
			if (averageGrade >= 6.0) {
				hasClearedCourse = true;
			

				assertTrue(student.hasClearedTheCourse());
				LOG.info("test HasClearedTheCourse >=6 " + student.hasClearedTheCourse() + " and"+ hasClearedCourse + " is equal\n");
				
				
			} else {
				hasClearedCourse = false;
				assertFalse(student.hasClearedTheCourse());
				LOG.info("test HasClearedTheCourse <6 " + student.hasClearedTheCourse() + " and"+ hasClearedCourse + " is equal\n");
 
			}
		}
	}
	

	 @Test 
	 public void testToStringWhenStudentHasClearedTheCourse() { 
		 Student goodStudent = new Student("Anna", "Bar", 25, 'f', 6.0, 7.0, 8.0);
		 String result = goodStudent.toString();
		 
		 assertTrue(result.contains("Student: Anna Bar"));
		 assertTrue(result.contains("Grades: 6.0, 7.0, 8.0"));
		 assertTrue(result.contains("FinalGrade: 7.0"));
		 assertTrue(result.contains("The student has cleared the course"));
	 }
	 
	 @Test 
	 public void testToStringWhenStudentHasNotClearedTheCourse() { 
		 Student badStudent = new Student("Anna", "Bar", 25, 'f', 1.0, 2.0, 3.0);
		 String result = badStudent.toString();
		 
		 assertTrue(result.contains("Student: Anna Bar"));
		 assertTrue(result.contains("Grades: 1.0, 2.0, 3.0"));
		 assertTrue(result.contains("FinalGrade: 2.0"));
		 assertTrue(result.contains("The student has not cleared the course"));
	 }
}