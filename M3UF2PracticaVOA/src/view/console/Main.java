/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.console;
import java.util.Scanner;
import model.validations.UserDataValidations;
import model.exceptions.InvalidIdException;
import model.exceptions.InvalidPostalCodeException;
 
/**
 *
 * @author Víctor
 */
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String option;
        do {
            System.out.println("MENU: ");
            System.out.println("1.- Tester checkId");
            System.out.println("2.- Tester checkFormatDate");
            System.out.println("3.- Tester calculateAge");
            System.out.println("4.- Tester checkPostalCode");
            System.out.println("5.- Tester isNumeric");
            System.out.println("6.- Tester isAlphabetic");
            System.out.println("7.- Tester checkEmail");
            System.out.println("8.- Tester checkName");
            System.out.println("z.- Salir");
            System.out.print("Option: ");
            option = sc.next();
            switch (option) {
                case "1":
                    testCheckId();
                    break;
                case "2":
                    testCheckFormatDate();
                    break;
                case "3":
                    testCalculateAge();
                    break;
                case "4":
                    testCheckPostalCode();
                    break;
                case "5":
                    testIsNumeric();
                    break;
                case "6":
                    testIsAlphabetic();
                    break;
                case "7":
                    testCheckEmail();
                    break;
                case "8":
                    testCheckName();
                    break;
                case "z":
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Incorrect option");
            }
        } while (!option.equals("z"));
        
    }
    
    static void testCheckId(){
        System.out.println("NIF Validator");
        System.out.print("Enter your id: ");
        String nif = sc.next();
        try {
            UserDataValidations.checkId(nif);
            System.out.println("Correct id");
        } catch (InvalidIdException e) {
            System.out.println("Wrong id: " + e.getMessage());
        }
    }
    
    static void testCheckFormatDate(){
        System.out.println("Date Validator");
        System.out.print("Enter the posible date: ");
        String posDate = sc.next();
        boolean dateOk = UserDataValidations.checkFormatDate(posDate);
        if(dateOk){
            System.out.println("The date is correct");  
        }
        else {
            System.out.println("The date is not correct");
        }
    }
    
    static void testCalculateAge(){
        System.out.println("Date Validator");
        System.out.print("Enter the possible date (dd/mm/yyyy): ");
        String posDate = sc.next();
        boolean dateOk = UserDataValidations.checkFormatDate(posDate);

        if (dateOk) {
            System.out.println("The date is correct");
            int age = UserDataValidations.calculateAge(posDate);
            if (age != -1) {
                System.out.println("The calculated age is: " + age);
            } 
            else {
                System.out.println("Invalid date, could not calculate age.");
            }
        }
        else {
            System.out.println("The date is not correct");
        }
    }
    
    static void testCheckPostalCode(){
        System.out.println("ZIP Validator");
        System.out.print("Enter the posible zip: ");
        String posZIP = sc.next();
        try {
            UserDataValidations.checkPostalCode(posZIP);
            System.out.println("The ZIP is correct");
        } catch (InvalidPostalCodeException e) {
            System.out.println("The ZIP is not correct: " + e.getMessage());
        }
    }
    
    static void testIsNumeric(){
        System.out.println("Numeric Validator");
        System.out.print("Enter the posible number: ");
        String posNumber = sc.next();
        boolean numberOk = UserDataValidations.isNumeric(posNumber);
        if(numberOk){
            System.out.println("Is a number");  
        }
        else {
            System.out.println("Is not a number");
        }
    }
    
    static void testIsAlphabetic(){
        System.out.println("Alphabetic Validator");
        System.out.print("Enter the posible text: ");
        String posLetter = sc.next();
        boolean letterOk = UserDataValidations.isAlphabetic(posLetter);
        if(letterOk){
            System.out.println("Is alphabetic");  
        }
        else {
            System.out.println("Is not alphabetic");
        }
    }
    
    static void testCheckEmail(){
        System.out.println("Email Validator");
        System.out.print("Enter the email: ");
        String posEmail = sc.next();
        boolean emailOk = UserDataValidations.checkEmail(posEmail);

        if (emailOk) {
            System.out.println("The email is correct");
        } 
        else {
            System.out.println("The email is not correct");
        }
    }
    
    static void testCheckName(){
        System.out.println("Name Validator");
        System.out.print("Enter the name: ");
        String posName = sc.next();
        boolean nameOk = UserDataValidations.checkName(posName);

        if (nameOk) {
            System.out.println("The name is correct");
        } 
        else {
            System.out.println("The name is not correct");
        }
    }
}