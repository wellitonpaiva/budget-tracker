package com.wellitonpaiva.budgettracker

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BudgetTrackerApplication

fun main(args: Array<String>) {
	runApplication<BudgetTrackerApplication>(*args)
}
