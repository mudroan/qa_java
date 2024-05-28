package com.example;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

@RunWith (Parameterized.class)
public class LionParameterizedTest {

    String sex;
    boolean expectedResult;

    @Parameterized.Parameters
    public static Object[][] data () {
        return new Object [][] {
                {"Самец", true},
                {"Самка", false}
        };
    }

    public LionParameterizedTest (String sex, boolean expectedResult) {
        this.sex = sex;
        this.expectedResult = expectedResult;
    }

    @Test
    public void doesHaveMane() throws Exception {
        Feline feline = new Feline ();
        Lion lion = new Lion(sex, feline);
        assertEquals (expectedResult, lion.doesHaveMane());
    }
}
