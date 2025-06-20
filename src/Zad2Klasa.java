import java.util.ArrayList;
import java.util.List;

public class StudentGroup {

    public String groupName;
    public List<Student> students;

    public StudentGroup(String groupName) {
        this.groupName = groupName;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        if (this.students.size() >= 15) {
            throw new IllegalStateException("Grupa jest pełna. Maksymalna liczba studentów to 15.");
        }
        if (this.students.contains(student)) {
            throw new IllegalStateException("Student o numerze indeksu " + student.indexNumber + " już jest w tej grupie.");
        }
        this.students.add(student);
    }
}