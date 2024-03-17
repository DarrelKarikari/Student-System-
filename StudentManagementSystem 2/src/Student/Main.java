package Student;

public class Main {
	public static void main(String[] args) {
		Implementation sms = new Implementation();
		
		
		// Create new students
		
		sms.addStudent(new Student(1,"Alice", "A"));
		sms.addStudent(new Student(2, "Bob", "B"));
		sms.addStudent(new Student(3,"Ramesh", "B+"));
		sms.addStudent(new Student(4, "Sanjay", "A-"));
		
		// Read and display students
		
		System.out.println("Students List:");
		sms.viewStudents();
		
		// Update student's details
		
		sms.updatedStudent(2, "Robert", "A+");
		System.out.println("\nAfter updating Bob's details:");
		sms.viewStudents();
		
		// Search for a student by name
		
		System.out.println("\nSearching for Ramesh:");
        Student foundStudent = sms.searchStudentByName("Ramesh");
        System.out.println(foundStudent != null ? foundStudent : "Student not found.");

        // delete a student

        sms.deleteStudent(1);
        System.out.println("\nAfter deleting Alice:");
        sms.viewStudents();
    }
}
