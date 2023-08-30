package org.rozfix.cleverbank.util.generator;

public class NumberGenerator {

    public static String generateAccountNumber(){
        StringBuilder number = new StringBuilder(10);
        for (int i = 0; i < 10; i++) {
            int randomIndex = (int) (Math.random() * 10);
            number.append(randomIndex);
        }
        return number.toString();
    }
}
