package com.example.myapplication

import org.junit.Assert.*
import org.junit.Test

class ExampleUnitTest {

	private val minMax = MinMax()

	@Test
	fun checkMinBetween3And6() {
		val first = 3
		val second = 6
		val expected = 3

		val actual = minMax.min(first, second)

		assertEquals(expected, actual)
	}

	@Test
	fun checkMinBetween4And4() {
		val first = 4
		val second = 4
		val expected = 4

		val actual = minMax.min(first, second)

		assertEquals(expected, actual)
	}

	@Test
	fun checkMinBetween7And2() {
		val first = 7
		val second = 2
		val expected = 2

		val actual = minMax.min(first, second)

		assertEquals(expected, actual)
	}

	@Test
	fun checkMinBetween0And4() {
		val first = 0
		val second = 4
		val expected = 0

		val actual = minMax.min(first, second)

		assertEquals(expected, actual)
	}

	@Test
	fun checkMaxBetween3And6() {
		val first = 3
		val second = 6
		val expected = 6

		val actual = minMax.max(first, second)

		assertEquals(expected, actual)
	}

	@Test
	fun checkMaxBetween4And4() {
		val first = 4
		val second = 4
		val expected = 4

		val actual = minMax.max(first, second)

		assertEquals(expected, actual)
	}

	@Test
	fun checkMaxBetween7And2() {
		val first = 7
		val second = 2
		val expected = 7

		val actual = minMax.max(first, second)

		assertEquals(expected, actual)
	}

	@Test
	fun checkMaxBetween0And4() {
		val first = 0
		val second = 4
		val expected = 4

		val actual = minMax.max(first, second)

		assertEquals(expected, actual)
	}
}