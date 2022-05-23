package com.wellitonpaiva.budgettracker.model

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import java.time.Month
import java.time.YearMonth

internal class IncomeTest {

    @Test
    internal fun `should create new income`() {
        val yearMonth = YearMonth.of(2022, Month.JANUARY)
        val incomeValue = 100
        assertThat(Income(yearMonth, incomeValue)).matches {
            it.incomeValue == incomeValue &&
            it.yearMonth == yearMonth
        }
    }
}