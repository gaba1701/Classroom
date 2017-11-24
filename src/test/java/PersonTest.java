import static org.junit.Assert.*;

import org.junit.Test;

import otherclasses.Person;
import otherclasses.Student;

public class PersonTest {

	@Test
	public void test() {
		Person p = new Person("Rafael", "Silva", 30,'M');
		assertEquals(p.getFirstName().equals("Rafael"),true);// why do we need to have equals?
	}

	@Test  
	public void testLastname() {
		Student student = new Student("Anna", "Bar", 25, 'f');
		student.setLastName("Barysheva");
		assertEquals(student.getLastName(), "Barysheva");
	}
	@Test
	public void testAge() {
		Student student = new Student("", "", 25, ' ');
		student.setAge(31);
		assertEquals(student.getAge(), 31);
	}
	@Test
	public void testGender() {
	Student student = new Student("", "", 25, 'f');
	student.setGender('m');
	assertEquals(student.getGender(),'m');
	}
}
