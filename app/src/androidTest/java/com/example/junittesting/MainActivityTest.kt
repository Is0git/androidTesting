package com.example.junittesting

import androidx.test.espresso.Espresso
import androidx.test.espresso.ViewAssertion
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class MainActivityTest {
    @Rule
    @JvmField
    val rule =  ActivityTestRule(MainActivity::class.java)

    @Test
    fun check_calculation_result() {
        Espresso.onView(withId(R.id.number1))
            .perform(typeText("2"))
                .perform(closeSoftKeyboard())
        Espresso.onView(withId(R.id.number2)) .perform(typeText("6"))
            .perform(closeSoftKeyboard())
        Espresso.onView(withId(R.id.calculate)).perform(click())
        Espresso.onView(withId(R.id.result)).check(matches(withText("2")))
    }

}