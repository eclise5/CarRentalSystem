import java.util.Scanner;

public class KDFRecruitment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("   KENYA DEFENCE FORCES RECRUITMENT     ");

        System.out.print("Enter candidate's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter height in feet: ");
        double height = scanner.nextDouble();

        System.out.print("Enter weight in kg: ");
        double weight = scanner.nextDouble();

        scanner.nextLine();

        System.out.print("Is the candidate a Kenyan citizen? (yes/no): ");
        String citizenshipInput = scanner.nextLine().trim().toLowerCase();
        boolean isKenyan = citizenshipInput.equals("yes");

        System.out.print("Do you have a criminal record? (yes/no): ");
        String criminalInput = scanner.nextLine().trim().toLowerCase();
        boolean hasCriminalRecord = criminalInput.equals("yes");

        System.out.println("RECRUITMENT RESULTS");

        boolean meetsHeight = height >= 5.4;
        boolean meetsWeight = weight >= 55;
        boolean meetsAll = meetsHeight && meetsWeight && isKenyan && !hasCriminalRecord;

        if (meetsAll) {
            System.out.println("You have been successfully recruited into the KENYAN DEFENCE FORCES, Serve with honour, integrity and courage.");
        } else {
            System.out.println("You do not meet all the KDF recruitment criteria, Please try again next time, We wish you all the best.");
        }
        scanner.close();
    }
}
