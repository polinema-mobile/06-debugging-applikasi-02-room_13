package com.example.new_sample;

import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class TesKlikOperasi {
    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void tesKlikTambah(){
        //cari id button1 terus di klik
        onView(withId(R.id.button1)).perform(click());
        onView(withId(R.id.button_add)).perform(click());
        onView(withId(R.id.button5)).perform(click());
        onView(withId(R.id.button_equal)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("6")));

    }
    @Test
    public void tesKlikKurang(){
        //cari id button1 terus di klik
        onView(withId(R.id.button9)).perform(click());
        onView(withId(R.id.button_sub)).perform(click());
        onView(withId(R.id.button4)).perform(click());
        onView(withId(R.id.button_equal)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("5")));

    }
}
