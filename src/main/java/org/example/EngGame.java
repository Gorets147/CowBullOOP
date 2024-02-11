package org.example;

import java.util.ArrayList;
import java.util.List;

public class EngGame extends AbstractGame{
    @Override
    public List<String> generateCharList() {
        List<String> res = new ArrayList<>();

        for (int i = 'a'; i <= 'z'; i++) {
            res.add(String.valueOf((char) i));
        }


        return res;
    }
}
