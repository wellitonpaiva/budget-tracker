package com.wellitonpaiva.budgettracker.model

import java.time.YearMonth

data class Income(val yearMonth: YearMonth, val income: Int) {
    init {
        if(income < 0)
            throw IllegalArgumentException("Income should be greater than zero")
    }
}
