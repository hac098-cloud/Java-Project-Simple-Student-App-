class Student {
    private String name;
    private int age;
    private String major;

    public Student(String name, int age, String major) {
        this.name = name;
        this.age = age;
        this.major = major;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Major: " + major);
    }
}

class CollegeStudent extends Student {
    private String school;

    public CollegeStudent(String name, int age, String major, String school) {
        super(name, age, major);
        this.school = school;
    }

    public void displaySchool() {
        System.out.println("School: " + school);
    }
}

public class StudentApp {
    public static void main(String[] args) {
        CollegeStudent student = new CollegeStudent(
            "Haolong Chen",
            22,
            "Computer Science",
            "UC San Diego"
        );

        student.displayInfo();
        student.displaySchool();
    }
}