public class Student implements Comparable<Student> {
    private int age;
    private String name;

    public Student(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int compareTo(Student o) {
        return name.compareTo(o.getName());
    }

    public String toString() {
        return name + " : " + age;
    }
}
