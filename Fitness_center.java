package BridgeLabzTraining3Y.work;
import java.util.*;

public class Fitness_Center {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to GLA Fitness Center: ");
        System.out.println("Membership plans available: Monthly, Quarterly, Yearly");

        int totalAmount = 0;
        String[] plans = {"Monthly", "Quarterly", "Yearly"};
        boolean booking = true;

        while (booking) {
            System.out.println("\nAre you a student or senior citizen? (1-Yes / 0-No)");
            int isStudentOrSenior = sc.nextInt();

            if (isStudentOrSenior == 1) {
                System.out.println("You get a 10% discount on all plans!");
            }

            System.out.println("Choose your membership plan (1-Monthly / 2-Quarterly / 3-Yearly): ");
            int choice = sc.nextInt();

            int fee = 0;
            switch (choice) {
                case 1:
                    fee = 100;
                    break;
                case 2:
                    fee = 250;
                    break;
                case 3:
                    fee = 900;
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
                    continue;  
            }

           
            if (isStudentOrSenior == 1) {
                fee = fee - (fee / 10);  
            }

            totalAmount += fee;
            System.out.println("Membership in " + plans[choice - 1] + " plan booked. Fee: " + fee);
            System.out.println("Total amount so far: " + totalAmount);

            System.out.println("Do you want to book another membership? (1-Yes / 0-No)");
            int moreBooking = sc.nextInt();
            if (moreBooking == 0) {
                booking = false;
            }
        }

        System.out.println("\nFinal Total Amount to Pay: " + totalAmount);
        System.out.println("Thank you for choosing GLA Fitness Center!");
        sc.close();
    }
}
