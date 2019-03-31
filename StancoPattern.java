/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stancouniv;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author ACER PC
 */
public class StancoPattern {
    
   
    public static void main(String[] args) {
          Scanner sr = new Scanner(System.in);
        String patternString = "([0-9])+([0-9])+([0-9])";
        System.out.println("Date of Birth (dd:mm:yyyy)");

        String valiDate = sr.next();

        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(valiDate);
        
        if (matcher.matches()) {
            System.out.println("Your Age is Uploaded Succesfully");
        }else {
            System.out.println("Please Enter the correct format");
        }
    }
    
}
