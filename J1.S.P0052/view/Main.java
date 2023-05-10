

package view;

public class Main {

    public static void main(String[] args) throws Exception {
        ViewCountry view = new ViewCountry();
        while (true) {
            ViewCountry.displayMenu();

            //enter option
            int option = Utility.getInt("Enter option: ", "Invalid", 1, 5);

            switch (option) {
                case 1:
                    //1. Enter the information for 11 countries in Southeast Asia.
                    view.inputCountry();
                    break;
                case 2:
                    //2. Display the information of country you've just input
                    view.displayCountryJustInput();
                    break;
                case 3:
                    //Search the information of country by user-entered name
                    view.searchCountryByName();
                    break;
                case 4:
                    //Display the information of countries sorted name in ascending order
                    view.sortAscendingCountryByName();
                    break;
                case 5:
                    System.exit(0);
                    break;

            }
        }

    }

    
}