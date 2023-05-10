package view;

import controller.ManageEastAsiaCountries;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import model.EastAsiaCountries;

public class ViewCountry {

    ManageEastAsiaCountries manage = new ManageEastAsiaCountries();

    
    public static void displayMenu() {
        System.out.println("                               MENU\n"
                + "==========================================================================\n"
                + "1. Input the information of 11 countries in East Asia\n"
                + "2. Display the information of country you've just input\n"
                + "3. Search the information of country by user-entered name\n"
                + "4. Display the information of countries sorted name in ascending order  \n"
                + "5. Exit \n"
                + "==========================================================================");
    }
    
    
    void inputCountry() throws Exception {
        String code, name, terrain;
        float area;
        //input information
        while (true) {
            code = Utility.getString("Enter code of country: ", "invalid input", Utility.valid_CODE);
            //check duplicate code
            // => true => duplicate code => bao loi => nhap lai
            // => false => not duplicate  => break => nhap tiep
            if (manage.checkDuplicateCode(code)) {
                System.out.println("DUPLICATE CODE !!");
            } else {
                break;
            }
        }
        while (true) {
            name = Utility.getString("Enter name of country: ", "invalid input", Utility.valid_NAME);
            //check duplicate code
            // => true => duplicate code => bao loi => nhap lai
            // => false => not duplicate  => break => nhap tiep
            if (manage.checkDuplicateName(name)) {
                System.out.println("DUPLICATE NAME !!");
            } else {
                break;
            }
        }

        area = Utility.getFloat("Enter area: ", "invalid input", 0, Float.MAX_VALUE);
        terrain = Utility.getString("Enter terrain of country: ", "invalid input", Utility.valid_NAME);

        //add to list
        EastAsiaCountries country = new EastAsiaCountries(code, name, area, terrain);
        manage.addToCountryList(country);
        System.out.println("ADD SUCCESSFULL !!");
    }

//    void displayCountryJustInput() {
    public void displayCountryJustInput() throws Exception {
     //display
        System.out.format("%-15s %-15s %-15s %-15s\n", "ID", "Name", "Area", "Terrain");
        manage.getRecentlyEnteredInformation().display();
    }

    void searchCountryByName() throws Exception  {
        // tao ra cai gio countryListFOund
        ArrayList<EastAsiaCountries> listFound = new ArrayList<>();
        //input name
        String name = Utility.getString("Enter name of country: ", "Invalid input", Utility.valid_NAME);
        //tim quoc gia by contain
        listFound= manage.searchInformationByName(name);
        //not found
        if (listFound.isEmpty()) {
            System.out.println("NOT FOUND !!");
        } else {
            //found
            System.out.format("%-15s %-15s %-15s %-15s\n", "ID", "Name", "Area", "Terrain");
            for (EastAsiaCountries eastAsiaCountry : listFound) {
                eastAsiaCountry.display();
            }
        }

    }

    void sortAscendingCountryByName() throws Exception  {
       ArrayList<EastAsiaCountries> sortList = new ArrayList<>();
       sortList = manage.sortInformationByAscendingOrder();
        //hien thi ra phan tu ben trong sortList
        System.out.format("%-15s %-15s %-15s %-15s\n", "ID", "Name", "Area", "Terrain");
        for (EastAsiaCountries eastAsiaCountry : sortList) {
            eastAsiaCountry.display();
        }

    }
}
