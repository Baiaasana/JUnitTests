package com.example.testing

import com.example.testing.utils.RegistrationUtil
import org.junit.Assert.assertEquals
import org.junit.Test


class RegistrationUtilTest {

    // not use Before annotation so we have some instances of same class

    @Test
    fun `if user name is empty return false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "",
            password = "1234",
            confirmPassword = "1234"
        )
        assertEquals(false, result)
    }

    @Test
    fun `valid user name and correctly repeated password return true`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Baia",
            password = "1234",
            confirmPassword = "1234"
        )
        assertEquals(true, result)
    }

    @Test
    fun `user name already exist return false`() {

        val result = RegistrationUtil.validateRegistrationInput(
            "Nick",
            password = "1234",
            confirmPassword = "1234"
        )

        assertEquals(false, result)
    }

    @Test
    fun `password is empty return false`() {

        val result = RegistrationUtil.validateRegistrationInput(
            "Nickolai",
            password = "",
            confirmPassword = ""
        )

        assertEquals(false, result)
    }

    @Test
    fun `password was repeated incorrectly return false`() {

        val result = RegistrationUtil.validateRegistrationInput(
            "Nickolai",
            password = "Abcabc",
            confirmPassword = "123123"
        )

        assertEquals(false, result)
    }

    @Test
    fun `password contain less than 2 digit return false`() {

        val result = RegistrationUtil.validateRegistrationInput(
            "Nickolai",
            password = "Abcabc1",
            confirmPassword = "Abcabc1"
        )

        assertEquals(false, result)
    }
}
