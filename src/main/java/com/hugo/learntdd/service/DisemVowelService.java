package com.hugo.learntdd.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DisemVowelService {
    private final List<String> CHARS_TO_REMOVE = List.of("a", "e", "i", "o", "u", "y");

    String disemVowel(String sentence) {
        String[] splitedSentence = sentence.split("");
        String newString = "";
        for (String currentChar: splitedSentence) {
            if (!CHARS_TO_REMOVE.contains(currentChar) && !CHARS_TO_REMOVE.contains(currentChar.toLowerCase())) {
                newString += currentChar;
            }
        }
        return newString;
    }
}
