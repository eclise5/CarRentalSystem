import java.util.Scanner;

public class LoginSystem{
    
    public static void main(String[] args) {
        
        // Create object to read user input
        Scanner scanner = new Scanner(System.in);

        //correct login details
        String correctUsername = "Kevin Odhiambo";
        String correctPassword = "Odhiambo-2004";

        int attempts = 3; //number of attempts

        while (attempts > 0){

            // Prompt user for username and password
            System.out.println("Enter username: ");
            String username = scanner.nextLine();

            // Prompt user for password
            System.out.println("Enter password: ");
            String password = scanner.nextLine();

            //print '*' for each character in the password
            for(int i = 0; i < password.length();i++){
                System.out.print("*");
             }

             System.out.println();

             // Check if the entered username and password are correct
             if(username.equals(correctUsername) && password.equals(correctPassword)){
                System.out.println("Login Successful!!");
                break;
             } else {
                attempts--;
                if(attempts > 0){
                    System.out.println("Invalid username or password. You have " + attempts + " attempts left.");
                    scanner.close();
                    return;

                }
                else{
                    attempts--;
                    System.out.println("Invalid username or password. You have " + attempts + " attempts left.");
                    System.out.println("Login Failed!! No attempts left.");
                    scanner.close();
                }
             }

             // message displayed after 3 failed attempts
             System.out.println("Login Failed!! No attempts left.");
             scanner.close();
            }

        }

    }
