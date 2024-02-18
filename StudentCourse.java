import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Student {
    String name;
    String program;
    int semester;
    Map<String, Integer> courseMarks;

    public Student(String name, String program, int semester) {
        this.name = name;
        this.program = program;
        this.semester = semester;
        this.courseMarks = new HashMap<>();
    }

    public void registerCourse(String course, int marks) {
        courseMarks.put(course, marks);
    }

    public void displayStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Program: " + program);
        System.out.println("Semester: " + semester);
        System.out.println("Courses Registered: " + courseMarks.keySet());
    }

    public void displayLowScoringCourses() {
        System.out.println("Courses where the student scored less than 40:");
        for (Map.Entry<String, Integer> entry : courseMarks.entrySet()) {
            if (entry.getValue() < 40) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}

public class StudentCourse {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        Student student1 = new Student("John", "Computer Science", 3);
        student1.registerCourse("Math", 85);
        student1.registerCourse("Physics", 30);
        students.add(student1);

        Student student2 = new Student("Roy", "Engineering", 2);
        student2.registerCourse("Chemistry", 75);
        student2.registerCourse("Biology", 35);
        students.add(student2);

        for (Student student : students) {
            student.displayStudentInfo();
            student.displayLowScoringCourses();
            System.out.println();
        }
    }
}

