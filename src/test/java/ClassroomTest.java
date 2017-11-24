import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import otherclasses.Classroom;
import otherclasses.Student;

public class ClassroomTest {

	@Test
	public void testClassRoomConstructor() {
		ArrayList<Student> students = new ArrayList<Student>();
		Classroom classroom = new Classroom("Room 1", "Room1 Term", students);
		assertEquals(classroom.getClassroomName().equals("Room 1"), true);
	}

	@Test
	public void testGetClassroomName() {
		ArrayList<Student> students = new ArrayList<Student>();
		Classroom classRoom = new Classroom("", "", students);
		classRoom.setClassroomName("A201");
		assertEquals(classRoom.getClassroomName().equals("A201"), true);

	}

	@Test
	public void testGetClassroomTerm() {
		ArrayList<Student> students = new ArrayList<Student>();
		Classroom classRoom = new Classroom("Room #1", "Room#1 term", students);
		assertEquals(classRoom.getClassroomName().equals("Room #1"), true);

	}

	@Test
	public void testArrayList() {
		ArrayList<Student> student = new ArrayList<Student>(5);
		// Classroom classRoom = new Classroom("Room #1", "Room#1 term", students);
		student.set(0, new Student("Anna", "Bar", 25, 'f', 6.0, 7.0, 8.0));
		student.set(1, new Student("Sveta", "Barysheva", 50, 'f', 10.0, 10.0, 8.0));
		assertEquals(student.get(1).equals("Sveta"), true);
		
	}
}