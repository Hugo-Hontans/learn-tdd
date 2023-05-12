package com.hugo.learntdd.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
public class VowelCountServiceTest {
    @Autowired
    private VowelCountService vowelCountService;

    @Test
    void should_return_1_when_countVowels_with_a() {
        String sentence = "a";

        int result = vowelCountService.countVowels(sentence);

        assertThat(result).isEqualTo(1);
    }

    @Test
    void should_return_2_when_countVowels_with_aa() {
        String sentence = "aa";

        int result = vowelCountService.countVowels(sentence);

        assertThat(result).isEqualTo(2);
    }

    @Test
    void should_return_3_when_countVowels_with_aaa() {
        String sentence = "aaa";

        int result = vowelCountService.countVowels(sentence);

        assertThat(result).isEqualTo(3);
    }

    @Test
    void should_return_3_when_countVowels_with_aab() {
        String sentence = "aab";

        int result = vowelCountService.countVowels(sentence);

        assertThat(result).isEqualTo(2);
    }

    @Test
    void should_return_0_when_countVowels_with_pmlkjh() {
        String sentence = "pmlkjh";

        int result = vowelCountService.countVowels(sentence);

        assertThat(result).isEqualTo(0);
    }

    @Test
    void should_return_6_when_countVowels_with_palejihomupy() {
        String sentence = "palejihomupy";

        int result = vowelCountService.countVowels(sentence);

        assertThat(result).isEqualTo(6);
    }
}
