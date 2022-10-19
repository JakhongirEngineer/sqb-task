package com.example.sqbtask.utils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UtilsTest {

    @ParameterizedTest
    @ValueSource(strings = { "++998991234567", "+9909909090909090909090", "+999o000000000" })
    @DisplayName("tests invalid phone numbers")
    void isPhoneCorrectWithIncorrectValues(String phoneNumber) {
        boolean res = Utils.isPhoneCorrect(phoneNumber);
        assertFalse(res);
    }

    @ParameterizedTest
    @ValueSource(strings = { "+998991234567", "+998914050202", "+14842634658", "+16102458166" })
    @DisplayName("tests valid phone numbers")
    void isPhoneCorrectWithCorrectValues(String phoneNumber) {
        boolean res = Utils.isPhoneCorrect(phoneNumber);
        assertTrue(res);
    }

    @Test
    void isWalletNumberCorrect() {

    }
}