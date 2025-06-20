import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student {

    public String firstName;
    public String lastName;
    public String indexNumber;
    public List<Double> grades;

    public Student(String firstName, String lastName, String indexNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.indexNumber = indexNumber;
        this.grades = new ArrayList<>();
    }

    public void addGrade(double grade) {
        if (this.grades.size() >= 20) {
            throw new IllegalStateException("Student może mieć maksymalnie 20 ocen.");
        }
        this.grades.add(grade);
    }

    public double calculateAverage() {
        if (grades.isEmpty()) {
            throw new IllegalArgumentException("Student nie ma żadnej oceny do wyliczenia średniej.");
        }

        double sum = 0.0;
        for (double grade : grades) {
            sum += grade;
        }

        double average = sum / grades.size();

        return Math.round(average * 2) / 2.0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(indexNumber, student.indexNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(indexNumber);
    }
}