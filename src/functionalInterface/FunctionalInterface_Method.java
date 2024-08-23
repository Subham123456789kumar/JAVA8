package functionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "'}";
    }
}

public class FunctionalInterface_Method {

    public static void main(String[] args) {

        Function<String, Integer> function = x -> x.length();
        System.out.println(function.apply("subham"));

        Function<String, String> function2 = s -> s.substring(0, 3);
        System.out.println(function2.apply("subham"));

        // Function to filter students whose name starts with a certain prefix
        Function<List<Student>, List<Student>> studentsWithPrefix = li -> {
            List<Student> result = new ArrayList<>();
            String prefix = "sub"; // You can change this prefix as needed

            for (Student s : li) {
                if (function2.apply(s.getName()).equals(prefix)) {
                    result.add(s);
                }
            }

            return result;
        };

        Student s1 = new Student(2, "komal");
        Student s2 = new Student(3, "subham");
        Student s3 = new Student(4, "mona");
        Student s4 = new Student(5, "subnam");
        Student s5 = new Student(6, "pinki");

        List<Student> students = Arrays.asList(s1, s2, s3, s4, s5);

        List<Student> filteredStudents = studentsWithPrefix.apply(students);

        System.out.println(filteredStudents);
    }
}
