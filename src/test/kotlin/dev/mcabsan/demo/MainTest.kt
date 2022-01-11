package dev.mcabsan.demo

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class MainTest {
    @Test
    fun `it should greet successfully`() {
        val expected = "Welcome to kotlin skeleton!!"
        assertEquals(expected, Main().greet())
    }
}