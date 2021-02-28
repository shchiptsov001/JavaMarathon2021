package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher myTeacher = new Teacher("Баранцев Роман", "Информатика");
        Student myStudent = new Student("Иванов Василий");
        myTeacher.evaluate(myStudent);
    }
}
