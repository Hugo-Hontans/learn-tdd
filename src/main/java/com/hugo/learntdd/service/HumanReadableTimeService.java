package com.hugo.learntdd.service;

import org.springframework.stereotype.Service;

@Service
public class HumanReadableTimeService {
    String makeReadable(int seconds) {
        if (seconds > 359999) {
            return "99:59:59";
        }
        int quotientMinutes = seconds / 60;
        int resteSecondes = seconds % 60;

        int quotientHeures = quotientMinutes / 60;
        int resteMinutes = quotientMinutes % 60;

        String formattedQuotientHeures = formatNumber(quotientHeures);
        String formattedResteMinutes = formatNumber(resteMinutes);
        String formattedResteSecondes = formatNumber(resteSecondes);

        return String.format("%s:%s:%s", formattedQuotientHeures, formattedResteMinutes, formattedResteSecondes);
    }

    private String formatNumber(int number) {
        if (number < 1) {
            return "00";
        } else if (number <= 9) {
            return String.format("0%d", number);
        } else {
            return String.format("%d", number);
        }
    }
}