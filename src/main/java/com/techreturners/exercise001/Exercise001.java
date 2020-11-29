package com.techreturners.exercise001;

import java.util.List;

public class Exercise001 {
    public String capitalizeWord(String word) {         
            String words[]= word.split("\\s");  
            String capitalizeWord="";  
            for(String w:words){  
                String first=w.substring(0,1);  
                String afterfirst=w.substring(1);  
                capitalizeWord += first.toUpperCase()+afterfirst+" ";  
            }  
            return capitalizeWord.trim();  
    }

    public String generateInitials(String firstName, String lastName) {
        // Add your code here
        return firstName.substring(0,1)+"."+lastName.substring(0,1);
    }

    public double addVat(double originalPrice, double vatRate) {
        // Add your code here
        double vatAmount = (originalPrice * vatRate)/100;
        double roundedValue = Math.round((originalPrice+vatAmount)*100)/100.0;
        return roundedValue;
    }

    public String reverse(String sentence) {
        // Add your code here
        if (sentence.isEmpty())
            return sentence;

        return reverse(sentence.substring(1)) + sentence.charAt(0);
  }
 

    public int countLinuxUsers(List<User> users) {
        // Add your code here
        return 0;
    }
}
