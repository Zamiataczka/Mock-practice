import com.example.Feline;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {
    Feline feline;

    @Before
    public void init() {
        feline = new Feline();
    }

    @Test //Проверка Feline = "Кошачьи"
    public void getFamilyFelineTest() {
        String family = "Кошачьи";
        assertEquals(family, feline.getFamily());
    }

    @Test //Проверка метода getKittens()
    public void getKittensFelineTest() {
        assertEquals(1, feline.getKittens());
    }

    @Test //Проверка метода getKittens(3)
    public void getKittensWithDifferentCount() {
        assertEquals(3, feline.getKittens(3));
    }

    @Test //Проверкат метода eatMeat() на вывод нужного рациона
    public void getFelineRation() throws Exception {
        List<String> felineRation = List.of("Животные", "Птицы", "Рыба");
        assertEquals(felineRation, feline.eatMeat());
    }
}
