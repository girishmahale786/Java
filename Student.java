import java.util.ArrayList;

public class Student {
    // Private fields to store student information
    private int prn; // PRN
    private String name; // Name of the student
    private String dob; // Date of birth of the student
    private float marks; // Marks obtained by the student

    // List of students
    private ArrayList<Student> students = new ArrayList<Student>();

    // Constructor to initialize the student
    public Student() {
        this.prn = 0;
        this.name = "";
        this.dob = "";
        this.marks = 0.0f;
    }

    // Consturctor to initialize the student with the given PRN, name, date of birth, and marks
    public Student(int prn, String name, String dob, float marks) {
        this.prn = prn;
        this.name = name;
        this.dob = dob;
        this.marks = marks;
    }

    // Setter method to set the PRN
    public void setPrn(int prn) {
        this.prn = prn;
    }

    // Getter method to get the PRN
    public int getPrn() {
        return prn;
    }

    // Setter method to set the name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method to get the name
    public String getName() {
        return name;
    }

    // Setter method to set the date of birth
    public void setDob(String dob) {
        this.dob = dob;
    }

    // Getter method to get the date of birth
    public String getDob() {
        return dob;
    }

    // Setter method to set the marks
    public void setMarks(float marks) {
        this.marks = marks;
    }

    // Getter method to get the marks
    public float getMarks() {
        return marks;
    }

    // Setter method to set the marks
    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    // Getter method to get the Students
    public ArrayList<Student> getStudents() {
        return students;
    }

    // Method to get the details of the student as a string
    public String toString() {
        String student = String.format("PRN: %d, Name: %s, DOB: %s, Marks: %.2f", prn, name, dob, marks);
        return student;
    }

    // Method to add students
    public void add(int studentsCount) {
        UserInput userInput = new UserInput();
        int i = 1;
        System.out.println("Enter Student Details in the following order: PRN Name DOB Marks");
        while (i <= studentsCount){
            try {
                System.out.printf("Student %d: ", i);
                Student student = userInput.getStudentInput();
                students.add(student);
                i++;
            }catch (Exception e) {
                System.out.println("Invalid Input format. Please try again.");
            }
        }
    }

    // Method to display all the students
    public void display() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }
        System.out.println("All Student Details:");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    // Method to search for a student
    public int search(int prn) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getPrn() == prn) {
                return i;
            }
        }
        return -1;
    }

    // Method to update a student
    public void update(int prn) {
        int index = search(prn);
        if (index == -1) {
            System.out.println("Student with PRN " + prn + " not found.");
            return;
        }

        String name =  new UserInput().getStringInput("Enter new name: ");
        students.get(index).setName(name);
        System.out.println("Student with PRN " + prn + " updated successfully.");
    }

    // Method to delete a student
    public void delete(int prn) {
        int index = search(prn);
        if (index == -1) {
            System.out.println("Student with PRN " + prn + " not found.");
            return;
        }
        students.remove(index);
        System.out.println("Student with PRN " + prn + " deleted successfully.");
    }
}
