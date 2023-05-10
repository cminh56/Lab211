package controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import model.EastAsiaCountries;



public class ManageEastAsiaCountries {

    ArrayList<EastAsiaCountries> countryList;

    public ManageEastAsiaCountries() {
        countryList = new ArrayList<>();

    }

    public ArrayList<EastAsiaCountries> getCountryList() {
        return countryList;
    }

    //check duplicate code
    public boolean checkDuplicateCode(String code) {
        for (EastAsiaCountries country : countryList) {
            if (country.getCode().equalsIgnoreCase(code)) {
                return true;
            }
        }
        return false;
    }

    //check duplicate name
    public boolean checkDuplicateName(String name) {
        for (EastAsiaCountries country : countryList) {
            if (country.getName().equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }

    //add name to country list
    public void addToCountryList(EastAsiaCountries country) throws Exception {
        if (country == null) {
            
            throw new Exception("Country information is missing");
            
        }
        countryList.add(country);
    }

    public EastAsiaCountries getRecentlyEnteredInformation() throws Exception {

        //check list size
        if (countryList.isEmpty()) {

           throw new Exception("NO COUNTRY TO DISPLAY !!");
            
        }

        //get country just input = countrry at last index
        EastAsiaCountries country = countryList.get(countryList.size() - 1);

        return country;
    }

    //search country    
    public ArrayList<EastAsiaCountries> searchInformationByName(String name) throws Exception {
        if (getCountryList().isEmpty()) {
            throw new Exception("NO COUNTRY TO DISPLAY !!");
        }

//        name = name.toUpperCase();
        // Create an empty list to store the found countries
        ArrayList<EastAsiaCountries> listFound = new ArrayList<>();

        // Loop through all elements in countryList
        for (EastAsiaCountries eastAsiaCountry : countryList) {
            // Check if a country contains the name and add it to the listFound
            if (eastAsiaCountry.getName().equalsIgnoreCase(name)) {
                listFound.add(eastAsiaCountry);
            }
        }

        // Return the listFound as an array
        return listFound;
    }

    //
    public void addAllElement(ArrayList<EastAsiaCountries> sortList) {
        sortList.addAll(countryList);
    }

    public void sortElement(ArrayList<EastAsiaCountries> sortList) {
        Collections.sort(sortList, new Comparator<EastAsiaCountries>() {
            @Override
            public int compare(EastAsiaCountries o1, EastAsiaCountries o2) {
                return o1.getName().compareToIgnoreCase(o2.getName());
            }
        });
    }

    //sort list
    public ArrayList<EastAsiaCountries> sortInformationByAscendingOrder() throws Exception {
        if (getCountryList().isEmpty()) {
            throw new Exception("NO COUNTRY TO DISPLAY !!");
        }

        // sort list
        ArrayList<EastAsiaCountries> sortList = new ArrayList<>();

        // them cac phan tu vao ben trorng sortList
        addAllElement(sortList);

        // sort phan tu ben trong sortList
        sortElement(sortList);
        return sortList;

    }
}
