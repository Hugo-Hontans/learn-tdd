package com.hugo.learntdd.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VowelCountService {
    private final List<String> CHARS_TO_COUNT = List.of("a", "e", "i", "o", "u", "y");

    int countVowels(String sentence) {
        String[] splitedSentence = sentence.split("");
        int counter = 0;
        for (String currentChar: splitedSentence) {
            if (CHARS_TO_COUNT.contains(currentChar)) {
                counter++;
            }
        }
        return counter;
    }
}
