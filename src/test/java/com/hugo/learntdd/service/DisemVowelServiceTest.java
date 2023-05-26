package com.hugo.learntdd.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class DisemVowelServiceTest {
    @Autowired
    DisemVowelService disemVowelService;

    @Test
    void should_return_empty_string_when_disemVowel_with_a() {
        String sentence = "a";

        String result = disemVowelService.disemVowel(sentence);

        assertEquals("", result);
    }

    @Test
    void should_return_empty_b_when_disemVowel_with_b() {
        String sentence = "b";

        String result = disemVowelService.disemVowel(sentence);

        assertEquals("b", result);
    }

    @Test
    void should_return_empty_b_when_disemVowel_with_ab() {
        String sentence = "ab";

        String result = disemVowelService.disemVowel(sentence);

        assertEquals("b", result);
    }

    @Test
    void should_remove_all_vowels_of_string_when_disemVowel() {
        String sentence = "This website is for losers LOL!";

        String result = disemVowelService.disemVowel(sentence);

        assertEquals("Ths wbst s fr lsrs LL!", result);
    }

    @Test
    void should_remove_all_vowels_of_string_when_disemVowel2() {
        String sentence = "No offense but,\nYour writing is among the worst I've ever read";

        String result = disemVowelService.disemVowel(sentence);

        assertEquals("N ffns bt,\nr wrtng s mng th wrst 'v vr rd", result);
    }

    @Test
    void should_remove_all_vowels_of_string_when_disemVowel3() {
        String sentence = "What are you, a communist?";

        String result = disemVowelService.disemVowel(sentence);

        assertEquals("Wht r ,  cmmnst?", result);
    }
}
