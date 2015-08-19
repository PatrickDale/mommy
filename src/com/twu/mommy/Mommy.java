package com.twu.mommy;

public class Mommy {

    private static final String VOWELS = "aeiou";

    public String runMommy(String mommy) {
        double count = 0;
        String result = "";

        for (int i = 0; i < mommy.length(); i++) {

            if (!VOWELS.contains(Character.toString(mommy.charAt(i)))){
                result += mommy.charAt(i);
            } else {
                result += "mommy";
                count += 1;
            }
        }

        if (count / mommy.length() >= 0.3) {
            return result;
        }
        return mommy;
    }
}
