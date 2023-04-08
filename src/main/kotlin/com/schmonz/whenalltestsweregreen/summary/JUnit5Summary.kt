package com.schmonz.whenalltestsweregreen.summary

import org.junit.platform.launcher.TestIdentifier
import org.junit.platform.launcher.TestPlan

class JUnit5Summary(testPlan: TestPlan, internal val anyTestsRed: Boolean, internal val anyTestsGreen: Boolean) {
    internal val testCount = testPlan.countTestIdentifiers(TestIdentifier::isTest)

    init {
        if (System.getProperty("WHENALLTESTSWEREGREEN_SUMMARY") != null) {
            println(
                "total tests: ${this.testCount}\nany green: $anyTestsGreen\nany red: $anyTestsRed\n",
            )
        }
    }
}
