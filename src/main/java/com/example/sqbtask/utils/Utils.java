package com.example.sqbtask.utils;

import org.springframework.stereotype.Component;

import java.util.regex.Pattern;

@Component
public  class Utils {
    private static final String regexPatternForEPP = "^\\+[0-9]{1,3}\\.[0-9]{4,14}(?:x.+)?$"; // regex for international phone number checking
    private static final Pattern patternForEPP = Pattern.compile(regexPatternForEPP);

    private static boolean isPhoneCorrect(String number) {
        return patternForEPP.matcher(number).matches();
    }

    private static boolean isWalletNumberCorrect(String walletNumber) {
        // walletNumber: XY where X = 999 and Y = 13 digits
        if (walletNumber.length() != 16) return false;
        for (int i = 0; i < walletNumber.length(); i++) {
            char ch = walletNumber.charAt(i);
            if (!Character.isDigit(ch)) {
                return false;
            }
            if (i < 3) {
                if (ch != '9') return false;
            }
        }
        return true;
    }

}
