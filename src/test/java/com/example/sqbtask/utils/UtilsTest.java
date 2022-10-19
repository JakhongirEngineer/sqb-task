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

    @ParameterizedTest
    @ValueSource(strings = { "9981234567891234", "1991234568091234", "99991234567843334", "9991o34567895255"})
    @DisplayName("tests invalid wallet numbers")
    void isWalletNumberCorrectWithInvalidInput(String walletNumber) {
        boolean res = Utils.isWalletNumberCorrect(walletNumber);
        assertFalse(res);
    }

    @ParameterizedTest
    @ValueSource(strings = { "9991234567891234", "9991234568091234", "9991234567843334", "9991234567895255" })
    @DisplayName("tests valid wallet numbers")
    void isWalletNumberCorrectWithValidInput(String walletNumber) {
        boolean res = Utils.isWalletNumberCorrect(walletNumber);
        assertTrue(res);
    }
}