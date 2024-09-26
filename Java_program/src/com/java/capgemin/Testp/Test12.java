package com.java.capgemin.Testp;

public class Test12 {
    private static void checkString(String input) {
        String specialChars = "~`!@#$%^&*()-_=+\\|[{]};:'\",<.>/?";
        char currentCharacter;
        String numberPresent = "";
        String upperCasePresent = "";
        String lowerCasePresent = "";
        String specialCharacterPresent = "";


        for (int i = 0; i < input.length(); i++) {
            currentCharacter = input.charAt(i);
            if (Character.isDigit(currentCharacter)) {
                numberPresent = numberPresent+Character.toString(currentCharacter);
            } else if (Character.isUpperCase(currentCharacter)||Character.isLowerCase(currentCharacter)) {
                upperCasePresent = upperCasePresent+Character.toString(currentCharacter);
            } else if (specialChars.contains(String.valueOf(currentCharacter))) {
                specialCharacterPresent = specialCharacterPresent+Character.toString(currentCharacter);;
            }
        }
        System.out.println(numberPresent+":"+ upperCasePresent +":" +specialCharacterPresent);


    }


    public static void main(String[] args) {
        String str = "Tod&ay %%is m0onda234y";
        checkString(str);
        //System.out.println(xx);
    }
}
