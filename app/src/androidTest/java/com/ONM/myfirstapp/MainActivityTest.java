package com.ONM.myfirstapp;

import android.content.Context;

import androidx.test.espresso.Espresso;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;


import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static androidx.test.espresso.Espresso.onView;
import static org.junit.Assert.*;

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void checkEmptyEditFields() {

        onView(withId(R.id.editNum1))
                .check((matches(withText(""))));

        onView(withId(R.id.editNum2))
                .check((matches(withText(""))));
    }

    @Test
    public void onClickSumButton1() {
        String num1 = "5";
        String num2 = "3";
        String sum = "8";

        // Type text
        onView(withId(R.id.editNum1))
                .perform(typeText(num1));

        Espresso.closeSoftKeyboard();

        onView(withId(R.id.editNum2))
                .perform(typeText(num2));

        Espresso.closeSoftKeyboard();

        // click sum
        onView(withId(R.id.sumButton))
                .perform(click());

        // verify result
        onView(withId(R.id.resultTextView))
                .check((matches(withText(sum))));
    }

    @Test
    public void onClickSumButtonNegative() {
        String num1 = "2";
        String num2 = "4";
        String sum = "7";

        // Type text
        onView(withId(R.id.editNum1))
                .perform(typeText(num1));

        Espresso.closeSoftKeyboard();

        onView(withId(R.id.editNum2))
                .perform(typeText(num2));

        Espresso.closeSoftKeyboard();

        // click sum
        onView(withId(R.id.sumButton))
                .perform(click());

        // verify result
        onView(withId(R.id.resultTextView))
                .check((matches(withText(sum))));
    }
}