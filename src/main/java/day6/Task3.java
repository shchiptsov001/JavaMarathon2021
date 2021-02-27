package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher myTeacher = new Teacher("Баранцев Роман", "Информатика");
        Student myStudent = new Student("Иванов Василий");
        System.out.println("Преподаватель " + myTeacher.getName() + " оценил студента с именем " + myStudent.getName()
                + " по предмету " + myTeacher.getSubject() + " на оценку " + myTeacher.evaluate(myStudent));
    }
}
