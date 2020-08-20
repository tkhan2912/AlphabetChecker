package com.sparta.tk;

public class AlphabetChecker {
    public boolean isAllInAlphabet(String sentenceToCheck){
        sentenceToCheck = sentenceToCheck.replaceAll("\\s", "");
        sentenceToCheck = sentenceToCheck.toLowerCase();
        for(char letter = 'a'; letter <= 'z'; letter++){
            if(!sentenceToCheck.contains(String.valueOf(letter))){
                return false;
            }
        }
        return true;
    }

}
