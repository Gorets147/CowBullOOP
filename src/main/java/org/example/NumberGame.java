package org.example;

import java.util.ArrayList;
import java.util.List;

public class NumberGame extends AbstractGame{
    @Override
    public List<String> generateCharList() {
        List<String> res = new ArrayList<>();
        for (int i = 0; i <= 9; i++){
            res.add(String.valueOf(i));
        }
        return res;
    }
}
