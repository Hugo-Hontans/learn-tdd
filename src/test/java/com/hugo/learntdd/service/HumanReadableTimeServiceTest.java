package com.hugo.learntdd.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
public class HumanReadableTimeServiceTest {
    @Autowired
    HumanReadableTimeService humanReadableTimeService;

    @Test
    void should_return_readable_string_when_makeReadable_with_0() {
        int seconds = 0;

        String result = humanReadableTimeService.makeReadable(seconds);

        assertThat(result).isEqualTo("00:00:00");
    }

    @Test
    void should_return_readable_string_when_makeReadable_with_5() {
        int seconds = 5;

        String result = humanReadableTimeService.makeReadable(seconds);

        assertThat(result).isEqualTo("00:00:05");
    }

    @Test
    void should_return_readable_string_when_makeReadable_with_60() {
        int seconds = 60;

        String result = humanReadableTimeService.makeReadable(seconds);

        assertThat(result).isEqualTo("00:01:00");
    }

    @Test
    void should_return_readable_string_when_makeReadable_with_86399() {
        int seconds = 86399;

        String result = humanReadableTimeService.makeReadable(seconds);

        assertThat(result).isEqualTo("23:59:59");
    }

    @Test
    void should_return_readable_string_when_makeReadable_with_359999() {
        int seconds = 359999;

        String result = humanReadableTimeService.makeReadable(seconds);

        assertThat(result).isEqualTo("99:59:59");
    }

    @Test
    void should_return_readable_string_when_makeReadable_with_negative_number() {
        int seconds = -5;

        String result = humanReadableTimeService.makeReadable(seconds);

        assertThat(result).isEqualTo("00:00:00");
    }

    @Test
    void should_return_readable_string_when_makeReadable_with_379999() {
        int seconds = 379999;

        String result = humanReadableTimeService.makeReadable(seconds);

        assertThat(result).isEqualTo("99:59:59");
    }
}
