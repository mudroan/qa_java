package com.example;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

@RunWith (Parameterized.class)
public class LionExceptionParameterizedTest {

    String sex;

    @Parameterized.Parameters
    public static Object[][] data () {
        return new Object [][] {
                {"Unknown"},
                {null}
        };
    }

    public LionExceptionParameterizedTest (String sex) {
        this.sex = sex;
    }

    @Test (expected = Exception.class)
    public void doesHaveMane() throws Exception {
        Feline feline = new Feline ();
        Lion lion = new Lion(sex, feline);
    }
}
