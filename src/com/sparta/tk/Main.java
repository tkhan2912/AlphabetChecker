package com.sparta.tk;

public class Main {
/*Alphabet Checker - Write a program that checks a String. It should return true if the String
contains every letter of the Alphabet. The program does not check for case or is concerned with
how many times a letter appears.
The method will return true if the String contains at least one instance of all 26 letters of the Alphabet
in any case (upper or lower)
 */
    public static void main(String[] args) {
        AlphabetChecker checkSentence = new AlphabetChecker();
        //System.out.println(checkSentence.alphabetCheck(sentence));
        System.out.println(checkSentence.isAllInAlphabet("The quick brown fox jumps over the lazy dog"));

    }
}
