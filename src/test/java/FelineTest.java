package com.example;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Test
    public void getEatMeatPredator() throws Exception {
        Feline feline = new Feline();

        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        List<String> actualResult = feline.eatMeat();

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getCatFamily() {
        Feline feline = new Feline();

        String expectedResult = "Кошачьи";
        String actualResult = feline.getFamily();

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getFiveKittens() {
        Feline feline = new Feline();

        int expectedResult = 5;
        int actualResult = feline.getKittens(5);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getOneKitten() {
        Feline feline = new Feline();

        int expectedResult = 1;
        int actualResult = feline.getKittens();

        assertEquals(expectedResult, actualResult);
    }
}