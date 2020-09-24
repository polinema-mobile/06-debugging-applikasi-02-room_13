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

        onView(withId(R.id.button1)).perform(click());
        onView(withId(R.id.button_add)).perform(click());
        onView(withId(R.id.button5)).perform(click());
        onView(withId(R.id.button_equal)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("6")));

    }
    @Test
    public void tesKlikKurang(){

        onView(withId(R.id.button9)).perform(click());
        onView(withId(R.id.button_sub)).perform(click());
        onView(withId(R.id.button4)).perform(click());
        onView(withId(R.id.button_equal)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("5")));

    }

    @Test
    public void tesKlikKali(){

        onView(withId(R.id.button5)).perform(click());
        onView(withId(R.id.button_multi)).perform(click());
        onView(withId(R.id.button4)).perform(click());
        onView(withId(R.id.button_equal)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("20")));
    }

    @Test
    public void tesKlikBagi(){

        onView(withId(R.id.button9)).perform(click());
        onView(withId(R.id.button_divide)).perform(click());
        onView(withId(R.id.button3)).perform(click());
        onView(withId(R.id.button_equal)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("3")));
    }

    @Test
    public void tesKlikPara1(){

        onView(withId(R.id.button5)).perform(click());
        onView(withId(R.id.button_para1)).perform(click());
        onView(withId(R.id.button4)).perform(click());
        onView(withId(R.id.button_equal)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("1")));

    }

    @Test
    public void tesKlikPara2(){

        onView(withId(R.id.button4)).perform(click());
        onView(withId(R.id.button_para2)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("-4")));

    }

    @Test
    public void tesKlikHapus(){

        onView(withId(R.id.button8)).perform(click());
        onView(withId(R.id.button_clear)).perform(click());
        onView(withId(R.id.button7)).perform(click());
        onView(withId(R.id.button_add)).perform(click());
        onView(withId(R.id.button3)).perform(click());
        onView(withId(R.id.button_equal)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("10")));
    }


    @Test
    public void tesKlikKoma(){

        onView(withId(R.id.button5)).perform(click());
        onView(withId(R.id.button_dot)).perform(click());
        onView(withId(R.id.button4)).perform(click());
        onView(withId(R.id.button_add)).perform(click());
        onView(withId(R.id.button5)).perform(click());
        onView(withId(R.id.button_dot)).perform(click());
        onView(withId(R.id.button4)).perform(click());
        onView(withId(R.id.button_equal)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("10.8")));
    }

    @Test
    public void tes5kali(){

        onView(withId(R.id.button5)).perform(click());
        onView(withId(R.id.button_add)).perform(click());
        onView(withId(R.id.button4)).perform(click());
        onView(withId(R.id.button_add)).perform(click());
        onView(withId(R.id.button3)).perform(click());
        onView(withId(R.id.button_add)).perform(click());
        onView(withId(R.id.button8)).perform(click());
        onView(withId(R.id.button_add)).perform(click());
        onView(withId(R.id.button6)).perform(click());
        onView(withId(R.id.button_equal)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("26")));
    }
}

