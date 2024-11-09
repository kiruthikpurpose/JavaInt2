class Student2 {
    private String name;
    private int id;

    public Student2(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}

class Course2 {
    private String title;

    public Course2(String title) {
        this.title = title;
    }

    public void enrollStudent(Student2 student) {
        System.out.println("Student " + student.getName() + " with ID " + student.getId() + " has been enrolled in the course: " + title);
    }
}

public class Main2 {
    public static void main(String[] args) {
        Student2 student1 = new Student2("John", 101);
        Course2 mathCourse = new Course2("Mathematics");
        mathCourse.enrollStudent(student1);

        Student2 student2 = new Student2("Alice", 102);
        Course2 physicsCourse = new Course2("Physics");
        physicsCourse.enrollStudent(student2);

        Student2 student3 = new Student2("Bob", 103);
        Course2 csCourse = new Course2("Computer Science");
        csCourse.enrollStudent(student3);
    }
}
