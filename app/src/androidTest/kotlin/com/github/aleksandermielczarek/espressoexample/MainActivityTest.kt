package com.github.aleksandermielczarek.espressoexample

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.isDisplayed
import android.support.test.espresso.matcher.ViewMatchers.withText
import android.support.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.Test

class MainActivityTest {

    @JvmField
    @Rule
    val activityRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun titleIsDisplayed() {
        onView(withText("EspressoExample")).check(matches(isDisplayed()))
    }
}