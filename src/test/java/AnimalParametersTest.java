import com.example.Animal;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;
@RunWith(Parameterized.class)
public class AnimalParametersTest {
    private final String animalKind;
    private final List<String> expectedList;
    Animal animal;

    public AnimalParametersTest(String animalKind, List<String> expectedList) {
        this.animalKind = animalKind;
        this.expectedList = expectedList;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][]{
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
    public void getAnimalFoodTest() {
        try {
            List<String> actualList = animal.getFood(animalKind);
            Assert.assertEquals(expectedList, actualList);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }

    @Test
    public void getAnimalFamily() {
        String actual = animal.getFamily();
        String expected = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        Assert.assertEquals(expected, actual);
    }
}
