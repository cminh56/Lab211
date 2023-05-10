package view;


public class Main {

    public static void main(String[] args) throws Exception {
        //loop until user want to exit
        while (true) {
            int choice = View.menu();
            switch (choice) {
                case 1:
                    View.createNewAccount();
                    break;
                case 2:
                    View.loginSystem();
                    break;
                case 3:
                    return;
            }
        }
    }
}