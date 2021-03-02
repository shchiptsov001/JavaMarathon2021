package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student myStudent = new Student("Bob", "Ab-61z");
        Teacher myTeacher = new Teacher("Alex", "Mathematics");
        System.out.println(myStudent.getGroupName());
        System.out.println(myTeacher.getSubjectName());
        myStudent.printInfo();
        myTeacher.printInfo();
    }
}
