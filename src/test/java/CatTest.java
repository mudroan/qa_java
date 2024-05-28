package com.example;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;


@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline feline;

    @Test
    public void getSoundCat() {
        Cat cat = new Cat(feline);

        String expectedResult = "Мяу";
        String actualResult = cat.getSound();

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getFoodPredator() throws Exception {
        Cat cat = new Cat(feline);

        List<String> expectedResult = Arrays.asList("Животные", "Птицы", "Рыба");
        when(feline.eatMeat()).thenReturn(expectedResult);
        List<String> actualResult = cat.getFood();

        assertEquals(expectedResult, actualResult);
    }
}