import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

public class studentsStatistics {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("How many students are in class: ");
        int howManystudents = scanner.nextInt();
        int[] studentsScore = new int[howManystudents];

        for (int studentCounter = 0; studentCounter < howManystudents; studentCounter++) {
            System.out.print("Student number " + (studentCounter + 1) + " score: ");
            studentsScore[studentCounter] = scanner.nextInt();
        }

        
    }
}
