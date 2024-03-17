package Student;
import java.util.ArrayList;
import java.util.List;

public class Implementation {
	
	private List<Student> students = new ArrayList<>();
	
	// Create a student
	
	public void addStudent(Student student) {
		students.add(student);
	}
	
	//Read all students
	
	public void viewStudents() {
		students.forEach(System.out::println);
	}
	
	// Update a student's details
	
	public void updatedStudent(int id, String newName, String newGrade) {
		for (Student s : students) {
			if (s.getId() == id) {
				s.setName(newName);
				s.setGrade(newGrade);
				break;
			}
		}
	}
	
	// delete a student by id
	
	public void deleteStudent(int id) {
		students.removeIf(s -> s.getId() == id);
	}
	
	// search student by name
	public Student searchStudentByName(String name) {
		for (Student s: students) {
			if (s.getName().equalsIgnoreCase(name)) {
				return s;
			}
		}
		return null;
	}
}
