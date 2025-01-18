package org.example

import kotlin.test.Test
import kotlin.test.assertNotNull
import kotlin.test.assertEquals

class AppTest {
    @Test fun appHasAGreeting() {
        val classUnderTest = App()
        assertEquals(classUnderTest.greeting, "Hello World!")
        assertNotNull(classUnderTest.greeting, "app should have a greeting")
    }
}
