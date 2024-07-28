import com.example.Animal;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

@RunWith(Parameterized.class)
public class AnimalTest {
    private final String animalKind;
    private final List<String> expectedList;
    Animal animal;

    public AnimalTest(String animalKind, List<String> expectedList) {
        this.animalKind = animalKind;
        this.expectedList = expectedList;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][] {
                {"Травоядное", List.of("Трава", "Различные растения")},
                {"Хищник", List.of("Животные", "Птицы", "Рыба")},
                {"Рыба", List.of("Водоросли", "Черви", "Мошки")}
        };
    }

    @Before
    public void initAnimal() {
        animal = new Animal();
    }

    @Test
    public void getAnimalFoodTest () {
        try {
            List<String> actualList = animal.getFood(animalKind);
            Assert.assertEquals(expectedList, actualList);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }

    @Test
    public void getAnimalFamily () {
        String actual = animal.getFamily();
        String expected = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void AnimalExpectedExceptionTest() {
        Animal animal = new Animal();
        Exception exception = assertThrows(Exception.class, () -> animal.getFood("Рыба"));
        assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник", exception.getMessage());
    }
}


