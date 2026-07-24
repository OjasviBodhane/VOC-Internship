import java.util.ArrayList;

public class StudentManager {

    private ArrayList<Student> students = new ArrayList<>();

    // Add Student
    public void addStudent(Student student) {
        students.add(student);
        System.out.println("\nStudent Added Successfully!");
    }

    // Display Students
    public void displayStudents() {

        if (students.isEmpty()) {
            System.out.println("\nNo Students Found.");
            return;
        }

        System.out.println("\n========== STUDENT RECORDS ==========");

        for (Student student : students) {
            student.display();
        }
    }

    // Search Student
    public void searchStudent(int id) {

        for (Student student : students) {

            if (student.getId() == id) {

                System.out.println("\nStudent Found:");
                student.display();
                return;
            }
        }

        System.out.println("\nStudent Not Found.");
    }

    // Delete Student
    public void deleteStudent(int id) {

        for (int i = 0; i < students.size(); i++) {

            if (students.get(i).getId() == id) {

                students.remove(i);
                System.out.println("\nStudent Deleted Successfully!");
                return;
            }
        }

        System.out.println("\nStudent Not Found.");
    }

    public static void main(String[] args) {
        app.main(args);
    }

}