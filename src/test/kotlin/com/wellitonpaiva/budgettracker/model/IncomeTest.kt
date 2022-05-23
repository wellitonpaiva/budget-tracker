package com.wellitonpaiva.budgettracker.model

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import java.time.Month
import java.time.YearMonth

internal class IncomeTest {

    @Test
    internal fun `should create new income`() {
        val yearMonth = YearMonth.of(2022, Month.JANUARY)
        val incomeValue = 100
        assertThat(Income(yearMonth, incomeValue)).matches {
            it.income == incomeValue &&
            it.yearMonth == yearMonth
        }
    }

    @Test
    internal fun `should error when income is negative`() {
        val yearMonth = YearMonth.of(2022, Month.JANUARY)
        val incomeValue = -100
        assertThrows<IllegalArgumentException> { Income(yearMonth, incomeValue) }
    }
}