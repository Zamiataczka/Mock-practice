import com.example.Feline;
import com.example.LionAlex;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

    public class LionAlexTest {
        Feline feline;
        LionAlex lionAlex;

        @Before
        public void init() throws Exception {
            lionAlex = new LionAlex(feline);
        }

        @Test
        public void getKittensTest() {
            assertEquals(0, lionAlex.getKittens());
        }

        @Test
        public void getLionAlexFriendsTest() {
            assertEquals(List.of("Тимон", "Пумба", "Симба"), lionAlex.getLionAlexFriends());
        }

        @Test
        public void getLionAlexLocationTest () {
            assertEquals("Мадагаскар", lionAlex.getLionAlexLocation());
        }
    }
