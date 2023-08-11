package com.hugo.learntdd.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
public class HexToRgbServiceTest {
    @Autowired
    HexToRgbService hexToRgbService;

    @Test
    void should_return_17_17_17_when_hexStringToRGB_with_111111() {
        String hex = "#111111";

        int[] result = hexToRgbService.hexStringToRGB(hex);

        assertThat(result).isEqualTo(new int[]{17, 17, 17});
    }

    @Test
    void should_return_0_0_0_when_hexStringToRGB_with_000000() {
        String hex = "#000000";

        int[] result = hexToRgbService.hexStringToRGB(hex);

        assertThat(result).isEqualTo(new int[]{0, 0, 0});
    }

    @Test
    void should_return_255_153_51_when_hexStringToRGB_with_FF9933() {
        String hex = "#FF9933";

        int[] result = hexToRgbService.hexStringToRGB(hex);

        assertThat(result).isEqualTo(new int[]{255, 153, 51});
    }

    @Test
    void should_return_190_173_237_when_hexStringToRGB_with_beaded() {
        String hex = "#beaded";

        int[] result = hexToRgbService.hexStringToRGB(hex);

        assertThat(result).isEqualTo(new int[]{190, 173, 237});
    }

    @Test
    void should_return_250_52_86_when_hexStringToRGB_with_Fa3456() {
        String hex = "#Fa3456";

        int[] result = hexToRgbService.hexStringToRGB(hex);

        assertThat(result).isEqualTo(new int[]{250, 52, 86});
    }
}
