package seminar3;

public class StudentController {

    public StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    public void printAll() {
        studentService.printAll();
    }

    public boolean deleteStudent(String fullName) {
        studentService.deleteStudent(fullName);
        return true;
    }

    public void addStudent(Student student) {
        studentService.addStudent(student);
    }

    public void sortStudents() {
        studentService.sortStudents();
    }

    public void sortByFamilyName() {
        studentService.sortByFamilyName();
    }

}
