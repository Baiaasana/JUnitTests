package com.example.testing

import androidx.test.platform.app.InstrumentationRegistry
import com.example.testing.utils.ResourceComparer
import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

//tests in com(android test) run on emulator only
class ResourceCompareTest {

    private lateinit var resourceComparer : ResourceComparer

    // @Before run before each test we'll have a new instance
    // resourceComparer for each test and now they don’t rely on that same instance anymore
    @Before
    fun setUp(){
        resourceComparer = ResourceComparer()
    }

    // Methods annotated with the @Before annotation are run after each test.
    @After
    fun tearDown(){
        // destroy obj
        // close open db
        // resetting variable
    }

    @Test
    fun stringResourceAsGivenString_returnTrue() {
        val context = InstrumentationRegistry.getInstrumentation().targetContext
        val result = resourceComparer.isEqual(context, R.string.username, "<<Username>>")

        assertEquals(result, true)
    }

    @Test
    fun stringResourceIsNotSameAsGivenString_returnFalse(){
        val context = InstrumentationRegistry.getInstrumentation().targetContext
        val result = resourceComparer.isEqual(context, R.string.password, "not equal password")

        assertEquals(result, false)
    }

}