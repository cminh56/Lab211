package view;

import Model.Account;
import static controller.Manager.addAccount;
import static controller.Manager.find;

public class View {

    //display menu
    public static int menu() {
        System.out.println("\n1. Create a new account.");
        System.out.println("2. Login system.");
        System.out.println("3. Exit.");
        System.out.print("Enter your choice: ");
        int choice = Validate.checkInputIntLimit(1, 3);
        return choice;
    }

    //create a new account
    public static void createNewAccount() throws Exception {
//        check file data exist or not, if not create it
        if (!Validate.checkFileExist()) {
           
            return;
        }
        String username = Validate.checkInputUsername(); //input and check username
        String password = Validate.checkInputPassword(); // input and check password
        //check username exist or not
        if (!Validate.checkUsernameExist(username)) {
            System.err.println("Username exist.");
            return;
        }
        // add account
        Account acc = new Account(username, password);
        addAccount(acc);
    }

    //login system
    public static void loginSystem() throws Exception {
        //check file data exist or not, if not create it
        if (!Validate.checkFileExist()) {
            
            return;
        }

        String username = Validate.checkInputUsername();  // input and check username
        String password = Validate.checkInputPassword();  //  input and check password

        Account acc = new Account(username, password);
        Account foundAcc = find(acc); // acc exist in file

        //check username exist or not
        if (!Validate.checkUsernameExist(username)) {
            // check password correct or not
            if (password.equals(foundAcc.getPassword())) {
                System.err.println("Login successful.");
            } else {
                System.err.println("Invalid username or password");
            }
        } else {
            System.err.println("Invalid username or password");
        }

    }

}
