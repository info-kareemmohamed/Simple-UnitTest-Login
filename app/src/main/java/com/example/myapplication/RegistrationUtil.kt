package com.example.myapplication

object RegistrationUtil {

    private val existingUsers = listOf("Kareem", "Mohamed")

    /**
     * the input is not valid if ...
     * ... the username/password is empty
     * ... the username is already taken
     * ... the confirmed password is not the same as the real password
     * ... the password contains less than 8 digits
     */

    fun validateRegistrationInput(
        username: String,
        password: String,
        confirmPassword: String
    ): Boolean {
        return when {
            username.isEmpty() -> false
            password.isEmpty() || confirmPassword.isEmpty() -> false
            username in existingUsers -> false
            password != confirmPassword -> false
            password.length < 8 -> false
            else -> true
        }
    }
}