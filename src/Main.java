import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Customer customers[] = new Customer[100];
        Supplier suppliers[] = new Supplier[100];


        System.out.println("1)Sign up \t 2)Login \t 3)supplier Login \n Enter your choice");

        int choice = scanner.nextInt();
        if (choice == 1) {
            Signup signup = new Signup();
            customers[customers.length] = signup.signup();
        }

        if(choice == 2){
           // Login login = new Login();
            String loginusername = scanner.nextLine();
            String loginpassword = scanner.nextLine();
            for(int i=0;i<customers.length;i++){
                if(loginusername == customers[i].username && loginpassword == customers[i].password){
                    System.out.println("Login Success");
                    Customer current = customers[i];
                    current.defaults();
                }
                else
                    System.out.println("Login failed");
            }
        }

        if(choice == 3){
            String loginusername = scanner.nextLine();
            String loginpassword = scanner.nextLine();
            for(int i=0;i<customers.length;i++){
                if(loginusername == customers[i].username && loginpassword == customers[i].password){
                    System.out.println("Login Success");
                    Customer current = customers[i];
                    current.defaults();
                }
                else
                    System.out.println("Login failed");
            }
        }



    }












































}



