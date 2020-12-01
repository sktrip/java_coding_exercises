package com.techreturners.exercise001;

import java.util.List;

public class Exercise001 {
    public String capitalizeWord(String word) {
        return Character.toUpperCase(word.charAt(0)) + word.substring(1);
    }

    public String generateInitials(String firstName, String lastName) {
        return firstName.substring(0, 1) + "." + lastName.substring(0, 1);
    }

    public double addVat(double originalPrice, double vatRate) {
        double vatAmount = (originalPrice * vatRate) / 100;
        double roundedValue = Math.round((originalPrice + vatAmount) * 100) / 100.0;
        return roundedValue;
    }

    public String reverse(String sentence) {
        if (sentence.isEmpty())
            return sentence;
        return reverse(sentence.substring(1)) + sentence.charAt(0);
    }

    public int countLinuxUsers(List<User> users) {
        int count = 0;
        for (User user : users) {
            if (user.getType().equals("Linux")) {
                count++;
            }
        }
        return count;
    }
}
