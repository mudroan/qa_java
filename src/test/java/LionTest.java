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
public class LionTest {
    @Mock
    Feline feline;

    @Test
    public void getFiveKittens() throws Exception {
        Lion lion = new Lion("Самка", feline);

        int expectedResult = 5;
        when(feline.getKittens()).thenReturn(expectedResult);
        int actualResult = lion.getKittens();

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getFoodForMale() throws Exception {
        Lion lion = new Lion("Самец", feline);

        List<String> expectedResult = Arrays.asList("Животные", "Птицы", "Рыба");
        when(feline.getFood("Хищник")).thenReturn(expectedResult);
        List<String> actualResult = lion.getFood();

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getFoodForFemale() throws Exception {
        Lion lion = new Lion("Самка", feline);

        List<String> expectedResult = Arrays.asList("Животные", "Птицы", "Рыба");
        when(feline.getFood("Хищник")).thenReturn(expectedResult);
        List<String> actualResult = lion.getFood();

        assertEquals(expectedResult, actualResult);
    }
}