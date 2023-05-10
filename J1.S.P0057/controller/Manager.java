package controller;

import Model.Account;
import view.Validate;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Manager {


   

    //write new account to data
    public static void addAccount(Account acc) throws Exception {
        File file = new File("D:/user.dat");
        try {

            FileWriter fileWriter = new FileWriter(file, true);
            fileWriter.write(acc.getUsername() + ";" + acc.getPassword() + "\n"); // write username and pass to file
            fileWriter.close();
            System.err.println("Create successful.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //get password by username
    public static Account find(Account acc) throws Exception {
        
        File file = new File("D:/user.dat");
        try {
            // read data in file
            FileReader fileReader = new FileReader(file);  
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] account = line.split(";"); // split username and password
                // check username exist
                if (acc.getUsername().equals(account[0])) {  
                    return new Account(account[0], account[1]);
                }
                
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
