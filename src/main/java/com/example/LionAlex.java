package com.example;
import java.util.List;

public class LionAlex extends Lion {
    public LionAlex(Feline feline) throws Exception {
        super("Самец", feline);
    }

    @Override
    public int getKittens () {
        return 0;
    }

    public List<String> getLionAlexFriends() {
        return List.of("Тимон", "Пумба", "Симба");
    }

    public String getLionAlexLocation() {
        return "Мадагаскар";
    }
}
