package org.example;

import java.util.ArrayList;
import java.util.List;

public class RuGame extends AbstractGame {

    @Override
    public List<String> generateCharList() {
        List<String> res = new ArrayList<>();

        for (int i = 'а'; i <= 'я'; i++) {
            res.add(String.valueOf((char) i));
        }
        res.add("ё");


        return res;
    }
}
