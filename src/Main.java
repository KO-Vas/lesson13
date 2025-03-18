import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>(List.of(
                new Student("Константин", "Группа А", 2, List.of(4, 5, 3)),
                new Student("Василий", "Группа Б", 1, List.of(2, 2, 2)),
                new Student("Юлия", "Группа В", 3, List.of(5, 5, 5))
        ));


        StudentUtils.removeUnderperformingStudents(students);
        System.out.println("После удаления: " + students);

        StudentUtils.promoteStudents(students);
        System.out.println("После перевода: " + students);

        StudentUtils.printStudents(students, 3);
<<<<<<< HEAD


        PhoneDirectory phoneDirectory = new PhoneDirectory();
        phoneDirectory.add("Иванов", "+7-999-123-45-67");
        phoneDirectory.add("Иванов", "+7-888-222-33-44");
        phoneDirectory.add("Петров", "+7-800-800-80-80");

        System.out.println("\nТелефонный справочник:");
        System.out.println("Иванов: " + phoneDirectory.get("Иванов"));
        System.out.println("Сидоров: " + phoneDirectory.get("Сидоров"));
=======
>>>>>>> f5fcd6ad649f4fdf7db2b06a29cf589d4a810f53
    }
}