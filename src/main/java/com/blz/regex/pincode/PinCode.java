package com.blz.regex.pincode;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PinCode {
    public static final Scanner sc = new Scanner(System.in);
    public static final String PINCODE = "^[0-9]{3}\\s{1}[0-9]{3}$";
    public static void main(String[] args) {
        PinCode pinCode = new PinCode();
        System.out.println("Enter pincode : ");
        pinCode.isValidPostCode(sc.nextLine());
    }

    public void isValidPostCode(String name){
        try {
            if (isValidInput(PINCODE,name)){
                System.out.println("Valid PinCode is : " +name);
            }else {
                throw new InvalidUserInformationException("Invalid PinCode");
            }
        }catch (InvalidUserInformationException e){
            System.out.println(e);
        }
    }
    public static boolean isValidInput(String regex, String userInput){
        return Pattern.matches(regex,userInput);
    }
}

class InvalidUserInformationException extends RuntimeException {
    public InvalidUserInformationException() {
        super();
    }

    public InvalidUserInformationException(String msg) {
        super(msg);
    }
}
