package day8;

public class Task1 {
    public static void main(String[] args) {
//        int number = 20000;
//        String myString = "";
//        for (int i = 0; i < number + 1; i++) {
//            myString = myString + i + " ";
//        }
//        System.out.println(myString);

        int number = 20000;
        StringBuilder myString = new StringBuilder("");
        for (int i = 0; i < number + 1; i++) {
            myString.append(i).append(" ");
        }
        System.out.println(myString);
    }
}
