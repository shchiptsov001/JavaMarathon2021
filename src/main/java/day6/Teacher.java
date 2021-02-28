package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public void evaluate(Student myStudent) {
        int rating;
        String appraisal;
        Random random = new Random();
        rating = random.nextInt(4) + 2;
        switch (rating) {
            case 2:
                appraisal = "неудовлетворительно";
                break;
            case 3:
                appraisal = "удовлетворительно";
                break;
            case 4:
                appraisal = "хорошо";
                break;
            default:
                appraisal = "отлично";
        }
        System.out.println("Преподаватель " + name + " оценил студента с именем " + myStudent.getName()
                + " по предмету " + subject + " на оценку " + appraisal);
    }
}
