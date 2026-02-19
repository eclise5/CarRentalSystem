import java.util.Scanner;

public class Employee {

    double hoursWorked;
    double hourlyRate;

    void getEmployeeDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("EMPLOYEE SALARY SYSTEM");

        System.out.print("Enter Hours Worked: ");
        hoursWorked = scanner.nextDouble();

        System.out.print("Enter Hourly Rate (KSH): ");
        hourlyRate = scanner.nextDouble();
    }

    void computeSalary() {
        double salary = hoursWorked * hourlyRate;

        System.out.println("SALARY SUMMARY");
        System.out.println("Hours Worked  : " + hoursWorked + " hrs");
        System.out.println("Hourly Rate   : KSH " + hourlyRate);
        System.out.println("Total Salary  : KSH " + salary);

    }

    public static void main(String[] args) {

        Employee mystaff = new Employee();

        mystaff.getEmployeeDetails();
        mystaff.computeSalary();
    }
}
