package com.example.myapplication

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest {
    @Test
    fun `empty username returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "",
            "12345678",
            "12345678"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `valid username and correctly repeated password returns true`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Mahmoud",
            "12345678",
            "12345678"
        )
        assertThat(result).isTrue()
    }


    @Test
    fun `username already exists returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Kareem",
            "12345678",
            "12345678"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `empty password returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Mahmoud",
            "",
            ""
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `password repeated incorrectly returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Mahmoud",
            "12345678",
            "123456789asc"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `password less than 8 digits returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Mahmoud",
            "1234",
            "1234"
        )
        assertThat(result).isFalse()
    }

}