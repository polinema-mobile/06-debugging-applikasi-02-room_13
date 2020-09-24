# Elegant_Calculator
Features - 
1) Responsive UI.
2) It can perform all basic operations.
3) IOS like UI.

[![Calculator-Screenshot.png](https://i.postimg.cc/nzqysW22/Calculator-Screenshot.png)](https://postimg.cc/phXG4qg5)

**Hasil Testing**
![Hasil Test](/HasilTest.jpg)

## Bugs
**Force Close jika menginput comma lalu equals**
```
@Test
    public void bug1(){
        onView(withId(R.id.button_dot)).perform(click());
        onView(withId(R.id.button_equal)).perform(click());
    }
```

**Force Close jika menginput angka lalu para1(%) lalu para2(+-)**
```
@Test
    public void bug2(){
        onView(withId(R.id.button5)).perform(click()); //All number
        onView(withId(R.id.button_para1)).perform(click());
        onView(withId(R.id.button_para2)).perform(click());
    }
```

**Force Close jika menginput angka lalu para2(+-) lalu para1(%)**
```
@Test
    public void bug3(){
        onView(withId(R.id.button5)).perform(click()); //All number
        onView(withId(R.id.button_para2)).perform(click());
        onView(withId(R.id.button_para1)).perform(click());
    }
```

**Force Close jika menginput angka lalu para2(+-) lalu para2(+-)**
```
@Test
    public void bug4(){
        onView(withId(R.id.button5)).perform(click()); //All number
        onView(withId(R.id.button_para2)).perform(click());
        onView(withId(R.id.button_para2)).perform(click());
    }
```
