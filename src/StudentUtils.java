import java.util.Set;
import java.util.Iterator;

public class StudentUtils {


    public static void removeUnderperformingStudents(Set<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getAverageGrade() < 3.0) {
                iterator.remove();
            }
        }
    }

       public static void promoteStudents(Set<Student> students) {
        for (Student student : students) {
            if (student.getAverageGrade() >= 3.0) {
                student.promote();
            }
        }
    }

       public static void printStudents(Set<Student> students, int course) {
        System.out.println("Студенты " + course + " курса:");
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }
}