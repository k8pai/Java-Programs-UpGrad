import java.util.ArrayList;
import java.util.List;

class Source{
    public static void main(String[] args) {
        Institute ca = new Institute("Christ Academy");
        Student s11 = new Student("Vigyan", ca);
        Student s12 = new Student("Vedanshi", ca);
        Student s13 = new Student("Jahnvi", ca);
        Student s14 = new Student("Abhiraj", ca);
        Student[] ca_students = { s11, s12, s13, s14 };
        ca.addStudent(ca_students);

        Institute vibgyor = new Institute("VIBGYOR");
        Student s21 = new Student("Sai", vibgyor);
        Student s22 = new Student("Pragati", vibgyor);
        Student s23 = new Student("Mukil", vibgyor);
        Student[] vibgyor_students = { s21, s22, s23 };
        vibgyor.addStudent(vibgyor_students);

        System.out.println(ca);
        System.out.println(vibgyor);
    }
}

class Institute{
    private final String name;
    private final List<Student> students = new ArrayList<Student>();

    public int numberOfStudents = 1;

    public Institute(String n) {
        this.name = n;
    }

    public void addStudent(Student s) {
        this.students.add(s);
    }

    public void addStudent(Student[] array) {
        for(Student s : array) {
            this.students.add(s);
        }
    }

    public String toString() {
        String str = this.name + ": ";
        for(Object s : this.students) {
            str += s.toString() + ", ";
        }
        return str;
    }
}

class Student {
  private final String name;
  private final int rollNumber;
  private final Institute institute;
  
  public Student(String n, Institute institute) {
    this.name       = n;
    this.institute  = institute;
    this.rollNumber = this.institute.numberOfStudents++;
  }

  public String toString() {
    return this.name + " " + this.rollNumber;
  }
}