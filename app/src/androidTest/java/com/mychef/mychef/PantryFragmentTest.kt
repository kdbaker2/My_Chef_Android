package com.mychef.mychef

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.rule.ActivityTestRule

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Rule
import java.util.regex.Pattern.matches

@RunWith(AndroidJUnit4::class)
class PantryFragmentTest {
    @Rule
    @JvmField
    val rule: ActivityTestRule<MainActivity> = ActivityTestRule(MainActivity::class.java)
    @Test
    fun checkAdd() {
        onView(withId(R.id.imageButton)).perform(click())
        onView(withId(R.id.miFavorites)).perform(click())
        onView(withId(R.id.miPantry)).perform(click())
        onView(withId(R.id.miPantry)).check(matches(withText("Quantity: 1")))
    }
    @Test
    fun checkSub() {
        onView(withId(R.id.minusButton)).perform(click())
        onView(withId(R.id.miFavorites)).perform(click())
        onView(withId(R.id.miPantry)).perform(click())
        onView(withId(R.id.miPantry)).check(matches(withText("Quantity: 0")))
    }
}