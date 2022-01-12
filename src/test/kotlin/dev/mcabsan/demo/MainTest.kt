package dev.mcabsan.demo

import kotlin.test.assertEquals
import org.junit.jupiter.api.Test

class MainTest {
  @Test
  fun `it should greet successfully`() {
    val expected = "Welcome to kotlin skeleton!!"
    assertEquals(expected, Main().greet())
  }
}
