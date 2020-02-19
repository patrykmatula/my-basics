import java.util.Scanner;

public class studentsStatistics {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many students are in class: ");
        int howManystudents = scanner.nextInt();
        int[] studentsScore = new int[howManystudents];
        double[] studentsPercentage = new double[howManystudents];

        for (int studentCounter = 0; studentCounter < howManystudents; studentCounter++) {

            System.out.print("Student number " + (studentCounter + 1) + " score in 1-6: ");
            studentsScore[studentCounter] = scanner.nextInt();

            if (studentsScore[studentCounter] < 1 || studentsScore[studentCounter] > 6) {
                System.out.print("Student number " + (studentCounter + 1) + " score in 1-6: ");
                studentsScore[studentCounter] = scanner.nextInt();
            }

            System.out.print("Student number " + (studentCounter + 1) + " score in %: ");
            studentsPercentage[studentCounter] = scanner.nextDouble();

            if ( studentsPercentage[studentCounter] < 0.00 || studentsPercentage[studentCounter] > 100.00) {
                System.out.print("Student number " + (studentCounter + 1) + " score in %: ");
                studentsPercentage[studentCounter] = scanner.nextDouble();
            }
        }
        System.out.println("\nResuls:");
        int sumScore = 0;
        double sumPercentage = 0;
        for (int studentCounter = 0; studentCounter < howManystudents; studentCounter++) {
            System.out.println("Student " + (studentCounter + 1) + " score is " + studentsScore[studentCounter] + " and percentage is " + studentsPercentage[studentCounter] + ".");
            sumScore = sumScore + studentsScore[studentCounter];
            sumPercentage = sumPercentage + studentsPercentage[studentCounter];
        }
        System.out.println("Average score is " + (sumScore / howManystudents) + ".");
        System.out.println("Average score in % is " + (sumPercentage / howManystudents) + ".");
        }
    }

