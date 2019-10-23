import java.util.Scanner;

public class Signup {

    public Signup(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Sign up as \n 1)Customer \t 2)Supplier \n Enter your choice");
        int choice = scanner.nextInt();
    }


    public Customer signup() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Sign up as \n 1)Customer \t 2)Supplier \n Enter your choice");
        int choice = scanner.nextInt();
        if (choice == 1) {

            System.out.println("Enter your email: ");
            String username = scanner.nextLine();
            String password = scanner.nextLine();
            double mob = scanner.nextDouble();

            Customer temp = new Customer(username, password, mob);
            return temp;
        }

    }
        public Customer signupS(){

            if (choice == 2) {

                System.out.println("Enter your email: ");
                String username = scanner.nextLine();
                String password = scanner.nextLine();
                double mob = scanner.nextDouble();

                Customer temp = new Customer(username, password, mob);
                return temp;
            }
        }
    }
