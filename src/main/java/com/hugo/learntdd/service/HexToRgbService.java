package com.hugo.learntdd.service;

import org.springframework.stereotype.Service;

@Service
public class HexToRgbService {
    int[] hexStringToRGB(String hex) {
        String redHex = hex.substring(1, 3);
        String greenHex = hex.substring(3, 5);
        String blueHex = hex.substring(5, 7);

        return new int[]{calculateHex(redHex), calculateHex(greenHex), calculateHex(blueHex)};
    }

    private Integer calculateHex(String hex) {
        return (getHexNumber(hex.substring(0, 1)) * 16) + getHexNumber(hex.substring(1, 2));
    }

    private Integer getHexNumber(String oneHex) {
        try {
            return Integer.parseInt(oneHex);
        } catch (NumberFormatException ex) {
            return switch (oneHex.toUpperCase()) {
                case "A":
                    yield 10;
                case "B":
                    yield 11;
                case "C":
                    yield 12;
                case "D":
                    yield 13;
                case "E":
                    yield 14;
                case "F":
                    yield 15;
                default:
                    yield  0;
            };
        }
    }
}
